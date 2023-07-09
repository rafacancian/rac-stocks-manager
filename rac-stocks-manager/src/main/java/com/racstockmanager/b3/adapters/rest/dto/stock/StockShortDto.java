package com.racstockmanager.b3.adapters.rest.dto.stock;

import lombok.Builder;

import java.util.Comparator;

@Builder
public record StockShortDto(String code,
                            String name,
                            String currentPrice,
                            String dividendYield,
                            String valorization12M,
                            String maximumPrice,
                            String upsideFormatted,
                            Double upside,
                            String status) implements Comparator<StockShortDto> {
    @Override
    public int compare(StockShortDto o1, StockShortDto o2) {
        return Double.compare(o1.upside(), o2.upside());
    }
}
