package com.racstockmanager.b3.adapters.rest.dto.fii;

import com.racstockmanager.b3.adapters.rest.dto.stock.StockMethodDto;
import lombok.Builder;

@Builder
public record FiiShortSunoDto(String name,
                              String code,
                              String currentPrice,
                              StockMethodDto bazin) {
}
