package com.racstockmanager.b3.core.methods.graham;

import com.racstockmanager.b3.core.methods.bazin.ValidateError;
import com.racstockmanager.b3.core.model.IndicatorDescription;
import com.racstockmanager.b3.core.model.stock.Sector;
import com.racstockmanager.b3.core.model.stock.Stock;
import com.racstockmanager.b3.core.model.stock.StockMethod;
import com.racstockmanager.b3.core.model.stock.Valuations;
import com.racstockmanager.b3.core.utils.CalculatorUtils;
import com.racstockmanager.b3.core.utils.CurrencyUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        final Double upside = calculateUpside(valuations.currentValue(), intrinsicValue);
        final List<ValidateError> validationErrors = validation(stock, valuations, intrinsicValue);

        return StockMethod.builder()
                .isValid(validationErrors.isEmpty())
                .maximumPrice(intrinsicValueFormatted)
                .upside(upside)
                .upsideFormatted(convertDoubleToPercentage(upside))
                .description("Deprecated")
                .errors(validationErrors)
                .build();
    }

    private List<ValidateError> validation(Stock stock, Valuations valuations, Double intrinsicValue) {
        List<ValidateError> errors = new ArrayList<>();
        validatePLandPVP(stock, valuations, errors);
        validatePriceIsPositive(valuations.currentValue(), intrinsicValue, errors);
        return errors;
    }

    public void validatePLandPVP(Stock stock, Valuations valuations, List<ValidateError> errors) {
        if (isTechnologie(stock) || isVarejo(stock)) {
            if (valuations.pl() > 20.00 || valuations.pVp() > 3.5) {
                errors.add(new ValidateError(
                        "Segment of Technology/Varejo with PL or pVp not safety",
                        "PL: " + valuations.pl() + "e PVP: " + valuations.pVp(),
                        "Para açoes de tecnologia ou Varejo é recomendatdo o Preço sobre o lucro (PL) e o preço sobre "
                                + "valor patrimonial (PVP) ter uma margem de segurança, que são eles: PL < 20 e PVP < 3.5"
                                + "\n " + IndicatorDescription.PL.getDescription()
                                + "\n | " + IndicatorDescription.PVP.getDescription()));
            }
        } else if (valuations.pl() > 15.00 || valuations.pVp() > 3.0) {
            errors.add(new ValidateError(
                    "PL or pVp not safety",
                    "PL: " + valuations.pl() + "e PVP: " + valuations.pVp(),
                    "Para o modelo Graham é recomendado o Preço sobre o lucro (PL) e o preço sobre "
                            + "valor patrimonial (PVP) ter uma margem de segurança, que esão elas: PL < 15 e PVP < 3"
                            + "\n " + IndicatorDescription.PL.getDescription()
                            + "\n | " + IndicatorDescription.PVP.getDescription()));
        }
    }

    private void validatePriceIsPositive(Double currentPrice, double maximumPrice, List<ValidateError> errors) {
        if (currentPrice > maximumPrice) {
            errors.add(new ValidateError(
                    "No safely margin",
                    "The maximum price " + maximumPrice + " is below than current value: " + currentPrice,
                    null));
        }
    }

    private boolean isTechnologie(Stock stock) {
        return containsSector(stock, Sector.TECNOLOGIA_DA_INFORMACAO.getName());
    }

    private boolean isVarejo(Stock stock) {
        return containsSector(stock, Sector.CONSUMO_CICLICO.getName())
                && "VAREJO".equalsIgnoreCase(stock.getSegment());
    }

    private boolean containsSector(Stock stock, String segment) {
        return stock.getSector().getName().contains(segment);
    }
}
