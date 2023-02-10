package com.racstockmanager.b3.core.methods.general.fii;

import com.racstockmanager.b3.adapters.repository.RedisRepository;
import com.racstockmanager.b3.core.builders.fii.FiiBuilder;
import com.racstockmanager.b3.core.model.fii.Fii;
import com.racstockmanager.b3.core.model.fii.FiiIndicators;
import com.racstockmanager.b3.core.model.fii.FiiShort;
import com.racstockmanager.b3.core.model.fii.Fiis;
import com.racstockmanager.b3.core.print.StockPrints;
import com.racstockmanager.b3.core.repository.fii.FiiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Service
public class B3FiiService {

    @Autowired
    private B3FiiCalculations b3FiiCalculations;
    @Autowired
    private FiiRepository repository;
    @Autowired
    private StockPrints stockPrints;
    @Autowired
    private FiiBuilder fiiBuilder;

    @Autowired
    private RedisRepository redisRepository;

    public Set<FiiShort> getAll() {
        Fiis fiis = processFiis();
        // stockPrints.printStockInformation(B3Stocks.getStocks());
        return fiiBuilder.parseToShortInformation(fiis.getFiis());
    }


    private Fiis processFiis() {
        Fiis fiis = redisRepository.getFiis(LocalDate.now().toString());

        if (fiis == null || fiis.getLastCalculation().isBefore(LocalDate.now())) {
            Set<Fii> fiisResult = new HashSet<>();
            Set<Fii> fiisDB = repository.getAll();
            System.out.println("Starting fiis calculation");
            fiisDB.stream().forEach(f -> {
                FiiIndicators indicators = b3FiiCalculations.execute(f);
                f.setIndicators(indicators);
                fiisResult.add(f);
                System.out.print(".");
            });
            System.out.println("\nStocks calculation completed");
            fiis = new Fiis(LocalDate.now(), fiisResult);
            redisRepository.insert(LocalDate.now().toString(), fiis);
            return fiis;
        }
        return fiis;
    }
}
