package com.racstockmanager.b3.adapters.rest.controller.stock;

import com.racstockmanager.b3.adapters.rest.dto.stock.StockShortDto;
import com.racstockmanager.b3.core.methods.barsi.BarsiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/stocks/barsi")
@CrossOrigin(origins = {"http://localhost:3000"})
public class BarsiController {

    @Autowired
    private BarsiService service;

    @GetMapping("/tops")
    public ResponseEntity<?> getTops() {
        Set<StockShortDto> result = service.getTops();
        return ResponseEntity.ok().body(result);
    }
}
