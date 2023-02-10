package com.racstockmanager.b3.core.metrics;

import org.springframework.stereotype.Service;

@Service
public class StockMetrics {

    public long startTime() {
        return System.currentTimeMillis();
    }

    public void stopTime(long initialTime) {
        long tempoFinal = System.currentTimeMillis();
        System.out.printf("Process time: %.3f ms%n", (tempoFinal - initialTime) / 1000d);
    }
}
