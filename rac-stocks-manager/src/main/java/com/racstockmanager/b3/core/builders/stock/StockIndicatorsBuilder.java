package com.racstockmanager.b3.core.builders.stock;

import com.racstockmanager.b3.core.model.stock.*;

public class StockIndicatorsBuilder {

    public static Indicators build(IndicatorsValuations indicatorsValuations,
                                   IndicatorsEfficiency indicatorsEfficiency,
                                   IndicatorsProfitability indicatorsProfitability,
                                   IndicatorsGrowth indicatorsGrowth,
                                   boolean isJudicialRecovery,
                                   StockMethod barsi, StockMethod bazin, StockMethod graham, StockMethod wacc, StockMethod cheaper) {
        return Indicators.builder()
                .indicatorsValuations(indicatorsValuations)
                .indicatorsEfficiency(indicatorsEfficiency)
                .indicatorsProfitability(indicatorsProfitability)
                .indicatorsGrowth(indicatorsGrowth)
                .isJuridicalRecovery(isJudicialRecovery)
                .barsi(barsi)
                .bazin(bazin)
                .graham(graham)
                .wacc(wacc)
                .cheaper(cheaper)
                .build();
    }
}
