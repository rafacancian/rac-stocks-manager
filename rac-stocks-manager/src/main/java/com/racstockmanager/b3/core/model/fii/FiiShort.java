package com.racstockmanager.b3.core.model.fii;

import com.racstockmanager.b3.core.model.stock.StockMethod;
import lombok.Builder;

@Builder
public record FiiShort(String name,
                       String code,
                       String currentValue,
                       StockMethod bazin) {
}
