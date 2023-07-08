package com.racstockmanager.b3.core.methods.suno;

import com.racstockmanager.b3.adapters.rest.dto.fii.FiiShortSunoDto;
import com.racstockmanager.b3.adapters.rest.dto.stock.StockMethodDto;
import com.racstockmanager.b3.core.methods.general.fii.B3FiiService;
import com.racstockmanager.b3.core.model.fii.Fii;
import com.racstockmanager.b3.core.model.fii.FiiShort;
import com.racstockmanager.b3.core.model.stock.StockMethod;
import com.racstockmanager.b3.core.repository.fii.FiiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class FiiSunoService {

    @Autowired
    private B3FiiService b3FiiService;
    @Autowired
    private FiiRepository repository;

    public Set<FiiShortSunoDto> getAll() {

        final Set<FiiShort> Fiis = b3FiiService.getAll();
        final Set<Fii> sunoFiis = repository.getSunoFIIs();

        return Fiis.stream()
                .filter(fiiShort -> sunoFiis.toString().contains(fiiShort.code()))
                .map(this::fiiShortBuild)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    private FiiShortSunoDto fiiShortBuild(FiiShort fiiShort) {
        return FiiShortSunoDto.builder()
                .code(fiiShort.code())
                .name(fiiShort.name())
                .currentPrice(fiiShort.currentValue())
                .bazin(maximumPriceBuild(fiiShort.bazin())).build();
    }

    private StockMethodDto maximumPriceBuild(StockMethod stockMethod) {
        return StockMethodDto.builder()
                .isValid(stockMethod.isValid())
                .description(stockMethod.description())
                .maximumPrice(stockMethod.maximumPrice())
                .upside(stockMethod.upside()).build();
    }
}
