package com.racstockmanager.b3.adapters.repository;

import com.racstockmanager.b3.core.model.fii.Fiis;
import com.racstockmanager.b3.core.model.stock.StockHighlights;
import com.racstockmanager.b3.core.model.stock.Stocks;
import com.racstockmanager.b3.core.model.stock.StocksHighlights;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RMapCache;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class RedisRepository implements Repository {

    private RMapCache<String, Stocks> stocksRegisters;
    private RMapCache<String, Fiis> fiisRegisters;
    private RMapCache<String, StocksHighlights> stocksHighlightsRegisters;

    @Autowired
    private RedissonClient redissonClient;

    @Override
    public void insert(String localDate, Stocks stocks) {
        stocksRegisters = redissonClient.getMapCache("stocksRegisters");
        stocksRegisters.put(localDate, stocks, 3, TimeUnit.DAYS);
    }

    @Override
    public Stocks get(String localDate) {
        stocksRegisters = redissonClient.getMapCache("stocksRegisters");
        return Optional.ofNullable(stocksRegisters.get(localDate)).orElse(null);
    }

    @Override
    public Fiis getFiis(String localDate) {
        fiisRegisters = redissonClient.getMapCache("fiisRegisters");
        return Optional.ofNullable(fiisRegisters.get(localDate)).orElse(null);
    }

    @Override
    public void insert(String localDate, Fiis fiis) {
        fiisRegisters = redissonClient.getMapCache("fiisRegisters");
        fiisRegisters.put(localDate, fiis, 3, TimeUnit.DAYS);
    }

    public StocksHighlights getStocksHighlights(String localDate) {
        stocksHighlightsRegisters = redissonClient.getMapCache("StocksHighlights");
        return Optional.ofNullable(stocksHighlightsRegisters.get(localDate)).orElse(null);
    }

    public void clear() {
        try{
            log.info("[REDIS] cleaning registers");
            redissonClient.getMapCache("stocksRegisters").clear();
            redissonClient.getMapCache("fiisRegisters").clear();
        } catch (Exception e) {
            log.error("[REDIS] unexpected error when try to clean registers: " + e.getCause());
        }
    }

    /*
    public ObjectMapper objectMapper() {
        return new ObjectMapper()
                .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .registerModule(new JavaTimeModule());
    }*/
}
