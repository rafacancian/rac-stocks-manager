package com.racstockmanager.b3.core.methods.wacc;

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
public class WaccCalculation extends CalculatorUtils {

    /* WACC = custo medio ponderado do capital */
    public StockMethod execute(Stock stock, Valuations valuations) {

        // KE = RF (taxa selic) + B (beta?) * (RM(retorno medio do mercado) - RF)
        // KE = 0,12 + 0,23 * (0,10 - 0,12)
        // KE = 6,92%

        Double KE = valuations.ipca() + 0.23 * (0.10 - 0.12);
        Double E = valuations.patrimonioLiquido();
        Double D = valuations.dividabruta();
        Double Kd = 5.0;

        // E = patrimonio liquido = 13.413.944.000
        // D = divida total (divida bruta) = 2.853.828.000
        // Kd = custo da divida (juros)
        // IR = isenção de IR nos juros)

        // WACC = KE * (E/(D+E)) + KD * (D/(D+E)) * (1-IR)
        // WACC = 6,92% * (13.413.944.000 / (2.853.828.000 + 13.413.944.000)) + 2,4% * (2.853.828.000 / (2.853.828.000 + 13.413.944.000))  * (1-IR)

        // Double E2 = 7853000000.00;
        // Double D2 = 3772000000.00;
        // Double KE = 0.0692;
        // Double Kd = 0.024;
        // Result 5,45%

        final Double wacc = KE * (E / (D + E)) + Kd * (D / (D + E));
        final Double maximumPrice = valuations.currentValue() + (valuations.currentValue() * (wacc / 100));
        final List<ValidateError> validationErrors = validation(valuations, maximumPrice);

        return StockMethod.builder()
                .isValid(validationErrors.isEmpty())
                .maximumPrice(CurrencyUtils.convertDoubleToBRL(maximumPrice))
                .upside(wacc)
                .upsideFormatted(convertDoubleToPercentage(wacc))
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
