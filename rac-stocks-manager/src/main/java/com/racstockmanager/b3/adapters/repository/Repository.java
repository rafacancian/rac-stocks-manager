package com.racstockmanager.b3.adapters.repository;

import com.racstockmanager.b3.core.model.fii.Fiis;
import com.racstockmanager.b3.core.model.stock.Stocks;

@org.springframework.stereotype.Repository
public interface Repository {

    void insert(String localDate, Stocks stocks);

    Stocks get(String localDate);

    void insert(String localDate, Fiis fiis);

    Fiis getFiis(String localDate);

    void clear();
}
