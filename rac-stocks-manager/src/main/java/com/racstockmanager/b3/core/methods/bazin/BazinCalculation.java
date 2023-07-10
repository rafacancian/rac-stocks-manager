package com.racstockmanager.b3.core.methods.bazin;

import com.racstockmanager.b3.core.builders.stock.StockValuationBuilder;
import com.racstockmanager.b3.core.model.IndicatorDescription;
import com.racstockmanager.b3.core.model.stock.StockMethod;
import com.racstockmanager.b3.core.utils.CalculatorUtils;
import com.racstockmanager.b3.core.utils.CurrencyUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.racstockmanager.b3.core.builders.stock.StockValuationBuilder.IPCA;

@Service
public class BazinCalculation extends CalculatorUtils {

    public static final String SECTOR_BANK = "Bank";

    public StockMethod execute(BazinParams bazinParams) {

        // reference https://www.youtube.com/watch?v=0gx-mV_U-Xw
        // O preço da ação não deve ultrapassar o preço da taxa basica de remuneração
        // Bazin é uma formula muito proxima ao Gondon
        // Bom para calcular FIIs

        // K = Taxa basica de remuneração de renda fixa = Selic
        // D = Dividendo
        // P = D / (K / 100)   => P = D x (100/K)

        // final boolean isValid = checkStockIsValidByFilters(stock, valuations);

        final Double maximumPrice = bazinParams.getDividendYield12Month() * (100 / IPCA);
        final String maximumPriceFormatted = CurrencyUtils.convertDoubleToBRL(maximumPrice);
        final Double upside = calculateUpside(bazinParams.getCurrentPrice(), maximumPrice);
        final List<ValidateError> validationErrors = validation(bazinParams, maximumPrice);

        return StockMethod.builder()
                .isValid(validationErrors.isEmpty())
                .maximumPrice(maximumPriceFormatted)
                .upside(upside)
                .upsideFormatted(convertDoubleToPercentage(upside))
                .description("deprecated")
                .errors(validationErrors)
                .build();
    }
    
    protected List<ValidateError> validation(BazinParams bazinParams, double maximumPrice) {
        List<ValidateError> errors = new ArrayList<>();
        validateSafetyMargin(bazinParams, errors);
        validatePriceIsPositive(bazinParams.getCurrentPrice(), maximumPrice, errors);
        return errors;
    }

    protected void validateSafetyMargin(BazinParams bazinParams, List<ValidateError> errors) {
        if (!dividendYealdGreatThenSelic(bazinParams.getDy())) {
            errors.add(new ValidateError(
                    "No safely range price",
                    "Dividend Yeald must to be great then selic" +
                            "\n Dividend Yeald: " + bazinParams.getCurrentPrice() +
                            "\n" + "Selic: " + StockValuationBuilder.SELIC,
                    IndicatorDescription.IPCA.getDescription()));
        }
        if (!lowDivLiquidEbitda(bazinParams.getDivLiquidEbitda())) {
            errors.add(new ValidateError(
                    "Divida liquida Ebitda must to be less then 3",
                    "Ebitda: " + bazinParams.getDivLiquidEbitda(),
                    IndicatorDescription.EBITDA.getDescription()));

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

    protected boolean isNotBank(String sector) {
        return !sector.equalsIgnoreCase(SECTOR_BANK);
    }

    protected boolean dividendYealdGreatThenSelic(Double dy) {
        return dy > StockValuationBuilder.SELIC;
    }

    private boolean lowDivLiquidEbitda(Double divLiquidEbitda) {
        return divLiquidEbitda < 3.0;
    }
}
