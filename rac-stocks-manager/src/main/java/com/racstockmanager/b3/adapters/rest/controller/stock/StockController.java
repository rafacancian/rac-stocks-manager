package com.racstockmanager.b3.adapters.rest.controller.stock;

import com.racstockmanager.b3.core.lockprocess.Locker;
import com.racstockmanager.b3.core.methods.general.stock.StockService;
import com.racstockmanager.b3.core.model.stock.StockShort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/stocks")
@CrossOrigin(origins = {"http://localhost:3000"})
@Slf4j
public class StockController {

    @Autowired
    private StockService service;

    @Autowired
    Locker locker;

    @GetMapping("/all")
    public ResponseEntity<Set<StockShort>> getAll() {
        log.info("[B3 Controller] Get all stocks");
        Set<StockShort> stocksShorts = service.getAll();
        return ResponseEntity.ok().body(stocksShorts);
    }


    @GetMapping("/all/relevant")
    public ResponseEntity<Set<StockShort>> getAllRelevant() {
        Set<StockShort> stocks = new HashSet<>();
        try {
            locker.lock();
            log.info("[B3 Controller] Get all relevant stocks");
            stocks = service.getAllRelevant();
        } catch (InterruptedException e) {
            log.error("Interrupted exception on locker process: ", e);
            Thread.currentThread().interrupt();
        } finally {
            locker.unlock();
        }
        return ResponseEntity.ok().body(stocks);
    }

    @GetMapping("/{code}")
    public ResponseEntity<StockShort> getByCode(@PathVariable String code) {
        log.info("[B3 Controller] Get stock by code " + code);
        Optional<StockShort> stockShort = service.getStockByCode(code);
        return stockShort.map(aShort -> ResponseEntity.ok().body(aShort)).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/segment/{segment}")
    public ResponseEntity<Set<StockShort>> getBySegment(@PathVariable String segment) {
        log.info("[B3 Controller] Get stock by segment " + segment);
        Set<StockShort> stockShorts = service.getBySegment(segment);
        if (!stockShorts.isEmpty()) {
            return ResponseEntity.ok().body(stockShorts);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/sector/{sector}")
    public ResponseEntity<Set<StockShort>> getBySector(@PathVariable String sector) {
        log.info("[B3 Controller] Get stock by sector " + sector);
        Set<StockShort> stockShorts = service.getBySector(sector);
        if (!stockShorts.isEmpty()) {
            return ResponseEntity.ok().body(stockShorts);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/noredis/stock/{code}")
    public ResponseEntity<StockShort> singleCalculationForTest(@PathVariable String code) {
        log.info("[B3 Controller Test] Get stock by code " + code);
        StockShort stockShorts = service.getBySingleCalculationForTest(code);
        if (stockShorts != null) {
            return ResponseEntity.ok().body(stockShorts);
        }
        return ResponseEntity.notFound().build();
    }
}
