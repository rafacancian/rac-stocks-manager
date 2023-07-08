package com.racstockmanager.b3.core.exceptions;

import com.racstockmanager.b3.core.model.stock.Stock;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StockNotFoundException extends Throwable {

    public StockNotFoundException(Stock stock) {
        String message = "Stock not found: " + stock.toString();
        log.error(message);
    }

    public StockNotFoundException(String code) {
        String message = "Stock not found: " + code;
        log.error(message);
    }
}
