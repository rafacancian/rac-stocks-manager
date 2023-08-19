package com.racstockmanager.b3.core.model.stock;

import lombok.Builder;

@Builder
public record StockShort(String name,
                         String code,
                         String currentValue,
                         String dividendYield,
                         String valorization12M,
                         String earningYield,
                         String roe,
                         StockMethod graham,
                         StockMethod bazin,
                         StockMethod wacc,
                         StockMethod barsi,
                         StockMethod cheaper) {
}
