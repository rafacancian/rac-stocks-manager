package com.racstockmanager.b3.core.methods.general.stock;

import com.racstockmanager.b3.adapters.repository.RedisRepository;
import com.racstockmanager.b3.core.builders.stock.StockBuilder;
import com.racstockmanager.b3.core.exceptions.StockNotFoundException;
import com.racstockmanager.b3.core.model.stock.Indicators;
import com.racstockmanager.b3.core.model.stock.Stock;
import com.racstockmanager.b3.core.model.stock.StockShort;
import com.racstockmanager.b3.core.model.stock.Stocks;
import com.racstockmanager.b3.core.repository.stock.StockRepository;
import com.racstockmanager.b3.core.utils.ShowPercentageProgress;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@Slf4j
public class StockService {

    @Autowired
    private StockCalculator stockCalculator;
    @Autowired
    private StockRepository repository;
    @Autowired
    private RedisRepository redisRepository;
    @Autowired
    private StockBuilder stockBuilder;

    public Set<StockShort> getAll() {
        log.debug("[B3 Service] Get all stocks");
        final Stocks stocks = processStocks(false);
        return stockBuilder.parseToShortInformation(stocks.getStocks());
    }

    public Set<StockShort> getAllRelevant() {
        log.debug("[B3 Service] Get all relevant stocks");
        final Stocks stocks = processStocks(true);
        return stockBuilder.parseToShortInformation(stocks.getStocks());
    }

    public Optional<StockShort> getStockByCode(String code) {
        log.debug("[B3 Service] Get stock by code");
        final Stocks stocks = processStocks(true);
        return stocks.getStocks().stream()
                .filter(stock -> stock.getCode().equalsIgnoreCase(code))
                .map(stockBuilder::parseToShortInformation)
                .findFirst();
    }

    public Set<StockShort> getBySector(final String sector) {
        log.debug("[B3 Service] Get stock by sector");
        Stocks stocks = processStocks(true);

        if ("all".equalsIgnoreCase(sector)) {
            return stocks.getStocks().stream()
                    .map(stockBuilder::parseToShortInformation)
                    .collect(Collectors.toSet());
        }

        return stocks.getStocks().stream()
                .filter(stock -> stock.getSector().getName().equalsIgnoreCase(sector))
                .map(stockBuilder::parseToShortInformation)
                .collect(Collectors.toSet());
    }

    public Set<StockShort> getBySegment(final String segment) {
        log.debug("[B3 Service] Get stock by segment");
        final Stocks stocks = processStocks(true);
        return stocks.getStocks().stream()
                .filter(stock -> stock.getSegment().toLowerCase().contains(segment.toLowerCase()))
                .map(stockBuilder::parseToShortInformation)
                .collect(Collectors.toSet());
    }

    private Stocks processStocks(boolean relevantStocks) {
        final Stocks stocks = redisRepository.get(LocalDate.now().toString());
        if (stocks == null || stocks.getLastCalculation().isBefore(LocalDate.now())) {
            return startCalculationProcess(relevantStocks);
        }
        return stocks;
    }

    private Stocks startCalculationProcess(boolean relevantStocks) {
        Set<Stock> stocksResult = new HashSet<>();
        Set<Stock> stocksDB;
        if (relevantStocks) {
            stocksDB = repository.getAllRelevant();
        } else {
            stocksDB = repository.getAll();
        }
        log.info("[B3 Service] Stocks empty. Starting calculation process");
        ShowPercentageProgress.execute(stocksDB, stocksResult);
        try {
            stocksDB.forEach(s -> {
                //log.info("[Stock Service calculating] code: " + s.getCode());
                Indicators indicators = stockCalculator.execute(s);
                s.setIndicators(indicators);
                stocksResult.add(s);
                ShowPercentageProgress.execute(stocksDB, stocksResult);
            });
        } catch (IndexOutOfBoundsException e) {
            log.error("[Stock Service error]");
        }

        log.info("\n[B3 Service] Stocks calculation process completed");
        Stocks stocks = new Stocks(LocalDate.now(), stocksResult);
        redisRepository.insert(LocalDate.now().toString(), stocks);
        return stocks;
    }

    public StockShort getBySingleCalculationForTest(String code) {
        log.debug("[B3 Service] Get stock by code");
        Stock stock = startCalculationProcessNoRedis(code);
        return stockBuilder.parseToShortInformation(stock);
    }

    @SneakyThrows
    private Stock startCalculationProcessNoRedis(String code) {
        Stock stockFound = repository.getAllRelevant()
                .stream()
                .filter(stock -> stock.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new StockNotFoundException("Stock " + code + " not found"));

        Indicators indicators = stockCalculator.execute(stockFound);
        stockFound.setIndicators(indicators);
        return stockFound;
    }
}
