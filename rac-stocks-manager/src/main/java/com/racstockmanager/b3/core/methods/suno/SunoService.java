package com.racstockmanager.b3.core.methods.suno;

import com.racstockmanager.b3.adapters.rest.dto.stock.StockMethodDto;
import com.racstockmanager.b3.adapters.rest.dto.stock.StockShortSunoDto;
import com.racstockmanager.b3.core.methods.general.stock.StockService;
import com.racstockmanager.b3.core.model.stock.Stock;
import com.racstockmanager.b3.core.model.stock.StockMethod;
import com.racstockmanager.b3.core.model.stock.StockShort;
import com.racstockmanager.b3.core.repository.stock.StockRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;


@Service
@Slf4j
public class SunoService {

    @Autowired
    private StockRepository repository;
    @Autowired
    private StockService stockService;

    public Set<StockShortSunoDto> getSunoValues() {
        log.debug("[B3 Suno Service] Get Suno recommendation for stocks values");
        Set<StockShort> stocks = stockService.getAll();
        Set<Stock> sunoStocks = repository.getTopsSunoValues();

        return stocks.stream()
                .filter(stock -> sunoStocks.stream().anyMatch(sunoStock -> sunoStock.getCode().equalsIgnoreCase(stock.code())))
                .map(this::stockShortBuild)
                .collect(Collectors.toSet());
    }

    public Set<StockShortSunoDto> getSunoDividends() {
        log.debug("[B3 Suno Service] Get Suno recommendation for stocks dividends");
        Set<StockShort> stocks = stockService.getAll();
        Set<Stock> sunoStocks = repository.getTopsSunoDividends();

        return stocks.stream()
                .filter(stock -> sunoStocks.stream().anyMatch(sunoStock -> sunoStock.getCode().equalsIgnoreCase(stock.code())))
                .map(this::stockShortBuild)
                .collect(Collectors.toSet());
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
