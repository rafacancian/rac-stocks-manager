package com.racstockmanager.b3.core.repository.stock.sectors;

import com.racstockmanager.b3.core.exceptions.StockNotFoundException;
import com.racstockmanager.b3.core.model.stock.Stock;
import lombok.SneakyThrows;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static com.racstockmanager.b3.core.model.stock.Sector.SAUDE;

public class Health {

    public static final String SERVICO_MEDICO_HOSPITALAR_AND_DIAGNOSTICOS = "Serv.Méd.Hospit..Análises e Diagnósticos";
    public static final String MEDICAMENTOS_E_OUTROS_PRODUTOS = "Medicamentos e Outros Produtos";
    public static final String EQUIPAMENTOS = "Equipamentos";
    public static final Stock BLAU3 = new Stock("Blau farmáceutica S.A", "BLAU3", SAUDE, MEDICAMENTOS_E_OUTROS_PRODUTOS, true);
    public static final Stock PNVL3 = new Stock("Dimed", "PNVL3", SAUDE, MEDICAMENTOS_E_OUTROS_PRODUTOS, true);
    private static final Stock AALR3 = new Stock("", "AALR3", SAUDE, SERVICO_MEDICO_HOSPITALAR_AND_DIAGNOSTICOS);
    private static final Stock ADHM3 = new Stock("", "ADHM3", SAUDE, SERVICO_MEDICO_HOSPITALAR_AND_DIAGNOSTICOS);
    private static final Stock BALM3 = new Stock("", "BALM3", SAUDE, EQUIPAMENTOS);
    private static final Stock BALM4 = new Stock("", "BALM4", SAUDE, EQUIPAMENTOS);
    private static final Stock BIOM3 = new Stock("", "BIOM3", SAUDE, MEDICAMENTOS_E_OUTROS_PRODUTOS);
    private static final Stock BPHA3 = new Stock("", "BPHA3", SAUDE, MEDICAMENTOS_E_OUTROS_PRODUTOS);
    private static final Stock CREM3 = new Stock("", "CREM3", SAUDE, MEDICAMENTOS_E_OUTROS_PRODUTOS);
    private static final Stock DASA3 = new Stock("", "DASA3", SAUDE, SERVICO_MEDICO_HOSPITALAR_AND_DIAGNOSTICOS);
    private static final Stock DMVF3 = new Stock("", "DMVF3", SAUDE, MEDICAMENTOS_E_OUTROS_PRODUTOS);
    private static final Stock FLRY3 = new Stock("Fleury", "FLRY3", SAUDE, SERVICO_MEDICO_HOSPITALAR_AND_DIAGNOSTICOS, true);
    private static final Stock GBIO33 = new Stock("", "GBIO33", SAUDE, MEDICAMENTOS_E_OUTROS_PRODUTOS);
    private static final Stock GNDI3 = new Stock("", "GNDI3", SAUDE, SERVICO_MEDICO_HOSPITALAR_AND_DIAGNOSTICOS);
    private static final Stock HAPV3 = new Stock("", "HAPV3", SAUDE, SERVICO_MEDICO_HOSPITALAR_AND_DIAGNOSTICOS);
    private static final Stock HYPE3 = new Stock("", "HYPE3", SAUDE, MEDICAMENTOS_E_OUTROS_PRODUTOS);
    private static final Stock KRSA3 = new Stock("", "KRSA3", SAUDE, SERVICO_MEDICO_HOSPITALAR_AND_DIAGNOSTICOS);
    private static final Stock MATD3 = new Stock("", "MATD3", SAUDE, SERVICO_MEDICO_HOSPITALAR_AND_DIAGNOSTICOS);
    private static final Stock NRTQ3 = new Stock("", "NRTQ3", SAUDE, MEDICAMENTOS_E_OUTROS_PRODUTOS);
    private static final Stock ODPV3 = new Stock("", "ODPV3", SAUDE, SERVICO_MEDICO_HOSPITALAR_AND_DIAGNOSTICOS);
    private static final Stock OFSA3 = new Stock("", "OFSA3", SAUDE, MEDICAMENTOS_E_OUTROS_PRODUTOS);
    private static final Stock ONCO3 = new Stock("", "ONCO3", SAUDE, SERVICO_MEDICO_HOSPITALAR_AND_DIAGNOSTICOS);
    private static final Stock PARD3 = new Stock("", "PARD3", SAUDE, SERVICO_MEDICO_HOSPITALAR_AND_DIAGNOSTICOS);
    private static final Stock PFRM3 = new Stock("", "PFRM3", SAUDE, MEDICAMENTOS_E_OUTROS_PRODUTOS);
    private static final Stock PGMN3 = new Stock("", "PGMN3", SAUDE, MEDICAMENTOS_E_OUTROS_PRODUTOS);
    private static final Stock PNVL4 = new Stock("", "PNVL4", SAUDE, MEDICAMENTOS_E_OUTROS_PRODUTOS);
    private static final Stock QUAL3 = new Stock("", "QUAL3", SAUDE, SERVICO_MEDICO_HOSPITALAR_AND_DIAGNOSTICOS);
    private static final Stock RADL3 = new Stock("", "RADL3", SAUDE, MEDICAMENTOS_E_OUTROS_PRODUTOS);
    private static final Stock RDOR3 = new Stock("", "RDOR3", SAUDE, SERVICO_MEDICO_HOSPITALAR_AND_DIAGNOSTICOS);
    private static final Stock VVEO3 = new Stock("", "VVEO3", SAUDE, SERVICO_MEDICO_HOSPITALAR_AND_DIAGNOSTICOS);
    private static final Set<Stock> stocks = new HashSet<>();

    private static Set<Stock> getStocks() {
        if (stocks.isEmpty()) {
            Collections.addAll(stocks, AALR3, ADHM3, BALM3, BALM4, BIOM3, BLAU3, BPHA3, CREM3, DASA3, DMVF3, FLRY3,
                    GBIO33, GNDI3, HAPV3, HYPE3, KRSA3, MATD3, NRTQ3, ODPV3, OFSA3, ONCO3, PARD3, PFRM3, PGMN3, PNVL3,
                    PNVL4, QUAL3, RADL3, RDOR3, VVEO3);
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
