package com.racstockmanager.b3.core.model.fii;

import lombok.Builder;

@Builder
public record FiiValuations(Double currentValue,
                            Double minValue,
                            Double maxValue,
                            Double dy,
                            Double dividendYield12Month,
                            Double valorization12Month,
                            Double patrimonyValue,
                            Double pVp,
                            Double savedMoney, //(valor em caixa)
                            Double dyCagr,
                            Double valueCagr,
                            Integer shareHolders) {
}


