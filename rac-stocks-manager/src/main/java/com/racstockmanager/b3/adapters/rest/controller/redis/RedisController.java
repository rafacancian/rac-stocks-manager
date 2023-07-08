package com.racstockmanager.b3.adapters.rest.controller.redis;

import com.racstockmanager.b3.core.methods.general.fii.B3FiiService;
import com.racstockmanager.b3.core.methods.general.redis.RedisService;
import com.racstockmanager.b3.core.model.fii.FiiShort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisService service;

    @GetMapping("/clear")
    public ResponseEntity<?> clearRegisters() {
        service.clear();
        return ResponseEntity.ok().build();
    }
}
