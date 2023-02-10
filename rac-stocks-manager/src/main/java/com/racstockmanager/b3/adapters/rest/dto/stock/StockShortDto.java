package com.racstockmanager.b3.adapters.rest.dto.stock;

import lombok.Builder;

@Builder
public record StockShortDto(String name,
                            String code,
                            String currentPrice,
                            String maximumPrice,
                            String upside) {
}
