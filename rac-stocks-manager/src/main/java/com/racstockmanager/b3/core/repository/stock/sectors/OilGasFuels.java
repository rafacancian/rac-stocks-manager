package com.racstockmanager.b3.core.repository.stock.sectors;

import com.racstockmanager.b3.core.model.stock.Stock;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static com.racstockmanager.b3.core.model.stock.Sector.PETROLEO_GAS_BIOCOMBUSTIVEIS;

public class OilGasFuels {


    public static final String EXPLORACAO_REFINO_E_DISTRIBUICAO = "Exploração. Refino e Distribuição";
    public static final String EQUIPAMENTOS_E_SERVICOS = "Equipamentos e Serviços";

    private static final Stock CSAN3 = new Stock("", "", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO);
    private static final Stock DMM011 = new Stock("", "", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO);
    private static final Stock DMMO3 = new Stock("", "", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO);
    private static final Stock ENAT3 = new Stock("", "", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO);
    private static final Stock LUPA3 = new Stock("", "", PETROLEO_GAS_BIOCOMBUSTIVEIS, EQUIPAMENTOS_E_SERVICOS);
    private static final Stock OGXP3 = new Stock("", "", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO);
    private static final Stock OSXB3 = new Stock("", "", PETROLEO_GAS_BIOCOMBUSTIVEIS, EQUIPAMENTOS_E_SERVICOS);
    private static final Stock PETR3 = new Stock("", "", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO);
    public static final Stock PETR4 = new Stock("Petrobras", "PETR4", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO, true);
    private static final Stock PRIO3 = new Stock("", "", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO);
    private static final Stock RAIZ4 = new Stock("", "", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO);
    private static final Stock RECV3 = new Stock("", "", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO);
    private static final Stock RPMG3 = new Stock("", "", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO);
    private static final Stock RRRP3 = new Stock("", "", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO);
    private static final Stock UGPA3 = new Stock("", "", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO);
    private static final Stock VBBR3 = new Stock("", "", PETROLEO_GAS_BIOCOMBUSTIVEIS, EXPLORACAO_REFINO_E_DISTRIBUICAO);

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
}
