package com.racstockmanager.b3.core.methods.dividends;

import com.racstockmanager.b3.adapters.rest.dto.stock.StockShortDto;
import com.racstockmanager.b3.core.methods.general.stock.StockService;
import com.racstockmanager.b3.core.model.stock.StockShort;
import com.racstockmanager.b3.core.utils.CalculatorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class DividendsService {

    @Autowired
    private StockService stockService;


    public Set<StockShortDto> getTops() {

        Set<StockShort> stockShorts = stockService.getAll();

        return stockShorts.stream()
                .map(this::stockShortCheaperBuild)
                .sorted(Comparator.comparing(DividendsService::convertDividendYield).reversed())
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    private StockShortDto stockShortCheaperBuild(StockShort stockShort) {
        return StockShortDto.builder()
                .code(stockShort.code())
                .name(stockShort.name())
                .currentPrice(stockShort.currentValue())
                .dividendYield(stockShort.dividendYield())
                .valorization12M(stockShort.valorization12M())
                .build();
    }

    private static Double convertDividendYield(StockShortDto stock) {
        return CalculatorUtils.convertStringWithPercentageToDouble(stock.dividendYield());
    }
}
