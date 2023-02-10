package com.racstockmanager.b3.core.methods.bazin;

import org.springframework.stereotype.Service;

@Service
public class BazinFiiCalculation extends BazinCalculation {

    @Override
    protected Boolean validateSafetyMargin(BazinParams bazinParams) {
        return isNotBank(bazinParams.getSector()) &&
                dividendYealdGreatThenSelic(bazinParams.getDy());
    }
}
