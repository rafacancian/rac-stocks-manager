package com.racstockmanager.b3.adapters.rest.controller.stock;

import com.racstockmanager.b3.core.methods.general.stock.B3Service;
import com.racstockmanager.b3.core.model.stock.StockShort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/stocks")
@CrossOrigin(origins = {"http://localhost:3000"})
public class B3Controller {

    @Autowired
    private B3Service service;

    @GetMapping()
    public ResponseEntity<?> getAll() {
        Set<StockShort> stocksShorts = service.getAll();
        return ResponseEntity.ok().body(stocksShorts);
    }

    @GetMapping("/stock/{code}")
    public ResponseEntity<?> getStockByCode(@PathVariable String code) {
        Optional<StockShort> stockShort = service.getStockByCode(code);
        if (stockShort.isPresent()) {
            return ResponseEntity.ok().body(stockShort.get());
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/segment/{segment}")
    public ResponseEntity<?> getStockBySegment(@PathVariable String segment) {
        Set<StockShort> stockShorts = service.getBySegment(segment);
        if (!stockShorts.isEmpty()) {
            return ResponseEntity.ok().body(stockShorts);
        }
        return ResponseEntity.notFound().build();
    }
}
