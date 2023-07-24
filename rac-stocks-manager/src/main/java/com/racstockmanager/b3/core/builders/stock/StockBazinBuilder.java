package com.racstockmanager.b3.core.builders.stock;

import com.racstockmanager.b3.core.methods.bazin.BazinParams;
import com.racstockmanager.b3.core.model.stock.IndicatorsValuations;
import com.racstockmanager.b3.core.model.stock.Stock;

public class StockBazinBuilder {


    public static BazinParams build(Stock stock, IndicatorsValuations indicatorsValuations) {

        return BazinParams.builder()
                .currentPrice(indicatorsValuations.currentValue())
                .sector(stock.getSector().getName())
                .dy(indicatorsValuations.dy())
                .dividendYield12Month(indicatorsValuations.dividendYield12Month())
                .divLiquidEbitda(indicatorsValuations.divLiquidEbitda())
                .build();
    }
}
