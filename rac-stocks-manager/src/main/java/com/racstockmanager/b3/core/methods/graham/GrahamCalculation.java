package com.racstockmanager.b3.core.methods.graham;

import com.racstockmanager.b3.core.model.stock.*;
import com.racstockmanager.b3.core.utils.CalculatorUtils;
import com.racstockmanager.b3.core.utils.CurrencyUtils;
import org.springframework.stereotype.Service;

@Service
public class GrahamCalculation extends CalculatorUtils {

    /* Graham Calculation
      Video: https://www.youtube.com/watch?v=HyBDDcanroE
      Reference: https://investidor10.com.br/acoes/rankings/acoes-mais-baratas-benjamin-graham/
      Calculator percentage: https://www.4devs.com.br/calculadora_porcentagem
      VI = √22,5 x LPA x VPA
      P/L até 15x safety margin
      P/VP até 1,5 safety margin
   */
    public StockMethod execute(Stock stock, Valuations valuations) {

        if (validateNegativeValues(valuations)) {
            return StockMethod.builder()
                    .isValid(false)
                    .description("No safety margin: LPA / VPA less than zero")
                    .maximumPrice(CurrencyUtils.convertDoubleToBRL(0.0))
                    .upside(0.0)
                    .upsideFormatted("0%")
                    .build();
        }

        final Double intrinsicValue = Math.sqrt(22.5 * (valuations.lpa() * valuations.vpa()));
        final String intrinsicValueFormatted = CurrencyUtils.convertDoubleToBRL(intrinsicValue);

        //final Double upside = (intrinsicValue / valuations.currentValue() - 1) * 100;
        Double upside = calculateUpside(valuations.currentValue(), intrinsicValue);

        GrahamValidation grahamValidation = isValid(stock, valuations, intrinsicValue);
        return StockMethod.builder()
                .isValid(grahamValidation.isValid())
                .description(grahamValidation.message())
                .maximumPrice(intrinsicValueFormatted)
                .upside(upside)
                .upsideFormatted(convertDoubleToPercentage(upside))
                .build();

    }

    private GrahamValidation isValid(Stock stock, Valuations valuations, Double intrinsicValue) {
        return validateSafetyMargin(stock, valuations);
        //GrahamValidation grahamValidation = validatePriceIsPositive(valuations.currentValue(), intrinsicValue);
    }

    public GrahamValidation validateSafetyMargin(Stock stock, Valuations valuations) {
        if (containsSegment(stock, Sector.TECNOLOGIA_DA_INFORMACAO.getName()) || containsSegment(stock, Segment.VAREJO.name())) {
            Boolean isValid = valuations.pl() > 20.00 || valuations.pVp() > 3.5;
            if (isValid) {
                return new GrahamValidation(true, "Maximum price below of current value");
            }
            return new GrahamValidation(false, "Segment of Technology/Varejo with PL or pVp not safety");
        }
        Boolean isValid = valuations.pl() > 15.00 || valuations.pVp() > 3.0;
        if (isValid) {
            return new GrahamValidation(true, "Maximum price below of current value");
        }
        return new GrahamValidation(false, "PL or pVp not safety");


    }

    private GrahamValidation validatePriceIsPositive(Double currentPrice, double maximumPrice) {
        if (maximumPrice > currentPrice) {
            return new GrahamValidation(true, "Maximum price below of current value");
        } else {
            return new GrahamValidation(false, "Current price below of maximum value");
        }
    }

    private boolean containsSegment(Stock stock, String segment) {
        return stock.getSector().getName().contains(segment);
    }
}
