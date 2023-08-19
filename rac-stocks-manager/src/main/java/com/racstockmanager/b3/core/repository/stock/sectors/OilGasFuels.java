package com.racstockmanager.b3.core.repository.stock.sectors;

import com.racstockmanager.b3.core.exceptions.StockNotFoundException;
import com.racstockmanager.b3.core.model.stock.Stock;
import lombok.SneakyThrows;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static com.racstockmanager.b3.core.model.stock.Sector.PETROLEO_GAS_BIOCOMBUSTIVEIS;

public class OilGasFuels {


    public static final String EXPLORACAO_REFINO_E_DISTRIBUICAO = "Exploração. Refino e Distribuição";
    public static final String EQUIPAMENTOS_E_SERVICOS = "Equipamentos e Serviços";

    private static final Stock CSAN3 = new Stock("Cosan", "CSAN3", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO, true);
    private static final Stock DMM011 = new Stock("Dommo energia", "DMM011", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO);
    private static final Stock DMMO3 = new Stock("Dommo energia", "DMM03", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO);
    private static final Stock ENAT3 = new Stock("Enauta participações", "ENAT3", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO, true);
    private static final Stock LUPA3 = new Stock("Lupatech", "LUPA3", PETROLEO_GAS_BIOCOMBUSTIVEIS, EQUIPAMENTOS_E_SERVICOS);
    private static final Stock OGXP3 = new Stock("Oleo e gás participações", "OGXP3", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO);
    private static final Stock OSXB3 = new Stock("Osx brasil", "OSXB3", PETROLEO_GAS_BIOCOMBUSTIVEIS, EQUIPAMENTOS_E_SERVICOS);
    private static final Stock PETR3 = new Stock("Petrobras", "PETR3", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO);
    private static final Stock PETR4 = new Stock("Petrobras", "PETR4", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO, true);
    private static final Stock PRIO3 = new Stock("Petro rio", "PRIO3", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO, true);
    private static final Stock RAIZ4 = new Stock("Raizen", "RAIZ4", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO, true);
    private static final Stock RECV3 = new Stock("Petroreconcavo", "RECV3", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO);
    private static final Stock RPMG3 = new Stock("Refinaria de petroleos manguinhos", "RPMG3", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO);
    private static final Stock RRRP3 = new Stock("3R petroleum óleo e gás", "RRRP3", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO, true);
    private static final Stock UGPA3 = new Stock("Ultrapar participações", "UGPA3", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO);
    private static final Stock VBBR3 = new Stock("Vibra energia", "VBBR3", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO);

    private static final Set<Stock> stocks = new HashSet<>();

    private static Set<Stock> getStocks() {
        if (stocks.isEmpty()) {
            Collections.addAll(stocks, CSAN3, DMM011, DMMO3, ENAT3, LUPA3, OGXP3, OSXB3, PETR3, PETR4, PRIO3, RAIZ4, RECV3,
                    RPMG3, RRRP3, UGPA3, VBBR3);
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
