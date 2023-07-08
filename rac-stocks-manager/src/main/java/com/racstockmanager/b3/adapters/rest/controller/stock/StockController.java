package com.racstockmanager.b3.adapters.rest.controller.stock;

import com.racstockmanager.b3.core.methods.general.stock.StockService;
import com.racstockmanager.b3.core.model.stock.StockShort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/stocks")
@CrossOrigin(origins = {"http://localhost:3000"})
@Slf4j
public class StockController {

    @Autowired
    private StockService service;

    @GetMapping("/all")
    public ResponseEntity<?> getAll() {
        log.info("[B3 Controller] Get all stocks");
        Set<StockShort> stocksShorts = service.getAll();
        return ResponseEntity.ok().body(stocksShorts);
    }

    @GetMapping("/all/relevant")
    public ResponseEntity<?> getAllRelevant() {
        log.info("[B3 Controller] Get all relevant stocks");
        Set<StockShort> stocks = service.getAllRelevant();
        return ResponseEntity.ok().body(stocks);
    }

    @GetMapping("/{code}")
    public ResponseEntity<?> getByCode(@PathVariable String code) {
        log.info("[B3 Controller] Get stock by code " + code);
        Optional<StockShort> stockShort = service.getStockByCode(code);
        if (stockShort.isPresent()) {
            return ResponseEntity.ok().body(stockShort.get());
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/segment/{segment}")
    public ResponseEntity<?> getBySegment(@PathVariable String segment) {
        log.info("[B3 Controller] Get stock by segment " + segment);
        Set<StockShort> stockShorts = service.getBySegment(segment);
        if (!stockShorts.isEmpty()) {
            return ResponseEntity.ok().body(stockShorts);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/sector/{sector}")
    public ResponseEntity<?> getBySector(@PathVariable String sector) {
        log.info("[B3 Controller] Get stock by sector " + sector);
        Set<StockShort> stockShorts = service.getBySector(sector);
        if (!stockShorts.isEmpty()) {
            return ResponseEntity.ok().body(stockShorts);
        }
        return ResponseEntity.notFound().build();
    }
}
