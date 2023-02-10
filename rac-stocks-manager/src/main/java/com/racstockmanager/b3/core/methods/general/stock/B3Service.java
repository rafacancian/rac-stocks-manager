package com.racstockmanager.b3.core.methods.general.stock;

import com.racstockmanager.b3.adapters.repository.RedisRepository;
import com.racstockmanager.b3.core.builders.stock.StockBuilder;
import com.racstockmanager.b3.core.model.stock.Indicators;
import com.racstockmanager.b3.core.model.stock.Stock;
import com.racstockmanager.b3.core.model.stock.StockShort;
import com.racstockmanager.b3.core.model.stock.Stocks;
import com.racstockmanager.b3.core.print.StockPrints;
import com.racstockmanager.b3.core.repository.stock.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class B3Service {

    //private Stocks stocks;
    //private Set<StockShort> stockShorts;

    @Autowired
    private B3Calculations b3Calculations;
    @Autowired
    private StockRepository repository;
    @Autowired
    private StockPrints stockPrints;
    @Autowired
    private StockBuilder stockBuilder;

    @Autowired
    private RedisRepository redisRepository;

    public Set<StockShort> getAll() {
        Stocks stocks = processStocks();
        // stockPrints.printStockInformation(B3Stocks.getStocks());
        return stockBuilder.parseToShortInformation(stocks.getStocks());
    }

    public Optional<StockShort> getStockByCode(String code) {
        Stocks stocks = processStocks();
        //stockPrints.printStockInformation(stocks.getStocks());

        Optional<StockShort> stockShort = stocks.getStocks().stream()
                .filter(stock -> stock.getCode().equalsIgnoreCase(code))
                .map(stockBuilder::parseToShortInformation)
                .findFirst();

        return stockShort;

    }

    public Set<StockShort> getBySegment(final String segment) {
        Stocks stocks = processStocks();
        //stockPrints.printStockInformation(stocks.getStocks());

        return stocks.getStocks().stream()
                .filter(stock -> stock.getSegment().contains(segment))
                .map(stockBuilder::parseToShortInformation)
                .collect(Collectors.toSet());
    }

    private Stocks processStocks() {
        Stocks stocks = redisRepository.get(LocalDate.now().toString());

        if (stocks == null || stocks.getLastCalculation().isBefore(LocalDate.now())) {
            Set<Stock> stocksResult = new HashSet<>();
            Set<Stock> stocksDB = repository.getAllStocks();
            System.out.println("Starting stocks calculation");
            stocksDB.stream().forEach(s -> {
                Indicators indicators = b3Calculations.execute(s);
                s.setIndicators(indicators);
                stocksResult.add(s);
                System.out.print(".");
            });
            System.out.println("\nStocks calculation completed");
            stocks = new Stocks(LocalDate.now(), stocksResult);
            redisRepository.insert(LocalDate.now().toString(), stocks);
            return stocks;
        }
        return stocks;
    }
}
