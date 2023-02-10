package com.racstockmanager.b3.core.builders.fii;

import com.racstockmanager.b3.core.model.fii.FiiIndicators;
import com.racstockmanager.b3.core.model.fii.FiiValuations;
import com.racstockmanager.b3.core.model.stock.StockMethod;

public class FiiIndicatorsBuilder {

    public static FiiIndicators build(FiiValuations valuations, StockMethod bazinValue) {
        return FiiIndicators.builder()
                .valuations(valuations)
                .bazin(bazinValue)
                .build();
    }
}
