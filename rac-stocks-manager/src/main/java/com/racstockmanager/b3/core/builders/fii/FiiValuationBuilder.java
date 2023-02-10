package com.racstockmanager.b3.core.builders.fii;

import com.racstockmanager.b3.core.model.fii.FiiValuations;

import java.util.List;

import static com.racstockmanager.b3.core.utils.B3CalculationUtils.*;

public class FiiValuationBuilder {

    public static FiiValuations build(List<String> topInfoValues, List<String> topInfoSubValues, List<String> topInfoPatrimonios) {

        return FiiValuations.builder()
                .currentValue(convertStringToDouble(topInfoValues.get(0)))
                .minValue(convertStringToDouble(topInfoValues.get(1)))
                .maxValue(convertStringToDouble(topInfoValues.get(2)))
                .dy(convertStringWithPercentageToDouble(topInfoValues.get(3)))
                .valorization12Month(convertStringWithPercentageToDouble(topInfoValues.get(4))) // %
                .dividendYield12Month(convertStringWithCoinToDouble(topInfoSubValues.get(3)))

                .patrimonyValue(convertStringWithPercentageToDouble(topInfoPatrimonios.get(0)))
                .pVp(convertStringWithPercentageToDouble(topInfoPatrimonios.get(1)))
                .savedMoney(convertStringWithPercentageToDouble(topInfoPatrimonios.get(2)))
                .dyCagr(convertStringWithPercentageToDouble(topInfoPatrimonios.get(3)))
                .valueCagr(convertStringWithPercentageToDouble(topInfoPatrimonios.get(4)))
                .shareHolders(convertStringWithPercentageToInteger(topInfoPatrimonios.get(5)))
                .build();
    }
}
