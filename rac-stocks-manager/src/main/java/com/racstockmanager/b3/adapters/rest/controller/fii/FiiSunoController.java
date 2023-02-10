package com.racstockmanager.b3.adapters.rest.controller.fii;

import com.racstockmanager.b3.adapters.rest.dto.fii.FiiShortSunoDto;
import com.racstockmanager.b3.core.methods.suno.FiiSunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/fiis/suno")
public class FiiSunoController {

    @Autowired
    private FiiSunoService service;

    @GetMapping()
    public ResponseEntity<?> getAll() {
        Set<FiiShortSunoDto> fiisShorts = service.getAll();
        return ResponseEntity.ok().body(fiisShorts);
    }
}
