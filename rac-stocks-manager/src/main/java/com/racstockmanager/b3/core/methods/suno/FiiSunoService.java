package com.racstockmanager.b3.core.methods.suno;

import com.racstockmanager.b3.adapters.rest.dto.fii.FiiShortSunoDto;
import com.racstockmanager.b3.adapters.rest.dto.stock.StockMethodDto;
import com.racstockmanager.b3.core.methods.general.fii.B3FiiService;
import com.racstockmanager.b3.core.model.fii.Fii;
import com.racstockmanager.b3.core.model.fii.FiiShort;
import com.racstockmanager.b3.core.model.stock.StockMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static com.racstockmanager.b3.core.repository.fii.FiiRepositoryData.*;

@Service
public class FiiSunoService {

    @Autowired
    private B3FiiService b3FiiService;

    public static Set<Fii> getTopsSunoFiis() {
        return Set.of(BCFF11, BTLG11, HFOF11, HSML11, IRDM11, MCCI11, MXRF11, PVBI11, RBRP11, RECR11,
                SDIL11, SNFF11, VGIP11, VILG11, VISC11);
    }

    public Set<FiiShortSunoDto> getAll() {

        Set<FiiShort> fiiShorts = b3FiiService.getAll();

        return fiiShorts.stream()
                .filter(fiiShort -> getTopsSunoFiis().toString().contains(fiiShort.code()))
                .map(this::fiiShortBuild)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    private FiiShortSunoDto fiiShortBuild(FiiShort fiiShort) {
        return FiiShortSunoDto.builder()
                .code(fiiShort.code())
                .name(fiiShort.name())
                .currentPrice(fiiShort.currentValue())
                .bazin(MaximumPriceBuild(fiiShort.bazin())).build();
    }

    private StockMethodDto MaximumPriceBuild(StockMethod stockMethod) {
        return StockMethodDto.builder()
                .isValid(stockMethod.isValid())
                .description(stockMethod.description())
                .maximumPrice(stockMethod.maximumPrice())
                .upside(stockMethod.upside()).build();
    }
}
