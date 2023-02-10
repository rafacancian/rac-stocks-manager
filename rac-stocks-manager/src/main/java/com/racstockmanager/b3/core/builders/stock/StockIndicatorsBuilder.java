package com.racstockmanager.b3.core.builders.stock;

import com.racstockmanager.b3.core.model.stock.Indicators;
import com.racstockmanager.b3.core.model.stock.StockMethod;
import com.racstockmanager.b3.core.model.stock.Valuations;

public class StockIndicatorsBuilder {

    public static Indicators build(Valuations valuations, StockMethod barsi, StockMethod bazin, StockMethod graham, StockMethod wacc) {
        return Indicators.builder()
                .valuations(valuations)
                .barsi(barsi)
                .bazin(bazin)
                .graham(graham)
                .wacc(wacc)
                .build();
    }
}
