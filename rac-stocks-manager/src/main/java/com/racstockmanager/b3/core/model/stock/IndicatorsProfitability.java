package com.racstockmanager.b3.core.model.stock;

import lombok.Builder;

@Builder
public record IndicatorsProfitability(Double roe,
                                      Double roa,
                                      Double roic,
                                      Double giroAtivos) {
}


