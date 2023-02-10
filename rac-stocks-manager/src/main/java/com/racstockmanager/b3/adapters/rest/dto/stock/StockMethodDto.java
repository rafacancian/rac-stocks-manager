package com.racstockmanager.b3.adapters.rest.dto.stock;

import lombok.Builder;

@Builder
public record StockMethodDto(Boolean isValid,
                             String description,
                             String maximumPrice,
                             String upside) {
}
