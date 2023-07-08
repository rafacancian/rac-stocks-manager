package com.racstockmanager.b3.core.repository.stock.sectors;

import com.racstockmanager.b3.core.model.stock.Stock;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static com.racstockmanager.b3.core.model.stock.Sector.CONSUMO_NAO_CICLICO;

public class NoCyclicConsumption {

    public static final String BEBIDAS = "Bebidas";
    public static final String PRODUTO_USO_PESSOAL = "Produtos de uso pessoal";
    public static final String CERVEJAS_E_REFRIGERANTES = "Cervejas e refrigerantes";
    public static final String CARNES_E_DERIVADOS = "Carnes e derivados";
    public static final String ACUCAR_E_ALCOOL = "Açucar e alcool";
    public static final String ALIMENTOS_DIVERSO = "Alimentos diversos";
    public static final String ALIMENTOS = "Alimentos";
    public static final String AGRICULTURA = "Agricultura";

    private static final Stock ABEV3 = new Stock("Ambev", "ABEV3", CONSUMO_NAO_CICLICO, CERVEJAS_E_REFRIGERANTES, true);
    public static final Stock AGRO3 = new Stock("Brasil agro", "AGRO3", CONSUMO_NAO_CICLICO, AGRICULTURA, true);
    private static final Stock AGXY3 = new Stock("", "", CONSUMO_NAO_CICLICO, AGRICULTURA);
    private static final Stock APTI3 = new Stock("", "", CONSUMO_NAO_CICLICO, AGRICULTURA);
    private static final Stock APTI4 = new Stock("", "", CONSUMO_NAO_CICLICO, AGRICULTURA);
    private static final Stock ASAI3 = new Stock("", "", CONSUMO_NAO_CICLICO, ALIMENTOS);
    private static final Stock BAUH4 = new Stock("", "", CONSUMO_NAO_CICLICO, CARNES_E_DERIVADOS);
    private static final Stock BEEF11 = new Stock("", "", CONSUMO_NAO_CICLICO, CARNES_E_DERIVADOS);
    private static final Stock BEEF3 = new Stock("", "", CONSUMO_NAO_CICLICO, CARNES_E_DERIVADOS);
    private static final Stock BOBR3 = new Stock("", "", CONSUMO_NAO_CICLICO, PRODUTO_USO_PESSOAL);
    private static final Stock BOBR4 = new Stock("", "", CONSUMO_NAO_CICLICO, CARNES_E_DERIVADOS);
    private static final Stock BSEV3 = new Stock("", "", CONSUMO_NAO_CICLICO, CARNES_E_DERIVADOS);
    private static final Stock CAML3 = new Stock("", "", CONSUMO_NAO_CICLICO, ACUCAR_E_ALCOOL);
    private static final Stock CTCA3 = new Stock("", "", CONSUMO_NAO_CICLICO, ALIMENTOS_DIVERSO);
    private static final Stock ESPA3 = new Stock("", "", CONSUMO_NAO_CICLICO, ALIMENTOS);
    private static final Stock FRTA3 = new Stock("", "", CONSUMO_NAO_CICLICO, AGRICULTURA);
    public static final Stock GMAT3 = new Stock("Grupo Mateus", "GMAT3", CONSUMO_NAO_CICLICO, PRODUTO_USO_PESSOAL, true);
    private static final Stock GRAO3 = new Stock("", "", CONSUMO_NAO_CICLICO, AGRICULTURA);
    private static final Stock JALL3 = new Stock("", "", CONSUMO_NAO_CICLICO, ACUCAR_E_ALCOOL);
    private static final Stock JBSS3 = new Stock("", "", CONSUMO_NAO_CICLICO, CARNES_E_DERIVADOS);
    private static final Stock JOPA3 = new Stock("", "", CONSUMO_NAO_CICLICO, ALIMENTOS_DIVERSO);
    private static final Stock JOPA4 = new Stock("", "", CONSUMO_NAO_CICLICO, ALIMENTOS_DIVERSO);
    private static final Stock LAND3 = new Stock("", "", CONSUMO_NAO_CICLICO, AGRICULTURA);
    private static final Stock MDIA3 = new Stock("", "", CONSUMO_NAO_CICLICO, ALIMENTOS_DIVERSO);
    private static final Stock MNPR3 = new Stock("", "", CONSUMO_NAO_CICLICO, CARNES_E_DERIVADOS);
    private static final Stock MRFG3 = new Stock("Marfrig", "MRFG3", CONSUMO_NAO_CICLICO, CARNES_E_DERIVADOS, true);
    private static final Stock NTCO3 = new Stock("", "", CONSUMO_NAO_CICLICO, PRODUTO_USO_PESSOAL);
    private static final Stock ODER4 = new Stock("", "", CONSUMO_NAO_CICLICO, ALIMENTOS_DIVERSO);
    private static final Stock PCAR3 = new Stock("", "", CONSUMO_NAO_CICLICO, ALIMENTOS);
    private static final Stock PCAR4 = new Stock("", "", CONSUMO_NAO_CICLICO, ALIMENTOS);
    private static final Stock SLCE3 = new Stock("", "", CONSUMO_NAO_CICLICO, AGRICULTURA);
    private static final Stock SMTO3 = new Stock("", "", CONSUMO_NAO_CICLICO, ACUCAR_E_ALCOOL);
    private static final Stock SOJA3 = new Stock("", "", CONSUMO_NAO_CICLICO, AGRICULTURA);
    private static final Stock TESA3 = new Stock("", "", CONSUMO_NAO_CICLICO, AGRICULTURA);
    public static final Stock TTEN3 = new Stock("Três tentos agroindustrial S.A", "TTEN3", CONSUMO_NAO_CICLICO, AGRICULTURA, true);

    private static final Set<Stock> stocks = new HashSet<>();

    private static Set<Stock> getStocks() {
        if (stocks.isEmpty()) {
            Collections.addAll(stocks, ABEV3, AGRO3, AGXY3, APTI3, APTI4, ASAI3, BAUH4, BEEF11, BEEF3, BOBR3, BOBR4,
                    BSEV3, CAML3, CTCA3, ESPA3, FRTA3, GMAT3, GRAO3, JALL3, JBSS3, JOPA3, JOPA4, LAND3, MDIA3, MNPR3,
                    MRFG3, NTCO3, ODER4, PCAR3, PCAR4, SLCE3, SMTO3, SOJA3, TESA3, TTEN3);
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
