package com.racstockmanager.b3.core.methods.general.redis;

import com.racstockmanager.b3.adapters.repository.RedisRepository;
import com.racstockmanager.b3.core.builders.fii.FiiBuilder;
import com.racstockmanager.b3.core.methods.general.fii.B3FiiCalculations;
import com.racstockmanager.b3.core.model.fii.Fii;
import com.racstockmanager.b3.core.model.fii.FiiIndicators;
import com.racstockmanager.b3.core.model.fii.FiiShort;
import com.racstockmanager.b3.core.model.fii.Fiis;
import com.racstockmanager.b3.core.print.StockPrints;
import com.racstockmanager.b3.core.repository.fii.FiiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Service
public class RedisService {

    @Autowired
    private RedisRepository redisRepository;

    public void clear() {
      redisRepository.clear();
    }
}
