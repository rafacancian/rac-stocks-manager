package com.racstockmanager.b3.core.model.stock;

import lombok.Builder;

@Builder
public record StockShort(String name,
                         String code,
                         String currentValue,
                         StockMethod graham,
                         StockMethod bazin,
                         StockMethod wacc,
                         StockMethod barsi) {
}
