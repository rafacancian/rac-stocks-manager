package com.racstockmanager.b3.core.builders.stock;

import com.racstockmanager.b3.core.model.stock.IndicatorsGrowth;

import java.util.List;

import static com.racstockmanager.b3.core.utils.CalculatorUtils.convertStringWithPercentageToDouble;

public class StockGrowthBuilder {


    public static IndicatorsGrowth build(List<String> htmlIndicators) {

        return IndicatorsGrowth.builder()
                .cagrReceita(convertStringWithPercentageToDouble((htmlIndicators.get(0))))
                .cagrLucros(convertStringWithPercentageToDouble((htmlIndicators.get(1))))
                .build();
    }
}
