package com.racstockmanager.b3.adapters.rest.controller.stock;

import com.racstockmanager.b3.adapters.rest.dto.stock.StockShortSunoDto;
import com.racstockmanager.b3.core.methods.suno.SunoService;
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
public class SunoController {

    @Autowired
    private SunoService sunoService;

    @GetMapping(value = "/values")
    public ResponseEntity<?> getSunoValues() {
        Set<StockShortSunoDto> result = sunoService.getSunoValues();
        return ResponseEntity.ok().body(result);
    }

    @GetMapping(value = "/dividends")
    public ResponseEntity<?> getSunoDividends() {
        Set<StockShortSunoDto> result = sunoService.getSunoDividends();
        return ResponseEntity.ok().body(result);
    }


}
