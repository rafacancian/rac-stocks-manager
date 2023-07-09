package com.racstockmanager.b3.core.model.stock;

import lombok.Builder;

@Builder
public record StockMethod(Boolean isValid,
                          String description,
                          String maximumPrice,
                          String upsideFormatted,
                          Double upside) {
}
