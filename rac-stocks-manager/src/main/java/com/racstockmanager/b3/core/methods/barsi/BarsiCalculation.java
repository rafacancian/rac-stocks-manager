package com.racstockmanager.b3.core.methods.barsi;

import com.racstockmanager.b3.core.model.stock.Stock;
import com.racstockmanager.b3.core.model.stock.StockMethod;
import com.racstockmanager.b3.core.model.stock.Valuations;
import com.racstockmanager.b3.core.utils.CalculatorUtils;
import com.racstockmanager.b3.core.utils.CurrencyUtils;
import org.springframework.stereotype.Service;

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

        final String upsideFormatted = calculateUpsideFormatted(valuations.currentValue(), maximumPrice);

        if (isValid(valuations, maximumPrice)) {
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

    private Boolean isValid(Valuations valuations, Double maximumPrice) {
        return validatePriceIsPositive(valuations.currentValue(), maximumPrice);
    }

    private Boolean validatePriceIsPositive(Double currentPrice, double maximumPrice) {
        return maximumPrice > currentPrice;
    }
}
