package com.racstockmanager.b3.adapters.rest.controller.stock;

import com.racstockmanager.b3.adapters.rest.dto.stock.StockShortDto;
import com.racstockmanager.b3.core.methods.cheaper.CheaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/stocks/cheaper")
@CrossOrigin(origins = {"http://localhost:3000"})
public class CheaperController {

    @Autowired
    private CheaperService service;

    @GetMapping("/tops")
    public ResponseEntity<?> getTops() {
        Set<StockShortDto> result = service.getTops();
        return ResponseEntity.ok().body(result);
    }
}
