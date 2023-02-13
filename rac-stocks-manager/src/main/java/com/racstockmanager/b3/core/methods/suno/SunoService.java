package com.racstockmanager.b3.core.methods.suno;

import com.racstockmanager.b3.adapters.rest.dto.stock.StockMethodDto;
import com.racstockmanager.b3.adapters.rest.dto.stock.StockShortDto;
import com.racstockmanager.b3.adapters.rest.dto.stock.StockShortSunoDto;
import com.racstockmanager.b3.core.methods.general.stock.B3Service;
import com.racstockmanager.b3.core.model.stock.Stock;
import com.racstockmanager.b3.core.model.stock.StockMethod;
import com.racstockmanager.b3.core.model.stock.StockShort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static com.racstockmanager.b3.core.repository.stock.StockRepositoryData.*;

@Service
public class SunoService {

    @Autowired
    private B3Service b3Service;

    public static Set<Stock> getTopsSunoValues() {
        return Set.of(EZTC3, BLAU3, PNVL3, TTEN3, BRBI11, MOVI3, GMAT3, VIVA3,
                IGTI11, KLBN11, NEOE3, TIMS3, BRKM5, VAMO3, MYPK3, RAIL3, CCRO3,
                TFCO4, CVCB3, SULA11);
    }

    public static Set<Stock> getTopsSunoDividends() {
        return Set.of(EGIE3, VALE3, ELET3, BBAS3, PETR4, TUPY3,
                BBSE3, LEVE3, AGRO3, ENBR3, MRVE3, ALUP11, B3SA3,
                CPLE6, VIVT3, GRND3, WIZC3, UNIP6);
    }

    public Set<StockShortSunoDto> getSunoValues() {

        Set<StockShort> stockShorts = b3Service.getAll();

        return stockShorts.stream()
                .filter(stockShort -> getTopsSunoDividends().toString().contains(stockShort.code()))
                .map(this::stockShortBuild)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public Set<StockShortSunoDto> getSunoDividends() {

        Set<StockShort> stockShorts = b3Service.getAll();

        return stockShorts.stream()
                .filter(stockShort -> getTopsSunoDividends().toString().contains(stockShort.code()))
                .map(this::stockShortBuild)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    private StockShortSunoDto stockShortBuild(StockShort stockShort) {
        return StockShortSunoDto.builder()
                .code(stockShort.code())
                .name(stockShort.name())
                .currentPrice(stockShort.currentValue())
                .barsi(MaximumPriceBuild(stockShort.barsi()))
                .bazin(MaximumPriceBuild(stockShort.bazin()))
                .graham(MaximumPriceBuild(stockShort.graham()))
                .wacc(MaximumPriceBuild(stockShort.wacc())).build();
    }

    private StockMethodDto MaximumPriceBuild(StockMethod stockMethod) {
        return StockMethodDto.builder()
                .isValid(stockMethod.isValid())
                .description(stockMethod.description())
                .maximumPrice(stockMethod.maximumPrice())
                .upside(stockMethod.upside()).build();
    }
}
