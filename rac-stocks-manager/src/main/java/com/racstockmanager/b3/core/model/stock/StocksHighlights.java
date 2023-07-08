package com.racstockmanager.b3.core.model.stock;

import lombok.Builder;

import java.util.List;

@Builder
public record StocksHighlights(List<StockHighlights> highlightsUp) {
}
