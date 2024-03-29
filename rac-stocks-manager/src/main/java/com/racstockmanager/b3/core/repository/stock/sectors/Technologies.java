package com.racstockmanager.b3.core.repository.stock.sectors;

import com.racstockmanager.b3.core.exceptions.StockNotFoundException;
import com.racstockmanager.b3.core.model.stock.Stock;
import lombok.SneakyThrows;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static com.racstockmanager.b3.core.model.stock.Sector.TECNOLOGIA_DA_INFORMACAO;

public class Technologies {

    public static final String PROGRAMACAO_E_SERVICO = "Programas e Serviços";
    public static final String COMPUTADORES_E_EQUIPAMENTOS = "Computadores e Equipamentos";

    private static final Stock BMOB3 = new Stock("Bemobi mobile tech S.A", "BMOB3", TECNOLOGIA_DA_INFORMACAO, PROGRAMACAO_E_SERVICO);
    private static final Stock BRQB3 = new Stock("BRQ soluções em informatica S.A", "BRQB3", TECNOLOGIA_DA_INFORMACAO, PROGRAMACAO_E_SERVICO);
    private static final Stock CASH3 = new Stock("Méliuz S.A", "CASH3", TECNOLOGIA_DA_INFORMACAO, PROGRAMACAO_E_SERVICO, true);
    private static final Stock CLSA3 = new Stock("Clear sale S.A", "CLSA3", TECNOLOGIA_DA_INFORMACAO, PROGRAMACAO_E_SERVICO);
    private static final Stock DOTZ3 = new Stock("Dotz S.A.", "DOTZ3", TECNOLOGIA_DA_INFORMACAO, PROGRAMACAO_E_SERVICO);
    private static final Stock ENJU3 = new Stock("Enjoei atividade de internet S.A", "ENJU3", TECNOLOGIA_DA_INFORMACAO, PROGRAMACAO_E_SERVICO, true);
    private static final Stock IFCM3 = new Stock("Infracommerce CXAAS S.A.", "IFCM3", TECNOLOGIA_DA_INFORMACAO, PROGRAMACAO_E_SERVICO);
    private static final Stock INTB3 = new Stock("Intelbras S.A", "INTB3", TECNOLOGIA_DA_INFORMACAO, COMPUTADORES_E_EQUIPAMENTOS, true);
    private static final Stock ITEC3 = new Stock("Itautec", "ITEC3", TECNOLOGIA_DA_INFORMACAO, COMPUTADORES_E_EQUIPAMENTOS, true);
    private static final Stock LINX3 = new Stock("Linx", "LINX3", TECNOLOGIA_DA_INFORMACAO, PROGRAMACAO_E_SERVICO, true);
    private static final Stock LVTC3 = new Stock("Livetech da bahia industria e comercio", "LVTC3", TECNOLOGIA_DA_INFORMACAO, PROGRAMACAO_E_SERVICO);
    private static final Stock LWSA3 = new Stock("Locaweb serviços de internet", "LWSA3", TECNOLOGIA_DA_INFORMACAO, PROGRAMACAO_E_SERVICO, true);
    private static final Stock MLAS3 = new Stock("Multilaser industrial S.A", "MLAS3", TECNOLOGIA_DA_INFORMACAO, COMPUTADORES_E_EQUIPAMENTOS, true);
    private static final Stock MOSI3 = new Stock("Mosaico tecnologia ao consumidor", "MOSI3", TECNOLOGIA_DA_INFORMACAO, PROGRAMACAO_E_SERVICO);
    private static final Stock NGRD3 = new Stock("Neogrid", "NGRD3", TECNOLOGIA_DA_INFORMACAO, PROGRAMACAO_E_SERVICO, true);
    private static final Stock NINJ3 = new Stock("Getninjas", "NINJ3", TECNOLOGIA_DA_INFORMACAO, PROGRAMACAO_E_SERVICO);
    private static final Stock POSI3 = new Stock("Positivo", "POSI3", TECNOLOGIA_DA_INFORMACAO, COMPUTADORES_E_EQUIPAMENTOS, true);
    private static final Stock QUSW3 = new Stock("Quality software", "QUSW3", TECNOLOGIA_DA_INFORMACAO, PROGRAMACAO_E_SERVICO);
    private static final Stock SQIA3 = new Stock("Sinquia", "SQIA3", TECNOLOGIA_DA_INFORMACAO, PROGRAMACAO_E_SERVICO, true);
    private static final Stock TOTS3 = new Stock("Totvs", "TOTS3", TECNOLOGIA_DA_INFORMACAO, PROGRAMACAO_E_SERVICO, true);
    private static final Stock TRAD3 = new Stock("TC traders club", "TRAD3", TECNOLOGIA_DA_INFORMACAO, PROGRAMACAO_E_SERVICO);

    private static final Set<Stock> stocks = new HashSet<>();

    private static Set<Stock> getStocks() {
        if (stocks.isEmpty()) {
            Collections.addAll(stocks,
                    BMOB3, BRQB3, CASH3, CLSA3, DOTZ3, ENJU3, IFCM3, INTB3, ITEC3, LINX3, LVTC3, LWSA3, MLAS3, MOSI3,
                    NGRD3, NINJ3, POSI3, QUSW3, SQIA3, TOTS3, TRAD3);
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
