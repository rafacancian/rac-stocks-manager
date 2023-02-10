package com.racstockmanager.b3.core.methods.bazin;

import com.racstockmanager.b3.core.builders.stock.StockValuationBuilder;
import com.racstockmanager.b3.core.model.stock.StockMethod;
import com.racstockmanager.b3.core.utils.B3CalculationUtils;
import com.racstockmanager.b3.core.utils.CurrencyUtils;
import org.springframework.stereotype.Service;

import static com.racstockmanager.b3.core.builders.stock.StockValuationBuilder.IPCA;

@Service
public class BazinCalculation extends B3CalculationUtils {

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

        final String upsideFormatted = calculateUpsideFormatted(bazinParams.getCurrentPrice(), maximumPrice);

        if (isValid(bazinParams, maximumPrice)) {
            return StockMethod.builder()
                    .isValid(true)
                    .description("Maximum price below of current value")
                    .maximumPrice(maximumPriceFormatted)
                    .upside(upsideFormatted)
                    .build();
        }

        return StockMethod.builder()
                .isValid(false)
                .description("No safely range price")
                .maximumPrice(maximumPriceFormatted)
                .upside(upsideFormatted)
                .build();

    }


    protected Boolean isValid(BazinParams bazinParams, double maximumPrice) {
        return validateSafetyMargin(bazinParams) && validatePriceIsPositive(bazinParams.getCurrentPrice(), maximumPrice);
    }

    protected Boolean validateSafetyMargin(BazinParams bazinParams) {
        return isNotBank(bazinParams.getSector()) &&
                dividendYealdGreatThenSelic(bazinParams.getDy()) &&
                lowDivLiquidEbitda(bazinParams.getDivLiquidEbitda());
    }

    private Boolean validatePriceIsPositive(Double currentPrice, double maximumPrice) {
        return maximumPrice > currentPrice;
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
