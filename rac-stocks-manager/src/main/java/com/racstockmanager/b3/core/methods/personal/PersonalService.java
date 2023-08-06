package com.racstockmanager.b3.core.methods.personal;

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
public class PersonalService {

    @Autowired
    private StockService stockService;


    public Set<StockShortDto> getStocks() {

        Set<StockShort> stockShorts = stockService.getPersonal();

        return stockShorts.stream()
                .map(this::stockShortCheaperBuild)
                .sorted(Comparator.comparing(StockShortDto::score).reversed())
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    private StockShortDto stockShortCheaperBuild(StockShort stockShort) {
        return StockShortDto.builder()
                .code(stockShort.code())
                .name(stockShort.name())
                .currentPrice(stockShort.currentValue())
                .dividendYield(stockShort.dividendYield())
                .valorization12M(stockShort.valorization12M())
                .maximumPrice(stockShort.cheaper().maximumPrice())
                .upside(stockShort.cheaper().upside())
                .upsideFormatted(stockShort.cheaper().upsideFormatted())
                .description(stockShort.cheaper().description())
                .errors(stockShort.cheaper().errors())
                .score(stockShort.cheaper().score())
                .status(stockShort.cheaper().score() > 8 ? "Buy" : "Wait").build();
    }
}
