package com.racstockmanager.b3.core.repository.stock.sectors;

import com.racstockmanager.b3.core.exceptions.StockNotFoundException;
import com.racstockmanager.b3.core.model.stock.Stock;
import lombok.SneakyThrows;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static com.racstockmanager.b3.core.model.stock.Sector.COMUNICACOES;

public class Comunications {

    public static final String TELECOMUNICACOES = "Telecomunicações";
    public static final String PUBLICIDADE = "Publicidade";

    private static final Stock BRIT3 = new Stock("Brisanet participações S.A", "BRIT3", COMUNICACOES, TELECOMUNICACOES);
    private static final Stock DESK3 = new Stock("Desktop sigmanet comunicação", "DESK3", COMUNICACOES, TELECOMUNICACOES);
    private static final Stock ELMD3 = new Stock("Eletromidia S.A", "ELMD3", COMUNICACOES, PUBLICIDADE);
    private static final Stock FIQE3 = new Stock("Unifique telecomunicações S.A", "FIQE3", COMUNICACOES, TELECOMUNICACOES);
    private static final Stock OIBR3 = new Stock("OI", "OIBR3", COMUNICACOES, TELECOMUNICACOES);
    private static final Stock OIBR4 = new Stock("OI", "OIBR4", COMUNICACOES, TELECOMUNICACOES, true);
    private static final Stock TELB3 = new Stock("Telec brasileiras S.A telebras", "TELB3", COMUNICACOES, TELECOMUNICACOES);
    private static final Stock TELB4 = new Stock("Telec brasileiras S.A telebras", "TELB4", COMUNICACOES, TELECOMUNICACOES);
    private static final Stock TIMS3 = new Stock("TIM participações S.A", "TIMS3", COMUNICACOES, TELECOMUNICACOES, true);
    private static final Stock VIVT3 = new Stock("Telefonica brasil S.A", "VIVT3", COMUNICACOES, TELECOMUNICACOES, true);
    private static final Stock VIVT4 = new Stock("Telefonica brasil S.A", "VIVT4", COMUNICACOES, TELECOMUNICACOES);

    private static final Set<Stock> stocks = new HashSet<>();

    private static Set<Stock> getStocks() {
        if (stocks.isEmpty()) {
            Collections.addAll(stocks, BRIT3, DESK3, ELMD3, FIQE3, OIBR3, OIBR4, TELB3, TELB4, TIMS3, VIVT3, VIVT4);
        }
        return stocks;
    }

    public static Set<Stock> getAll() {
        return getStocks();
    }

    public static Set<Stock> getRelevents() {
        return getStocks().stream().filter(Stock::getIsRelevant).collect(Collectors.toSet());
    }

    @SneakyThrows
    public static Stock getStockByCode(String code) {
        return getStocks().stream()
                .filter(stock -> stock.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new StockNotFoundException(code));
    }
}
