package com.racstockmanager.b3.core.repository.stock.sectors;

import com.racstockmanager.b3.core.model.stock.Stock;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static com.racstockmanager.b3.core.model.stock.Sector.MATERIAIS_BASICOS;

public class BasicMaterials {

    public static final String SIDERURGIA = "Siderurgia";
    public static final String QUIMICOS_DIVERSOS = "Químicos Diversos";
    public static final String PETROQUIMICOS = "Petroquímicos";
    public static final String PAPEL_E_CELULOSE = "Papel e Celulose";
    public static final String MINERAIS_METALICOS = "Minerais Metálicos";
    public static final String MADEIRA = "Madeira";
    public static final String MATERIAIS_DIVERSOS = "Materiais Diversos";
    public static final String EMBALAGENS = "Embalagens";
    public static final String ARTEFATOS_FERRO_ACO = "Artefatos de Ferro e Aço";
    public static final String ARTEFATOS_COBRE = "Artefatos de Cobre";
    public static final String FERTILIZANTES_DEFENSIVOS = "Fertilizantes e Defensivos";

    private static final Stock AURA33 = new Stock("Aura Minerals inc", "AURA33", MATERIAIS_BASICOS, MINERAIS_METALICOS, true);
    private static final Stock BRAP3 = new Stock("", "", MATERIAIS_BASICOS, MINERAIS_METALICOS);
    private static final Stock BRAP4 = new Stock("", "", MATERIAIS_BASICOS, MINERAIS_METALICOS);
    private static final Stock BRKM3 = new Stock("", "", MATERIAIS_BASICOS, PETROQUIMICOS);
    public static final Stock BRKM5 = new Stock("Braskem", "BRKM5", MATERIAIS_BASICOS, PETROQUIMICOS, true);
    private static final Stock BRKM6 = new Stock("", "", MATERIAIS_BASICOS, PETROQUIMICOS);
    private static final Stock CBVA3 = new Stock("", "", MATERIAIS_BASICOS, MINERAIS_METALICOS);
    private static final Stock CMIN3 = new Stock("", "", MATERIAIS_BASICOS, MINERAIS_METALICOS);
    private static final Stock CRPG3 = new Stock("", "", MATERIAIS_BASICOS, QUIMICOS_DIVERSOS);
    private static final Stock CRPG5 = new Stock("", "", MATERIAIS_BASICOS, QUIMICOS_DIVERSOS);
    private static final Stock CRPG6 = new Stock("", "", MATERIAIS_BASICOS, QUIMICOS_DIVERSOS);
    private static final Stock CSNA3 = new Stock("Cosan", "CSNA3", MATERIAIS_BASICOS, SIDERURGIA, true);
    private static final Stock DEXP3 = new Stock("", "", MATERIAIS_BASICOS, PETROQUIMICOS);
    private static final Stock DEXP4 = new Stock("", "", MATERIAIS_BASICOS, PETROQUIMICOS);
    private static final Stock DXCO3 = new Stock("", "", MATERIAIS_BASICOS, MADEIRA);
    private static final Stock ELEK3 = new Stock("", "", MATERIAIS_BASICOS, PETROQUIMICOS);
    private static final Stock ELEK4 = new Stock("", "", MATERIAIS_BASICOS, PETROQUIMICOS);
    private static final Stock EUCA3 = new Stock("", "", MATERIAIS_BASICOS, MADEIRA);
    private static final Stock EUCA4 = new Stock("", "", MATERIAIS_BASICOS, MADEIRA);
    private static final Stock FBMC3 = new Stock("", "", MATERIAIS_BASICOS, ARTEFATOS_FERRO_ACO);
    private static final Stock FBMC4 = new Stock("", "", MATERIAIS_BASICOS, ARTEFATOS_FERRO_ACO);
    private static final Stock FESA3 = new Stock("", "", MATERIAIS_BASICOS, SIDERURGIA);
    private static final Stock FESA4 = new Stock("", "", MATERIAIS_BASICOS, SIDERURGIA);
    private static final Stock FHER3 = new Stock("", "", MATERIAIS_BASICOS, FERTILIZANTES_DEFENSIVOS);
    private static final Stock GGBR3 = new Stock("", "", MATERIAIS_BASICOS, SIDERURGIA);
    private static final Stock GGBR4 = new Stock("", "", MATERIAIS_BASICOS, SIDERURGIA);
    private static final Stock GOAU3 = new Stock("", "", MATERIAIS_BASICOS, SIDERURGIA);
    private static final Stock GOAU4 = new Stock("", "", MATERIAIS_BASICOS, SIDERURGIA);
    public static final Stock KLBN11 = new Stock("Klabin", "KLBN11", MATERIAIS_BASICOS, PAPEL_E_CELULOSE, true);
    private static final Stock KLBN3 = new Stock("", "", MATERIAIS_BASICOS, PAPEL_E_CELULOSE);
    private static final Stock KLBN4 = new Stock("", "", MATERIAIS_BASICOS, PAPEL_E_CELULOSE);
    private static final Stock LTEL3B = new Stock("", "", MATERIAIS_BASICOS, MINERAIS_METALICOS);
    private static final Stock MGEL4 = new Stock("", "", MATERIAIS_BASICOS, ARTEFATOS_FERRO_ACO);
    private static final Stock MMXM3 = new Stock("", "", MATERIAIS_BASICOS, ARTEFATOS_FERRO_ACO);
    private static final Stock MTIG3 = new Stock("", "", MATERIAIS_BASICOS, MINERAIS_METALICOS);
    private static final Stock MTIG4 = new Stock("", "", MATERIAIS_BASICOS, EMBALAGENS);
    private static final Stock NEMO3 = new Stock("", "", MATERIAIS_BASICOS, EMBALAGENS);
    private static final Stock NEMO5 = new Stock("", "", MATERIAIS_BASICOS, PAPEL_E_CELULOSE);
    private static final Stock NEMO6 = new Stock("", "", MATERIAIS_BASICOS, PAPEL_E_CELULOSE);
    private static final Stock NUTR3 = new Stock("", "", MATERIAIS_BASICOS, FERTILIZANTES_DEFENSIVOS);
    private static final Stock PATI3 = new Stock("", "", MATERIAIS_BASICOS, ARTEFATOS_FERRO_ACO);
    private static final Stock PATI4 = new Stock("", "", MATERIAIS_BASICOS, ARTEFATOS_FERRO_ACO);
    private static final Stock PMAM3 = new Stock("", "", MATERIAIS_BASICOS, ARTEFATOS_COBRE);
    private static final Stock RANI3 = new Stock("", "", MATERIAIS_BASICOS, EMBALAGENS);
    private static final Stock RANI4 = new Stock("", "", MATERIAIS_BASICOS, EMBALAGENS);
    private static final Stock SNSY3 = new Stock("", "", MATERIAIS_BASICOS, MATERIAIS_DIVERSOS);
    private static final Stock SNSY5 = new Stock("", "", MATERIAIS_BASICOS, MATERIAIS_DIVERSOS);
    private static final Stock SNSY6 = new Stock("", "", MATERIAIS_BASICOS, MATERIAIS_DIVERSOS);
    private static final Stock SUZB3 = new Stock("", "", MATERIAIS_BASICOS, PAPEL_E_CELULOSE);
    private static final Stock TKN03 = new Stock("", "", MATERIAIS_BASICOS, ARTEFATOS_FERRO_ACO);
    private static final Stock TKN04 = new Stock("", "", MATERIAIS_BASICOS, ARTEFATOS_FERRO_ACO);
    private static final Stock UNIP3 = new Stock("", "", MATERIAIS_BASICOS, QUIMICOS_DIVERSOS);
    private static final Stock UNIP5 = new Stock("", "", MATERIAIS_BASICOS, QUIMICOS_DIVERSOS);
    public static final Stock UNIP6 = new Stock("Unipar", "UNIP6", MATERIAIS_BASICOS, QUIMICOS_DIVERSOS, true);
    private static final Stock USIM3 = new Stock("", "", MATERIAIS_BASICOS, SIDERURGIA);
    private static final Stock USIM5 = new Stock("Usiminas", "USIM5", MATERIAIS_BASICOS, SIDERURGIA, true);
    private static final Stock USIM6 = new Stock("", "", MATERIAIS_BASICOS, SIDERURGIA);
    public static final Stock VALE3 = new Stock("VALE", "VALE3", MATERIAIS_BASICOS, MINERAIS_METALICOS, true);
    private static final Stock VITT3 = new Stock("", "", MATERIAIS_BASICOS, FERTILIZANTES_DEFENSIVOS);

    private static final Set<Stock> stocks = new HashSet<>();

    private static Set<Stock> getStocks() {
        if (stocks.isEmpty()) {
            Collections.addAll(stocks, AURA33, BRAP3, BRAP4, BRKM3, BRKM5, BRKM6, CBVA3, CMIN3, CRPG3, CRPG5, CRPG6, CSNA3,
                    DEXP3, DEXP4, DXCO3, ELEK3, ELEK4, EUCA3, EUCA4, FBMC3, FBMC4, FESA3, FESA4, FHER3, GGBR3, GGBR4, GOAU3,
                    GOAU4, KLBN11, KLBN3, KLBN4, LTEL3B, MGEL4, MMXM3, MTIG3, MTIG4, NEMO3, NEMO5, NEMO6, NUTR3, PATI3,
                    PATI4, PMAM3, RANI3, RANI4, SNSY3, SNSY5, SNSY6, SUZB3, TKN03, TKN04, UNIP3, UNIP5, UNIP6, USIM3, USIM5,
                    USIM6, VALE3, VITT3);
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