package com.racstockmanager.b3.adapters.rest.controller.stock;

import com.racstockmanager.b3.adapters.rest.dto.stock.StockShortSunoDto;
import com.racstockmanager.b3.core.methods.suno.SunoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/stocks/suno")
@CrossOrigin(origins = {"http://localhost:3000"})
@Slf4j
public class SunoController {

    @Autowired
    private SunoService sunoService;

    @GetMapping(value = "/values")
    public ResponseEntity<?> getSunoValues() {
        log.info("[B3 Suno Controller] Get Suno values");
        Set<StockShortSunoDto> result = sunoService.getSunoValues();
        if (result.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(result);
    }

    @GetMapping(value = "/dividends")
    public ResponseEntity<?> getSunoDividends() {
        log.info("[B3 Suno Controller] Get Suno values");
        Set<StockShortSunoDto> result = sunoService.getSunoDividends();
        if (result.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(result);
    }


}
