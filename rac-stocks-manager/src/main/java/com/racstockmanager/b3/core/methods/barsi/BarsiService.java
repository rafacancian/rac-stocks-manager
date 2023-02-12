package com.racstockmanager.b3.core.methods.barsi;

import com.racstockmanager.b3.adapters.rest.dto.stock.StockShortDto;
import com.racstockmanager.b3.core.methods.general.stock.B3Service;
import com.racstockmanager.b3.core.model.stock.StockShort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class BarsiService {

    @Autowired
    private B3Service b3Service;

    public Set<StockShortDto> getTops() {

        Set<StockShort> stockShorts = b3Service.getAll();

        return stockShorts.stream()
                .filter(stock -> stock.barsi().isValid())
                .map(this::stockShortBarsiBuild)
                .sorted(Comparator.comparing(StockShortDto::maximumPrice).reversed())
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    private StockShortDto stockShortBarsiBuild(StockShort stockShort) {
        return StockShortDto.builder()
                .code(stockShort.code())
                .name(stockShort.name())
                .currentPrice(stockShort.currentValue())
                .maximumPrice(stockShort.barsi().maximumPrice())
                .upside(stockShort.barsi().upside()).build();
    }
}