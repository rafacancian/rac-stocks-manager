package com.racstockmanager.b3.core.methods.bazin;

import com.racstockmanager.b3.adapters.rest.dto.stock.StockShortDto;
import com.racstockmanager.b3.core.methods.general.stock.StockService;
import com.racstockmanager.b3.core.model.stock.StockShort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class BazinService {

    @Autowired
    private StockService stockService;

    public Set<StockShortDto> getTops() {
        Set<StockShort> stockShorts = stockService.getAll();

        return stockShorts.stream()
                .filter(stock -> stock.bazin().isValid())
                .map(this::stockShortBazinBuild)
                .sorted(Comparator.comparing(StockShortDto::maximumPrice).reversed())
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    private StockShortDto stockShortBazinBuild(StockShort stockShort) {
        return StockShortDto.builder()
                .code(stockShort.code())
                .name(stockShort.name())
                .dividendYield(stockShort.dividendYield())
                .valorization12M(stockShort.valorization12M())
                .currentPrice(stockShort.currentValue())
                .maximumPrice(stockShort.bazin().maximumPrice())
                .upside(stockShort.bazin().upside())
                .status(stockShort.bazin().isValid() ? "Buy" : "Waiting").build();
    }
}
