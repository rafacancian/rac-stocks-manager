package com.racstockmanager.b3.core.builders.stock;

import com.racstockmanager.b3.core.model.stock.Indicators;
import com.racstockmanager.b3.core.model.stock.IndicatorsValuations;
import com.racstockmanager.b3.core.model.stock.StockMethod;

public class StockIndicatorsBuilder {

    public static Indicators build(IndicatorsValuations indicatorsValuations, boolean isJudicialRecovery, StockMethod barsi,
                                   StockMethod bazin, StockMethod graham, StockMethod wacc, StockMethod cheaper) {
        return Indicators.builder()
                .indicatorsValuations(indicatorsValuations)
                .isJuridicalRecovery(isJudicialRecovery)
                .barsi(barsi)
                .bazin(bazin)
                .graham(graham)
                .wacc(wacc)
                .cheaper(cheaper)
                .build();
    }
}
