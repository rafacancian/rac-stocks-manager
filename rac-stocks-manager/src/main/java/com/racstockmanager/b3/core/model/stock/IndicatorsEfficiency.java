package com.racstockmanager.b3.core.model.stock;

import lombok.Builder;

@Builder
public record IndicatorsEfficiency(Double margemBruta,
                                   Double margemEbitda,
                                   Double margemEbit,
                                   Double margemLiquida) {
}


