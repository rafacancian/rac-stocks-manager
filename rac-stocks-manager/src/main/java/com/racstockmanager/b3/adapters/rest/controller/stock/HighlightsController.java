package com.racstockmanager.b3.adapters.rest.controller.stock;

import com.racstockmanager.b3.core.methods.general.highlights.HighlightsService;
import com.racstockmanager.b3.core.model.stock.StockHighlights;
import com.racstockmanager.b3.core.model.stock.TopicHighlights;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/highlights")
@CrossOrigin(origins = {"http://localhost:3000"})
@Slf4j
public class HighlightsController {

    @Autowired
    private HighlightsService service;

    @GetMapping("/topics")
    public ResponseEntity<?> getTopics() {
        log.debug("[B3 Highlights Controller] Get topics highlights");
        List<TopicHighlights> highlights = service.getTopicsHighlights();
        return ResponseEntity.ok().body(highlights);
    }

    @GetMapping("/stocks")
    public ResponseEntity<?> getStocks() {
        log.debug("[B3 Highlights Controller] Get Stocks highlights");
        List<StockHighlights> highlights = service.getStocksHighlights();
        return ResponseEntity.ok().body(highlights);
    }

    @GetMapping("/fiis")
    public ResponseEntity<?> getFIIs() {
        log.debug("[B3 Highlights Controller] Get FIIs highlights");
        List<StockHighlights> highlights = service.getFIIsHighlights();
        return ResponseEntity.ok().body(highlights);
    }

    @GetMapping("/bdrs")
    public ResponseEntity<?> getBDRs() {
        log.debug("[B3 Highlights Controller] Get BDRs highlights");
        List<StockHighlights> highlights = service.getBDRsHighlights();
        return ResponseEntity.ok().body(highlights);
    }

    @GetMapping("/criptos")
    public ResponseEntity<?> getCriptos() {
        log.debug("[B3 Highlights Controller] Get Criptos highlights");
        List<StockHighlights> highlights = service.getCriptosHighlights();
        return ResponseEntity.ok().body(highlights);
    }
}
