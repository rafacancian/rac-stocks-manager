package com.racstockmanager.b3.core.methods.bazin;

import com.racstockmanager.b3.core.model.fii.Fii;
import com.racstockmanager.b3.core.model.fii.FiiValuations;
import com.racstockmanager.b3.core.model.stock.StockMethod;
import org.springframework.stereotype.Service;

@Service
public class BazinFiiCalculation extends BazinCalculation {

    public StockMethod execute(Fii fii, FiiValuations valuations) {

        BazinParams bazinParams = BazinParams.builder()
                .currentPrice(valuations.currentValue())
                .sector(fii.getSector())
                .dy(valuations.dy())
                .dividendYield12Month(valuations.dividendYield12Month()).build();

        //TODO
        return null;
    }

    protected Boolean validateSafetyMargin(BazinParams bazinParams) {
        return isNotBank(bazinParams.getSector()) &&
                dividendYealdGreatThenSelic(bazinParams.getDy());
    }
}
