package com.racstockmanager.b3.core.repository.stock.sectors;

import com.racstockmanager.b3.core.exceptions.StockNotFoundException;
import com.racstockmanager.b3.core.model.stock.Stock;
import lombok.SneakyThrows;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static com.racstockmanager.b3.core.model.stock.Sector.FINANCEIRO_E_OUTROS;

public class FinancialAndOthers {

    private static final String BANCOS = "Bancos";
    private static final String SEGURADORAS = "Seguradoras";
    private static final String EXPLORACAO_DE_IMOVEIS = "Exploração de imoveis";
    private static final String CORRETORA_DE_SEGUROS = "Corretora de seguros";

    private static final Stock ABCB4 = new Stock("Brasil ABC brasil", "ABCB4", FINANCEIRO_E_OUTROS, BANCOS, true);
    private static final Stock ALSO3 = new Stock("Alianscsonae", "ALSO3", FINANCEIRO_E_OUTROS, null, true);
    private static final Stock APER3 = new Stock("Alper", "APER3", FINANCEIRO_E_OUTROS, null);
    private static final Stock ATOM3 = new Stock("Atom empreendimetnos", "ATOM3", FINANCEIRO_E_OUTROS, null);
    private static final Stock B3SA3 = new Stock("B3", "B3SA3", FINANCEIRO_E_OUTROS, null, true);
    private static final Stock BAZA3 = new Stock("Banco Amazonia", "BAZA3", FINANCEIRO_E_OUTROS, BANCOS, true);
    private static final Stock BBAS3 = new Stock("Banco do Brasil", "BBAS3", FINANCEIRO_E_OUTROS, BANCOS, true);
    private static final Stock BBDC3 = new Stock("Bradesco", "BBDC3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BBDC4 = new Stock("Bradesco", "BBDC4", FINANCEIRO_E_OUTROS, BANCOS, true);
    private static final Stock BBSE3 = new Stock("BB Seguridade", "BBSE3", FINANCEIRO_E_OUTROS, SEGURADORAS, true);
    private static final Stock BEES3 = new Stock("Banco banestes", "BEES3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BEES4 = new Stock("Banco banestes", "BEES4", FINANCEIRO_E_OUTROS, null);
    private static final Stock BFRE11 = new Stock("Brazilian finance e real estate", "Stock", FINANCEIRO_E_OUTROS, null);
    private static final Stock BFRE12 = new Stock("Brazilian finance e real estate", "BFRE12", FINANCEIRO_E_OUTROS, null);
    private static final Stock BGIP3 = new Stock("Banco banese", "BGIP3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BGIP4 = new Stock("Banco banese", "BGIP4", FINANCEIRO_E_OUTROS, null);
    private static final Stock BIDI11 = new Stock("Banco inter", "BIDI11", FINANCEIRO_E_OUTROS, null);
    private static final Stock BIDI3 = new Stock("Banco inter", "BIDI3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BIDI4 = new Stock("Banco inter", "BIDI4", FINANCEIRO_E_OUTROS, null);
    private static final Stock BLUT3 = new Stock("Blue tech solutions", "BLUT3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BLUT4 = new Stock("Blue tech solutions", "BLUT4", FINANCEIRO_E_OUTROS, null);
    private static final Stock BMEB3 = new Stock("Banco mercantil do brasil", "BMEB3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BMEB4 = new Stock("Banco mercantil do brasil", "BMEB4", FINANCEIRO_E_OUTROS, null);
    private static final Stock BMGB4 = new Stock("Banco BMG", "BMGB4", FINANCEIRO_E_OUTROS, null, true);
    private static final Stock BMIN3 = new Stock("Banco mercantil de investimentos", "BMIN3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BMIN4 = new Stock("Banco mercantil de investimentos", "BMIN4", FINANCEIRO_E_OUTROS, null);
    private static final Stock BNBR3 = new Stock("Banco nordeste do brasil", "BNBR3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BOAS3 = new Stock("Boa vista serviços", "BOAS3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BPAC11 = new Stock("BTG", "BPAC11", FINANCEIRO_E_OUTROS, null);
    private static final Stock BPAC3 = new Stock("BTG", "BPAC3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BPAC5 = new Stock("BTG", "BPAC5", FINANCEIRO_E_OUTROS, null);
    private static final Stock BPAN4 = new Stock("Banco pan", "BPAN4", FINANCEIRO_E_OUTROS, null);
    private static final Stock BPAR3 = new Stock("Banco banpara", "BPAR3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BPAT33 = new Stock("Banco patagonia", "BPAT33", FINANCEIRO_E_OUTROS, null);
    private static final Stock BRBI11 = new Stock("BR Advisory Partners Participações", "BRBI11", FINANCEIRO_E_OUTROS, BANCOS, true);
    private static final Stock BRBI3 = new Stock("BR Advisory Partners Participações", "BRBI3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BRBI4 = new Stock("BR Advisory Partners Participações", "BRBI4", FINANCEIRO_E_OUTROS, null);
    private static final Stock BRGE3 = new Stock("Consórcio alfa de administração", "BRGE3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BRML3 = new Stock("BR malls", "BRML3", FINANCEIRO_E_OUTROS, null, true);
    private static final Stock BRPR3 = new Stock("BR properties", "BRPR3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BRSR3 = new Stock("Banco banrisul", "BRSR3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BRSR5 = new Stock("Banco banrisul", "BRSR5", FINANCEIRO_E_OUTROS, null);
    private static final Stock BRSR6 = new Stock("Banco banrisul", "BRSR6", FINANCEIRO_E_OUTROS, null);
    private static final Stock BSLI3 = new Stock("BRB bco de brasilia", "BSLI3", FINANCEIRO_E_OUTROS, null);
    private static final Stock BSLI4 = new Stock("BRB bco de brasilia", "BSLI4", FINANCEIRO_E_OUTROS, null);
    private static final Stock BTTL4 = new Stock("Embpar participações", "BTTL4", FINANCEIRO_E_OUTROS, null);
    private static final Stock CCXC3 = new Stock("CCX", "CCXC3", FINANCEIRO_E_OUTROS, null);
    private static final Stock CIEL3 = new Stock("Cielo", "CIEL3", FINANCEIRO_E_OUTROS, null, true);
    private static final Stock CMSA3 = new Stock("Cims", "CMSA3", FINANCEIRO_E_OUTROS, null);
    private static final Stock CMSA4 = new Stock("Cims", "CMSA4", FINANCEIRO_E_OUTROS, null);
    private static final Stock CORR3 = new Stock("Correa ribeiro", "CORR3", FINANCEIRO_E_OUTROS, null);
    private static final Stock CORR4 = new Stock("Correa ribeiro", "CORR4", FINANCEIRO_E_OUTROS, null);
    private static final Stock CRIV3 = new Stock("Financeira alfa", "CRIV3", FINANCEIRO_E_OUTROS, null);
    private static final Stock CRIV4 = new Stock("Financeira alfa", "CRIV4", FINANCEIRO_E_OUTROS, null);
    private static final Stock CSAB3 = new Stock("Cia seguros aliança da bahia", "CSAB3", FINANCEIRO_E_OUTROS, null);
    private static final Stock CSAB4 = new Stock("Cia seguros aliança da bahia", "CSAB4", FINANCEIRO_E_OUTROS, null);
    private static final Stock CXSE3 = new Stock("Caixa seguridade participações", "CXSE3", FINANCEIRO_E_OUTROS, null, true);
    private static final Stock EPAR3 = new Stock("embpar participações", "EPAR3", FINANCEIRO_E_OUTROS, null);
    private static final Stock FIGE3 = new Stock("Investimentos bemge", "FIGE3", FINANCEIRO_E_OUTROS, null);
    private static final Stock FIGE4 = new Stock("Investimentos bemge", "FIGE4", FINANCEIRO_E_OUTROS, null);
    private static final Stock FNCN3 = new Stock("Finansinos credito financeiros", "FNCN3", FINANCEIRO_E_OUTROS, null);
    private static final Stock FTRT3B = new Stock("Futuretel", "FTRT3B", FINANCEIRO_E_OUTROS, null);
    private static final Stock G2DI33 = new Stock("G2D investiments", "G2DI33", FINANCEIRO_E_OUTROS, null);
    private static final Stock GETT3 = new Stock("Getnet", "GETT3", FINANCEIRO_E_OUTROS, null);
    private static final Stock GPIV33 = new Stock("GP investimentos", "GPIV33", FINANCEIRO_E_OUTROS, null);
    private static final Stock GSHP3 = new Stock("General shopping", "GSHP3", FINANCEIRO_E_OUTROS, null);
    private static final Stock HBRE3 = new Stock("HRB Realty empreendimentos", "HBRE3", FINANCEIRO_E_OUTROS, null);
    private static final Stock HBTS5 = new Stock("Habitasul", "HBTS5", FINANCEIRO_E_OUTROS, null);
    private static final Stock IDVL3 = new Stock("Banco indusval", "IDVL3", FINANCEIRO_E_OUTROS, null);
    private static final Stock IDVL4 = new Stock("Banco indusval", "IDVL4", FINANCEIRO_E_OUTROS, null);
    private static final Stock IGBR3 = new Stock("IGB eletronica", "IGBR3", FINANCEIRO_E_OUTROS, null);
    private static final Stock IGTA3 = new Stock("Iguatemi empresa de shopping centers", "IGTA3", FINANCEIRO_E_OUTROS, null, true);
    private static final Stock IGTI11 = new Stock("Jereissati", "IGTI11", FINANCEIRO_E_OUTROS, EXPLORACAO_DE_IMOVEIS, true);
    private static final Stock IGTI3 = new Stock("Jereissati", "IGTI3", FINANCEIRO_E_OUTROS, null);
    private static final Stock IGTI4 = new Stock("Jereissati", "IGTI4", FINANCEIRO_E_OUTROS, null);
    private static final Stock IRBR3 = new Stock("IRB", "IRBR3", FINANCEIRO_E_OUTROS, SEGURADORAS, true);
    private static final Stock ITSA3 = new Stock("Itausa", "ITSA3", FINANCEIRO_E_OUTROS, null);
    private static final Stock ITSA4 = new Stock("Itausa", "ITSA4", FINANCEIRO_E_OUTROS, BANCOS, true);
    private static final Stock ITUB3 = new Stock("Banco itau unibanco", "ITUB3", FINANCEIRO_E_OUTROS, null, true);
    private static final Stock ITUB4 = new Stock("Banco itau unibanco", "ITUB4", FINANCEIRO_E_OUTROS, null);
    private static final Stock LHER3 = new Stock("Lojas hering", "LHER3", FINANCEIRO_E_OUTROS, null);
    private static final Stock LHER4 = new Stock("Lojas hering", "LHER4", FINANCEIRO_E_OUTROS, null);
    private static final Stock LOGG3 = new Stock("Log commercial properties", "LOGG3", FINANCEIRO_E_OUTROS, null);
    private static final Stock LPSB3 = new Stock("Lopes brasil", "LPSB3", FINANCEIRO_E_OUTROS, null);
    private static final Stock MAPT3 = new Stock("Cemepe", "MAPT3", FINANCEIRO_E_OUTROS, null);
    private static final Stock MAPT4 = new Stock("Cemepe", "MAPT4", FINANCEIRO_E_OUTROS, null);
    private static final Stock MERC3 = new Stock("Mercantil do brasil financeira", "MERC3", FINANCEIRO_E_OUTROS, null);
    private static final Stock MERC4 = new Stock("Mercantil do brasil financeira", "MERC4", FINANCEIRO_E_OUTROS, null);
    private static final Stock MOAR3 = new Stock("Monteiro aranha", "MOAR3", FINANCEIRO_E_OUTROS, null);
    private static final Stock MODL11 = new Stock("Banco modal", "MODL11", FINANCEIRO_E_OUTROS, null);
    private static final Stock MODL3 = new Stock("Banco modal", "MODL3", FINANCEIRO_E_OUTROS, null);
    private static final Stock MODL4 = new Stock("Banco modal", "MODL4", FINANCEIRO_E_OUTROS, null);
    private static final Stock MULT3 = new Stock("Multiplan", "MULT3", FINANCEIRO_E_OUTROS, null);
    private static final Stock NEXP3 = new Stock("Nexpe participações", "NEXP3", FINANCEIRO_E_OUTROS, null);
    private static final Stock PDTC3 = new Stock("Padtec holding", "PDTC3", FINANCEIRO_E_OUTROS, null);
    private static final Stock PEAB3 = new Stock("Cia participações alianca da bahia", "PEAB3", FINANCEIRO_E_OUTROS, null);
    private static final Stock PEAB4 = new Stock("Cia participações alianca da bahia", "PEAB4", FINANCEIRO_E_OUTROS, null);
    private static final Stock PINE3 = new Stock("Banco pine", "PINE3", FINANCEIRO_E_OUTROS, null);
    private static final Stock PINE4 = new Stock("Banco pine", "PINE4", FINANCEIRO_E_OUTROS, null);
    private static final Stock PPAR3 = new Stock("Polpar", "PPAR3", FINANCEIRO_E_OUTROS, null);
    private static final Stock PPLA11 = new Stock("Ppla participações", "PPLA11", FINANCEIRO_E_OUTROS, null);
    private static final Stock PSSA3 = new Stock("Porto seguro", "PSSA3", FINANCEIRO_E_OUTROS, null, true);
    private static final Stock QVQP3B = new Stock("524 participações", "QVQP3B", FINANCEIRO_E_OUTROS, null);
    private static final Stock RPAD3 = new Stock("Alfa holdings", "RPAD3", FINANCEIRO_E_OUTROS, null);
    private static final Stock RPAD5 = new Stock("Alfa holdings", "RPAD5", FINANCEIRO_E_OUTROS, null);
    private static final Stock RPAD6 = new Stock("Alfa holdings", "RPAD6", FINANCEIRO_E_OUTROS, null);
    private static final Stock SANB11 = new Stock("Banco santander", "SANB11", FINANCEIRO_E_OUTROS, null);
    private static final Stock SANB3 = new Stock("Banco santander", "SANB3", FINANCEIRO_E_OUTROS, null, true);
    private static final Stock SANB4 = new Stock("Banco santander", "SANB4", FINANCEIRO_E_OUTROS, null);
    private static final Stock SCAR3 = new Stock("São carlos", "SCAR3", FINANCEIRO_E_OUTROS, null);
    private static final Stock SIMH3 = new Stock("Simpar", "SIMH3", FINANCEIRO_E_OUTROS, null, true);
    private static final Stock SPRT3B = new Stock("Longdis", "SPRT3B", FINANCEIRO_E_OUTROS, null);
    private static final Stock SULA11 = new Stock("Sul America", "SULA11", FINANCEIRO_E_OUTROS, SEGURADORAS, true);
    private static final Stock SULA3 = new Stock("Sul America", "SULA3", FINANCEIRO_E_OUTROS, null);
    private static final Stock SULA4 = new Stock("Sul America", "SULA4", FINANCEIRO_E_OUTROS, null);
    private static final Stock SYNE3 = new Stock("SYN Prop e Tech S.A", "SYNE3", FINANCEIRO_E_OUTROS, EXPLORACAO_DE_IMOVEIS, true);
    private static final Stock WIZC3 = new Stock("WIZ", "WIZC3", FINANCEIRO_E_OUTROS, CORRETORA_DE_SEGUROS, true);

    private static final Set<Stock> stocks = new HashSet<>();

    private static Set<Stock> getStocks() {
        if (stocks.isEmpty()) {
            Collections.addAll(stocks, ABCB4, ALSO3, APER3, ATOM3, B3SA3, BAZA3, BBAS3, BBDC3, BBDC4, BBSE3, BEES3,
                    BEES4, BFRE11, BFRE12, BGIP3, BGIP4, BIDI11, BIDI3, BIDI4, BLUT3, BLUT4, BMEB3, BMEB4, BMGB4, BMIN3,
                    BMIN4, BNBR3, BOAS3, BPAC11, BPAC3, BPAC5, BPAN4, BPAR3, BPAT33, BRBI11, BRBI3, BRBI4, BRGE3, BRML3,
                    BRPR3, BRSR3, BRSR5, BRSR6, BSLI3, BSLI4, BTTL4, CCXC3, CIEL3, CMSA3, CMSA4, CORR3, CORR4, CRIV3, CRIV4,
                    CSAB3, CSAB4, CXSE3, EPAR3, FIGE3, FIGE4, FNCN3, FTRT3B, G2DI33, GETT3, GPIV33, GSHP3, HBRE3, HBTS5,
                    IDVL3, IDVL4, IGBR3, IGTA3, IGTI11, IGTI3, IGTI4, IRBR3, ITSA3, ITSA4, ITUB3, ITUB4, LHER3, LHER4, LOGG3,
                    LPSB3, MAPT3, MAPT4, MERC3, MERC4, MOAR3, MODL11, MODL3, MODL4, MULT3, NEXP3, PDTC3, PEAB3, PEAB4, PINE3,
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

    @SneakyThrows
    public static Stock getStockByCode(String code) {
        return getStocks().stream()
                .filter(stock -> stock.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new StockNotFoundException(code));
    }
}
