package com.racstockmanager.b3.core.methods.barsi;

import com.racstockmanager.b3.core.methods.bazin.ValidateError;
import com.racstockmanager.b3.core.model.stock.Stock;
import com.racstockmanager.b3.core.model.stock.StockMethod;
import com.racstockmanager.b3.core.model.stock.Valuations;
import com.racstockmanager.b3.core.utils.CalculatorUtils;
import com.racstockmanager.b3.core.utils.CurrencyUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BarsiCalculation extends CalculatorUtils {

    public StockMethod execute(Stock stock, Valuations valuations) {
        //https:www.youtube.com/watch?v=0X_pg3rG1Wg&list=WL&index=25
        // valor atual
        // dividendo ao ano /em reais)
        // preço teto AGFB3 = dividendo / 6% (valor definido pelo barsi)
        // if preco teto > preco atual == oportunidade

        final Double maximumPrice = valuations.dividendYield12Month() / 0.06;
        final String maximumPriceFormatted = CurrencyUtils.convertDoubleToBRL(maximumPrice);
        double upside = calculateUpside(valuations.currentValue(), maximumPrice);
        final List<ValidateError> validationErrors = validation(valuations, maximumPrice);

        return StockMethod.builder()
                .isValid(validationErrors.isEmpty())
                .maximumPrice(maximumPriceFormatted)
                .upsideFormatted(convertDoubleToPercentage(upside))
                .upside(upside)
                .description("Deprecated")
                .errors(validationErrors)
                .build();

    }

    private List<ValidateError> validation(Valuations valuations, Double maximumPrice) {
        List<ValidateError> errors = new ArrayList<>();
        validatePriceIsPositive(valuations.currentValue(), maximumPrice, errors);
        return errors;
    }

    private void validatePriceIsPositive(Double currentPrice, double maximumPrice, List<ValidateError> errors) {
        if (currentPrice > maximumPrice) {
            errors.add(new ValidateError(
                    "No safely margin",
                    "The maximum price " + maximumPrice + " is below than current value: " + currentPrice,
                    null));
        }
    }
}
