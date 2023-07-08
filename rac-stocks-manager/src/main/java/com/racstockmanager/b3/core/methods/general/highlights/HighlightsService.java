package com.racstockmanager.b3.core.methods.general.highlights;

import com.racstockmanager.b3.core.model.stock.StockHighlights;
import com.racstockmanager.b3.core.model.stock.TopicHighlights;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class HighlightsService {

    @Autowired
    private HighlightsCalculator calculation;

    public List<TopicHighlights> getTopicsHighlights() {
        log.info("[B3 highlight Service] Getting topics highlights");
        return calculation.topicsHighlights();
    }

    public List<StockHighlights> getStocksHighlights() {
        log.info("[B3 highlight Service] Getting stocks highlights");
        return calculation.stocksHighlights();
    }

    public List<StockHighlights> getFIIsHighlights() {
        log.info("[B3 highlight Service] Getting FIIs highlights");
        return calculation.fiisHighlights();

    }

    public List<StockHighlights> getBDRsHighlights() {
        log.info("[B3 highlight Service] Getting BDRs highlights");
        return calculation.bdrsHighlights();
    }

    public List<StockHighlights> getCriptosHighlights() {
        log.info("[B3 highlight Service] Getting Criptos highlights");
        return calculation.criptosHighlights();
    }
}
