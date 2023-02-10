package com.racstockmanager.b3.core.methods.graham;

import com.racstockmanager.b3.core.model.stock.Stock;
import com.racstockmanager.b3.core.model.stock.StockMethod;
import com.racstockmanager.b3.core.model.stock.Valuations;
import com.racstockmanager.b3.core.utils.B3CalculationUtils;
import com.racstockmanager.b3.core.utils.CurrencyUtils;
import org.springframework.stereotype.Service;

import static com.racstockmanager.b3.core.repository.stock.StockRepositoryData.TECNOLOGIA_DA_INFORMACAO;
import static com.racstockmanager.b3.core.repository.stock.StockRepositoryData.VAREJO;

@Service
public class GrahamCalculation extends B3CalculationUtils {

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
                    .description("No safety margin")
                    .maximumPrice(CurrencyUtils.convertDoubleToBRL(0.0))
                    .upside(convertDoubleToPercentage(0.0))
                    .build();
        }

        final Double intrinsicValue = Math.sqrt(22.5 * (valuations.lpa() * valuations.vpa()));
        final String intrinsicValueFormatted = CurrencyUtils.convertDoubleToBRL(intrinsicValue);

        //final Double upside = (intrinsicValue / valuations.currentValue() - 1) * 100;
        final String upsideFormatted = calculateUpsideFormatted(valuations.currentValue(), intrinsicValue);

        if (isValid(stock, valuations, intrinsicValue)) {
            return StockMethod.builder()
                    .isValid(true)
                    .description("Maximum price below of current value")
                    .maximumPrice(intrinsicValueFormatted)
                    .upside(upsideFormatted)
                    .build();
        }

        return StockMethod.builder()
                .isValid(false)
                .description("No safety margin")
                .maximumPrice(intrinsicValueFormatted)
                .upside(upsideFormatted)
                .build();
    }

    private Boolean isValid(Stock stock, Valuations valuations, Double intrinsicValue) {
        return validateSafetyMargin(stock, valuations) && validatePriceIsPositive(valuations.currentValue(), intrinsicValue);
    }

    public Boolean validateSafetyMargin(Stock stock, Valuations valuations) {
        if (containsSegment(stock, TECNOLOGIA_DA_INFORMACAO) || containsSegment(stock, VAREJO)) {
            return valuations.pl() > 20.00 || valuations.pVp() > 3.5;
        }
        return valuations.pl() > 15.00 || valuations.pVp() > 3.0;
    }

    private Boolean validatePriceIsPositive(Double currentPrice, double maximumPrice) {
        return maximumPrice > currentPrice;
    }

    private boolean containsSegment(Stock stock, String segment) {
        return stock.getSector().toLowerCase().contains(segment);
    }
}
