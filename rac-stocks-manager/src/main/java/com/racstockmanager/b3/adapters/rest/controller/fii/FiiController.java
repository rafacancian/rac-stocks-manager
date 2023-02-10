package com.racstockmanager.b3.adapters.rest.controller.fii;

import com.racstockmanager.b3.core.methods.general.fii.B3FiiService;
import com.racstockmanager.b3.core.model.fii.FiiShort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/fiis")
public class FiiController {

    @Autowired
    private B3FiiService service;

    @GetMapping()
    public ResponseEntity<?> getAll() {
        Set<FiiShort> fiisShorts = service.getAll();
        return ResponseEntity.ok().body(fiisShorts);
    }
}
