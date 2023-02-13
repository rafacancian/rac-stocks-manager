package com.racstockmanager.b3.adapters.rest.dto.stock;

import lombok.Builder;

@Builder
public record StockShortDto(String code,
                            String name,
                            String currentPrice,
                            String dividendYield,
                            String valorization12M,
                            String maximumPrice,
                            String upside,
                            String status) {
}
