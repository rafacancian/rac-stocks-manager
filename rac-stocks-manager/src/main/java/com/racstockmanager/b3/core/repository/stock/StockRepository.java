package com.racstockmanager.b3.core.repository.stock;

import com.racstockmanager.b3.core.model.stock.Stock;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class StockRepository {

    public Set<Stock> getAll() {
        return StockRepositoryData.getAll();
    }

    public Set<Stock> getAllRelevant() {
        return StockRepositoryData.getRelevents();
    }

    public Set<Stock> getTopsSunoValues() {
        return StockRepositoryData.getTopsSunoValues();
    }

    public Set<Stock> getTopsSunoDividends() {
        return StockRepositoryData.getTopsSunoDividends();
    }

    public Set<Stock> getPersonal() {
        return StockRepositoryData.getPersonal();
    }
}
