package com.racstockmanager.b3.core.repository.stock;

import com.racstockmanager.b3.core.model.stock.Stock;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class StockRepository {

    //Set<Stock> allStocks = getAllStocks();

    public Set<Stock> getAllStocks() {
        return StockRepositoryData.getAll();
    }
}
