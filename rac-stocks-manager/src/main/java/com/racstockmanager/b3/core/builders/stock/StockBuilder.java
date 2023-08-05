package com.racstockmanager.b3.core.builders.stock;

import com.racstockmanager.b3.core.model.stock.Stock;
import com.racstockmanager.b3.core.model.stock.StockShort;
import com.racstockmanager.b3.core.utils.CalculatorUtils;
import com.racstockmanager.b3.core.utils.CurrencyUtils;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class StockBuilder {

    public Set<StockShort> parseToShortInformation(Set<Stock> stocks) {
        return stocks.stream()
                .map(this::parseToShortInformation)
                .sorted(Comparator.comparing(StockShort::code))
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public StockShort parseToShortInformation(Stock stock) {
        return StockShort.builder()
                .name(stock.getName())
                .code(stock.getCode())
                .dividendYield(CalculatorUtils.convertDoubleToPercentage(stock.getIndicators().getIndicatorsValuations().dividendYield()))
                .valorization12M(stock.getIndicators().getIndicatorsValuations().valorization12Month())
                .currentValue(CurrencyUtils.convertDoubleToBRL(stock.getIndicators().getIndicatorsValuations().currentValue()))
                .graham(stock.getIndicators().getGraham())
                .bazin(stock.getIndicators().getBazin())
                .wacc(stock.getIndicators().getWacc())
                .barsi(stock.getIndicators().getBarsi())
                .cheaper(stock.getIndicators().getCheaper())
                .build();
    }
}
