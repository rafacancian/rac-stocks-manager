package com.racstockmanager.b3.core.repository.stock.sectors;

import com.racstockmanager.b3.core.model.stock.Stock;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static com.racstockmanager.b3.core.model.stock.Sector.FINANCEIRO_E_OUTROS;

public class FinancialAndOthers {

    public static final String BANCOS = "Bancos";
    public static final String SEGURADORAS = "Seguradoras";
    public static final String EXPLORACAO_DE_IMOVEIS = "Exploração de imoveis";
    public static final String CORRETORA_DE_SEGUROS = "Corretora de seguros";

    private static final Stock ABCB4 = new Stock("", "ABCB4", FINANCEIRO_E_OUTROS, BANCOS);
    private static final Stock ALSO3 = new Stock("Alianscsonae", "ALSO3", FINANCEIRO_E_OUTROS, null, true);
    private static final Stock APER3 = new Stock("", "APER3", FINANCEIRO_E_OUTROS, null);
    private static final Stock ATOM3 = new Stock("", "ATOM3", FINANCEIRO_E_OUTROS, null);
    public static final Stock B3SA3 = new Stock("B3", "B3SA3", FINANCEIRO_E_OUTROS, null, true);
    private static final Stock BAZA3 = new Stock("Banco Amazonia", "BAZA3", FINANCEIRO_E_OUTROS, BANCOS, true);
    public static final Stock BBAS3 = new Stock("Banco do Brasil", "BBAS3", FINANCEIRO_E_OUTROS, BANCOS, true);
    private static final Stock BBDC3 = new Stock("Bradesco", "BBDC3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BBDC4 = new Stock("Bradesco", "BBDC4", FINANCEIRO_E_OUTROS, BANCOS, true);
    public static final Stock BBSE3 = new Stock("BB Seguridade", "BBSE3", FINANCEIRO_E_OUTROS, SEGURADORAS, true);
    private static final Stock BEES3 = new Stock("", "BEES3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BEES4 = new Stock("", "BEES4", FINANCEIRO_E_OUTROS, null);
    private static final Stock BFRE11 = new Stock("", "Stock", FINANCEIRO_E_OUTROS, null);
    private static final Stock BFRE12 = new Stock("", "BFRE12", FINANCEIRO_E_OUTROS, null);
    private static final Stock BGIP3 = new Stock("", "BGIP3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BGIP4 = new Stock("", "BGIP4", FINANCEIRO_E_OUTROS, null);
    private static final Stock BIDI11 = new Stock("", "BIDI11", FINANCEIRO_E_OUTROS, null);
    private static final Stock BIDI3 = new Stock("", "BIDI3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BIDI4 = new Stock("", "BIDI4", FINANCEIRO_E_OUTROS, null);
    private static final Stock BLUT3 = new Stock("", "BLUT3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BLUT4 = new Stock("", "BLUT4", FINANCEIRO_E_OUTROS, null);
    private static final Stock BMEB3 = new Stock("", "BMEB3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BMEB4 = new Stock("", "BMEB4", FINANCEIRO_E_OUTROS, null);
    private static final Stock BMGB4 = new Stock("", "BMGB4", FINANCEIRO_E_OUTROS, null);
    private static final Stock BMIN3 = new Stock("", "BMIN3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BMIN4 = new Stock("", "BMIN4", FINANCEIRO_E_OUTROS, null);
    private static final Stock BNBR3 = new Stock("", "BNBR3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BOAS3 = new Stock("", "BOAS3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BPAC11 = new Stock("", "BPAC11", FINANCEIRO_E_OUTROS, null);
    private static final Stock BPAC3 = new Stock("", "BPAC3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BPAC5 = new Stock("", "BPAC5", FINANCEIRO_E_OUTROS, null);
    private static final Stock BPAN4 = new Stock("", "BPAN4", FINANCEIRO_E_OUTROS, null);
    private static final Stock BPAR3 = new Stock("", "BPAR3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BPAT33 = new Stock("", "BPAT33", FINANCEIRO_E_OUTROS, null);
    public static final Stock BRBI11 = new Stock("BR Advisory Partners Participações S.A", "BRBI11", FINANCEIRO_E_OUTROS, BANCOS, true);
    private static final Stock BRBI3 = new Stock("", "BRBI3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BRBI4 = new Stock("", "BRBI4", FINANCEIRO_E_OUTROS, null);
    private static final Stock BRGE11 = new Stock("", "BRGE11", FINANCEIRO_E_OUTROS, null);
    private static final Stock BRML3 = new Stock("", "BRML3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BRPR3 = new Stock("", "BRPR3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BRSR3 = new Stock("", "BRSR3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BRSR5 = new Stock("", "BRSR5", FINANCEIRO_E_OUTROS, null);
    private static final Stock BRSR6 = new Stock("", "BRSR6", FINANCEIRO_E_OUTROS, null);
    private static final Stock BSLI3 = new Stock("", "BSLI3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BSLI4 = new Stock("", "BSLI4", FINANCEIRO_E_OUTROS, null);
    private static final Stock BTTL4 = new Stock("", "BTTL4", FINANCEIRO_E_OUTROS, null);
    private static final Stock CCXC3 = new Stock("", "CCXC3", FINANCEIRO_E_OUTROS, null);
    private static final Stock CIEL3 = new Stock("", "CIEL3", FINANCEIRO_E_OUTROS, null);
    private static final Stock CMSA3 = new Stock("", "CMSA3", FINANCEIRO_E_OUTROS, null);
    private static final Stock CMSA4 = new Stock("", "CMSA4", FINANCEIRO_E_OUTROS, null);
    private static final Stock CORR3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock CORR4 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock CRIV3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock CRIV4 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock CSAB3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock CSAB4 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock CXSE3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock EPAR3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock FIGE3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock FIGE4 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock FNCN3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock FTRT3B = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock G2DI33 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock GETT11 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock GPIV33 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock GSHP3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock HBRE3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock HBTS5 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock IDVL3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock IDVL4 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock IGBR3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock IGTA3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    public static final Stock IGTI11 = new Stock("Jereissati", "IGTI11", FINANCEIRO_E_OUTROS, EXPLORACAO_DE_IMOVEIS, true);
    private static final Stock IGTI3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock IGTI4 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock IRBR3 = new Stock("IRB", "IRBR3", FINANCEIRO_E_OUTROS, SEGURADORAS, true);
    private static final Stock ITSA3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock ITSA4 = new Stock("Itausa", "ITSA4", FINANCEIRO_E_OUTROS, BANCOS, true);
    private static final Stock ITUB3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock ITUB4 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock LHER3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock LHER4 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock LOGG3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock LPSB3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock MAPT3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock MAPT4 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock MERC3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock MERC4 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock MOAR3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock MODL11 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock MODL3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock MODL4 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock MULT3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock NEXP3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock PDTC3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock PEAB3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock PEAB4 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock PINE3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock PINE4 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock PPAR3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock PPLA11 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock PSSA3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock QVQP3B = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock RPAD3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock RPAD5 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock RPAD6 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock SANB11 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock SANB3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock SANB4 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock SCAR3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock SIMH3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock SPRT3B = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    public static final Stock SULA11 = new Stock("Sul America", "SULA11", FINANCEIRO_E_OUTROS, SEGURADORAS, true);
    private static final Stock SULA3 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock SULA4 = new Stock("", "", FINANCEIRO_E_OUTROS, null);
    private static final Stock SYNE3 = new Stock("SYN Prop e Tech S.A", "SYNE3", FINANCEIRO_E_OUTROS, EXPLORACAO_DE_IMOVEIS, true);
    public static final Stock WIZC3 = new Stock("WIZ", "WIZC3", FINANCEIRO_E_OUTROS, CORRETORA_DE_SEGUROS, true);

    private static final Set<Stock> stocks = new HashSet<>();

    private static Set<Stock> getStocks() {
        if (stocks.isEmpty()) {
            Collections.addAll(stocks, ABCB4, ALSO3, APER3, ATOM3, B3SA3, BAZA3, BBAS3, BBDC3, BBDC4, BBSE3, BEES3,
                    BEES4, BFRE11, BFRE12, BGIP3, BGIP4, BIDI11, BIDI3, BIDI4, BLUT3, BLUT4, BMEB3, BMEB4, BMIN3, BMIN4,
                    BNBR3, BOAS3, BPAC11, BPAC3, BPAC5, BPAN4, BPAR3, BPAT33, BRBI11, BRBI3, BRBI4, BRGE11, BRML3,
                    BRPR3, BRSR3, BRSR6, BSLI3, BSLI4, BTTL4, CCXC3, CIEL3, CMSA3, CMSA4, CORR3, CORR4, CRIV3, CRIV4,
                    CSAB3, CSAB4, CXSE3, EPAR3, FIGE3, FIGE4, FNCN3, FTRT3B, G2DI33, GETT11, GPIV33, GSHP3, HBRE3, HBTS5,
                    IDVL3, IDVL4, IGBR3, IGTA3, IGTI11, IGTI4, IRBR3, ITSA3, ITSA4, ITUB3, ITUB4, LHER3, LHER4, LOGG3,
                    LPSB3, MAPT3, MAPT4, MERC3, MERC4, MOAR3, MODL11, MODL3, MULT3, NEXP3, PDTC3, PEAB3, PEAB4, PINE3,
                    PINE4, PPAR3, PPLA11, PSSA3, QVQP3B, RPAD3, RPAD5, RPAD6, SANB11, SANB3, SANB4, SCAR3, SIMH3, SPRT3B,
                    SULA11, SULA3, SULA4, SYNE3, WIZC3);
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
