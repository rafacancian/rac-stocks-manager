package com.racstockmanager.b3.core.builders.stock;

import com.racstockmanager.b3.core.model.stock.IndicatorsEfficiency;

import java.util.List;

import static com.racstockmanager.b3.core.utils.CalculatorUtils.convertStringWithPercentageToDouble;

public class StockEfficiencyBuilder {


    public static IndicatorsEfficiency build(List<String> htmlIndicators) {

        return IndicatorsEfficiency.builder()
                .margemBruta(convertStringWithPercentageToDouble((htmlIndicators.get(0))))
                .margemEbitda(convertStringWithPercentageToDouble((htmlIndicators.get(1))))
                .margemEbit(convertStringWithPercentageToDouble((htmlIndicators.get(2))))
                .margemLiquida(convertStringWithPercentageToDouble((htmlIndicators.get(3))))
                .build();
    }
}
