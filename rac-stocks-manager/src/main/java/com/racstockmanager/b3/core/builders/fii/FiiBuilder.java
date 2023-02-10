package com.racstockmanager.b3.core.builders.fii;

import com.racstockmanager.b3.core.model.fii.Fii;
import com.racstockmanager.b3.core.model.fii.FiiShort;
import com.racstockmanager.b3.core.utils.CurrencyUtils;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class FiiBuilder {

    public Set<FiiShort> parseToShortInformation(Set<Fii> fiis) {
        return fiis.stream()
                .map(this::parseToShortInformation)
                .sorted(Comparator.comparing(FiiShort::code))
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public FiiShort parseToShortInformation(Fii fii) {
        return FiiShort.builder()
                .name(fii.getName())
                .code(fii.getCode())
                .currentValue(CurrencyUtils.convertDoubleToBRL(fii.getIndicators().getValuations().currentValue()))
                .bazin(fii.getIndicators().getBazin())
                .build();
    }
}
