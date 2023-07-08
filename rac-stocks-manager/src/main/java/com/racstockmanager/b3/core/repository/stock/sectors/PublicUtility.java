package com.racstockmanager.b3.core.repository.stock.sectors;

import com.racstockmanager.b3.core.model.stock.Stock;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static com.racstockmanager.b3.core.model.stock.Sector.UTILIDADE_PUBLICA;

public class PublicUtility {
    
    private static final Stock AESB3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock AFLT3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    public static final Stock ALUP11 = new Stock("Alupar", "ALUP11", UTILIDADE_PUBLICA, "", true);
    private static final Stock ALUP3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock ALUP4 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock AMBP3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock AURE3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CASN3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CASN4 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CBEE3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CEBR3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CEBR5 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CEBR6 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CEEB3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CEEB5 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CEEB6 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CEED3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CEGR3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CEPE3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CEPE5 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CEPE6 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CESP3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CESP5 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CESP6 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CGAS3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CGAS5 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CLSC3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CLSC4 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CMIG3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CMIG4 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock COCE3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock COCE5 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock COCE6 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CPFE3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CPLE11 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CPLE3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CPLE5 = new Stock("", "", UTILIDADE_PUBLICA, null);
    public static final Stock CPLE6 = new Stock("Copel", "CPLE6", UTILIDADE_PUBLICA, "ENERGIA_ELETRICA", true);
    private static final Stock CPRE3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CSMG3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CSRN3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CSRN5 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock CSRN6 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock EEEL3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock EEEL4 = new Stock("", "", UTILIDADE_PUBLICA, null);
    public static final Stock EGIE3 = new Stock("Engie Brasil", "EGIE3", UTILIDADE_PUBLICA, "ENERGIA_ELETRICA", true);
    private static final Stock EKTR3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock EKTR4 = new Stock("", "", UTILIDADE_PUBLICA, null);
    public static final Stock ELET3 = new Stock("Eletrobras", "ELET3", UTILIDADE_PUBLICA, "ENERGIA_ELETRICA", true);
    private static final Stock ELET5 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock ELET6 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock ELPL3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock EMAE3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock EMAE4 = new Stock("", "", UTILIDADE_PUBLICA, null);
    public static final Stock ENBR3 = new Stock("EDP Brasil", "ENBR3", UTILIDADE_PUBLICA, "ENERGIA_ELETRICA", true);
    private static final Stock ENEV3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock ENGI11 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock ENGI3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock ENGI4 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock ENMA3B = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock ENMA6B = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock ENMT3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock ENMT4 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock EQPA3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock EQPA5 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock EQPA6 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock EQPA7 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock EQTL3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock GEPA3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock GEPA4 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock GPAR3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock IGSN3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock LIGT3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock LIPR3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock MEGA3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    public static final Stock NEOE3 = new Stock("Neoenergia", "NEOE3", UTILIDADE_PUBLICA, "", true);
    private static final Stock OMGE3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock ORVR3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock POWE3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock REDE3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock RNEW11 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock RNEW3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock RNEW4 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock SAPR11 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock SAPR3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock SAPR4 = new Stock("Sanepar", "SAPR4", UTILIDADE_PUBLICA, "Agua e Saneamento", true);
    private static final Stock SBSP3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock TAEE11 = new Stock("TAEE11", "TAEE11", UTILIDADE_PUBLICA, "ENERGIA_ELETRICA", true);
    private static final Stock TAEE3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock TAEE4 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock TIET11 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock TIET3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock TIET4 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock TRPL3 = new Stock("", "", UTILIDADE_PUBLICA, null);
    private static final Stock TRPL4 = new Stock("", "", UTILIDADE_PUBLICA, null);


    private static final Set<Stock> stocks = new HashSet<>();

    private static Set<Stock> getStocks() {
        if (stocks.isEmpty()) {
            Collections.addAll(stocks, AESB3, AFLT3, ALUP11, ALUP3, ALUP4, AMBP3, AURE3, CASN3, CASN4, CBEE3, CEBR3,
                    CEBR5, CEBR6, CEEB3, CEEB5, CEEB6, CEED3, CEGR3, CEPE3, CEPE5, CEPE6, CESP3, CESP5, CESP6, CGAS3,
                    CGAS5, CLSC3, CLSC4, CMIG3, CMIG4, COCE3, COCE5, COCE6, CPFE3, CPLE11, CPLE3, CPLE5, CPLE6, CPRE3,
                    CSMG3, CSRN3, CSRN5, CSRN6, EEEL3, EEEL4, EGIE3, EKTR3, EKTR4, ELET3, ELET5, ELET6, ELPL3, EMAE3,
                    EMAE4, ENBR3, ENEV3, ENGI11, ENGI3, ENGI4, ENMA3B, ENMA6B, ENMT3, ENMT4, EQPA3, EQPA5, EQPA6, EQPA7,
                    EQTL3, GEPA3, GEPA4, GPAR3, IGSN3, LIGT3, LIPR3, MEGA3, NEOE3, OMGE3, ORVR3, POWE3, REDE3, RNEW3,
                    RNEW11, RNEW4, SAPR11, SAPR3, SAPR4, SBSP3, TAEE11, TAEE3, TAEE4, TIET11, TIET3, TIET4, TRPL3, TRPL4);
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
