package com.racstockmanager.b3.adapters.rest.dto.stock;

import lombok.Builder;

@Builder
public record StockShortSunoDto(String name,
                                String code,
                                String currentPrice,
                                StockMethodDto barsi,
                                StockMethodDto bazin,
                                StockMethodDto graham,
                                StockMethodDto wacc) {
}
