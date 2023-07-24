package com.racstockmanager.b3.core.builders.stock;

import com.racstockmanager.b3.core.model.stock.IndicatorsProfitability;

import java.util.List;

import static com.racstockmanager.b3.core.utils.CalculatorUtils.convertStringWithPercentageToDouble;

public class StockProfitabilityBuilder {


    public static IndicatorsProfitability build(List<String> htmlIndicators) {

        return IndicatorsProfitability.builder()
                .roe(convertStringWithPercentageToDouble((htmlIndicators.get(0))))
                .roa(convertStringWithPercentageToDouble((htmlIndicators.get(1))))
                .roic(convertStringWithPercentageToDouble((htmlIndicators.get(2))))
                .giroAtivos(convertStringWithPercentageToDouble((htmlIndicators.get(3))))
                .build();
    }
}
