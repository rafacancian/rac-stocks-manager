package com.racstockmanager.b3.core.repository.stock.sectors;

import com.racstockmanager.b3.core.exceptions.StockNotFoundException;
import com.racstockmanager.b3.core.model.stock.Stock;
import lombok.SneakyThrows;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static com.racstockmanager.b3.core.model.stock.Sector.BENS_INDUSTRIAIS;

public class IndustrialGoods {

    private static final Stock AERI3 = new Stock("Aeris Ind. e com de equipamentos", "AERI3", BENS_INDUSTRIAIS, null);
    private static final Stock ALPK3 = new Stock("Allpark empreendimentos ", "ALPK3", BENS_INDUSTRIAIS, null);
    private static final Stock ARML3 = new Stock("Armc locação logistica e serviços", "ARML3", BENS_INDUSTRIAIS, null);
    private static final Stock ATMP3 = new Stock("Atma SA", "ATMP3", BENS_INDUSTRIAIS, null);
    private static final Stock AZEV3 = new Stock("Azevedo e travassos S.A", "AZEV3", BENS_INDUSTRIAIS, null);
    private static final Stock AZEV4 = new Stock("Azevedo e travassos S.A", "AZEV4", BENS_INDUSTRIAIS, null);
    private static final Stock AZUL4 = new Stock("Azul S.A", "AZUL4", BENS_INDUSTRIAIS, null, true);
    private static final Stock BBML3 = new Stock("BBM logistica S.A", "BBML3", BENS_INDUSTRIAIS, null);
    private static final Stock BDLL3 = new Stock("Bardella S.A industrias mecanicas", "BDLL3", BENS_INDUSTRIAIS, null);
    private static final Stock BDLL4 = new Stock("Bardella S.A industrias mecanicas", "BDLL4", BENS_INDUSTRIAIS, null);
    private static final Stock CCRO3 = new Stock("CCR", "CCRO3", BENS_INDUSTRIAIS, "Exploracao de Rodovias", true);
    private static final Stock CSUD3 = new Stock("CSU Digital S.A", "CSUD3", BENS_INDUSTRIAIS, null);
    private static final Stock DTCY3 = new Stock("Dtcom direct to company S.A", "DTCY3", BENS_INDUSTRIAIS, null);
    private static final Stock DTCY4 = new Stock("Dtcom direct to company S.A", "DTCY4", BENS_INDUSTRIAIS, null);
    private static final Stock EALT3 = new Stock("Electro Aco Altona S.A", "EALT3", BENS_INDUSTRIAIS, null);
    private static final Stock EALT4 = new Stock("Electro Aco Altona S.A", "EALT4", BENS_INDUSTRIAIS, null);
    private static final Stock ECOR3 = new Stock("Ecorodovias infraestruturas e logistica", "ECOR3", BENS_INDUSTRIAIS, null, true);
    private static final Stock EMBR3 = new Stock("Embraer S.A", "EMBR3", BENS_INDUSTRIAIS, null, true);
    private static final Stock ETER3 = new Stock("Eternit S.A", "ETER3", BENS_INDUSTRIAIS, null);
    private static final Stock FLEX3 = new Stock("Flex gestão de relacionamentos S.A", "FLEX3", BENS_INDUSTRIAIS, null);
    private static final Stock FRAS3 = new Stock("Fras-le S.A", "FRAS3", BENS_INDUSTRIAIS, null);
    private static final Stock FRIO3 = new Stock("Metalfrio solutions S.A", "FRIO3", BENS_INDUSTRIAIS, null);
    private static final Stock GGPS3 = new Stock("GPS participações e empreendimentos", "GGPS3", BENS_INDUSTRIAIS, null);
    private static final Stock GOLL4 = new Stock("Gol linhas aéreas inteligentes", "GOLL4", BENS_INDUSTRIAIS, null, true);
    private static final Stock HAGA3 = new Stock("Haga S.A industria e comercio", "HAGA3", BENS_INDUSTRIAIS, null);
    private static final Stock HAGA4 = new Stock("Haga S.A industria e comercio", "HAGA4", BENS_INDUSTRIAIS, null);
    private static final Stock HBSA3 = new Stock("Hidrovias do brasil S.A", "HBSA3", BENS_INDUSTRIAIS, null, true);
    private static final Stock INEP3 = new Stock("Inepar S.A industria e construções", "INEP3", BENS_INDUSTRIAIS, null);
    private static final Stock INEP4 = new Stock("Inepar S.A industria e construções", "INEP4", BENS_INDUSTRIAIS, null);
    private static final Stock JSLG3 = new Stock("JSL S.A", "JSLG3", BENS_INDUSTRIAIS, null);
    private static final Stock KEPL3 = new Stock("Kepler weber S.A", "KEPL3", BENS_INDUSTRIAIS, null);
    private static final Stock LOGN3 = new Stock("Log-in logistica intermodal S.A", "LOGN3", BENS_INDUSTRIAIS, null);
    private static final Stock LUXM3 = new Stock("Trevisa investimentos S.A", "LUXM3", BENS_INDUSTRIAIS, null);
    private static final Stock LUXM4 = new Stock("Trevisa investimentos S.A", "LUXM4", BENS_INDUSTRIAIS, null);
    private static final Stock MILS3 = new Stock("Mills estruturas e serviços de engenharia", "MILS3", BENS_INDUSTRIAIS, null, true);
    private static final Stock MRSA3B = new Stock("MRS logistica S.A", "MRSA3B", BENS_INDUSTRIAIS, null);
    private static final Stock MRSA5B = new Stock("MRS logistica S.A", "MRSA5B", BENS_INDUSTRIAIS, null);
    private static final Stock MRSA6B = new Stock("MRS logistica S.A", "MRSA6B", BENS_INDUSTRIAIS, null);
    private static final Stock MTSA3 = new Stock("Metisa metalurgica timboense S.A", "MTSA3", BENS_INDUSTRIAIS, null);
    private static final Stock MTSA4 = new Stock("Metisa metalurgica timboense S.A", "MTSA4", BENS_INDUSTRIAIS, null);
    private static final Stock MWET3 = new Stock("Wetzel S.A", "MWET3", BENS_INDUSTRIAIS, null);
    private static final Stock MWET4 = new Stock("Wetzel S.A", "MWET4", BENS_INDUSTRIAIS, null);
    private static final Stock NORD3 = new Stock("Nordon industrias metalurgicas S.A", "NORD3", BENS_INDUSTRIAIS, null);
    private static final Stock OPCT3 = new Stock("Oceanpact serviços maritimos S.A", "OPCT3", BENS_INDUSTRIAIS, null);
    private static final Stock POMO3 = new Stock("Marcopolo S.A", "POMO3", BENS_INDUSTRIAIS, null, true);
    private static final Stock POMO4 = new Stock("Marcopolo S.A", "POMO4", BENS_INDUSTRIAIS, null);
    private static final Stock PORT3 = new Stock("Wilson sons holdings brasil S.A", "PORT3", BENS_INDUSTRIAIS, null);
    private static final Stock PRNR3 = new Stock("Priner serviços industriais S.A", "PRNR3", BENS_INDUSTRIAIS, null);
    private static final Stock PTBL3 = new Stock("PBG S.A", "PTBL3", BENS_INDUSTRIAIS, null);
    private static final Stock PTCA11 = new Stock("Pratica klimaquip industria", "PTCA11", BENS_INDUSTRIAIS, null);
    private static final Stock PTCA3 = new Stock("Pratica klimaquip industria", "PTCA3", BENS_INDUSTRIAIS, null);
    private static final Stock RAIL3 = new Stock("Rumo S.A", "RAIL3", BENS_INDUSTRIAIS, null, true);
    private static final Stock RAPT3 = new Stock("Randon S.A implementos e participações", "RAPT4", BENS_INDUSTRIAIS, null, true);
    private static final Stock RAPT4 = new Stock("Randon S.A implementos e participações", "RAPT4", BENS_INDUSTRIAIS, null);
    private static final Stock RCSL3 = new Stock("Recrusul S.A", "RCSL3", BENS_INDUSTRIAIS, null);
    private static final Stock RCSL4 = new Stock("Recrusul S.A", "RCSL4", BENS_INDUSTRIAIS, null);
    private static final Stock RLOG3 = new Stock("Cosan logistica S.A", "RLOG3", BENS_INDUSTRIAIS, null);
    private static final Stock ROMI3 = new Stock("Industrias romi S.A", "ROMI3", BENS_INDUSTRIAIS, null);
    private static final Stock RSUL3 = new Stock("Metalurgica riosulense S.A", "RSUL3", BENS_INDUSTRIAIS, null);
    private static final Stock RSUL4 = new Stock("Metalurgica riosulense S.A", "RSUL4", BENS_INDUSTRIAIS, null);
    private static final Stock SEQL3 = new Stock("Sequia logistica e transportes S.A", "SEQL3", BENS_INDUSTRIAIS, null);
    private static final Stock SHUL3 = new Stock("Schulz S.A", "SHUL3", BENS_INDUSTRIAIS, null);
    private static final Stock SHUL4 = new Stock("Schulz S.A", "SHUL4", BENS_INDUSTRIAIS, null);
    private static final Stock SOND3 = new Stock("Sondotecnica engenharia solos S.A", "SOND3", BENS_INDUSTRIAIS, null);
    private static final Stock SOND5 = new Stock("Sondotecnica engenharia solos S.A", "SOND5", BENS_INDUSTRIAIS, null);
    private static final Stock SOND6 = new Stock("Sondotecnica engenharia solos S.A", "SOND6", BENS_INDUSTRIAIS, null);
    private static final Stock STBP3 = new Stock("Santos brasil participações S.A", "STBP3", BENS_INDUSTRIAIS, null);
    private static final Stock STTR3 = new Stock("Stara S.A industria de implementos", "STTR3", BENS_INDUSTRIAIS, null);
    private static final Stock TASA3 = new Stock("Taurus armas S.A", "TASA3", BENS_INDUSTRIAIS, null);
    private static final Stock TASA4 = new Stock("Taurus armas S.A", "TASA4", BENS_INDUSTRIAIS, "Armas e munições", true);
    private static final Stock TUPY3 = new Stock("Tupy", "TUPY3", BENS_INDUSTRIAIS, null, true);
    private static final Stock TCN03 = new Stock("Tecnosolo engenharia S.A", "TCN03", BENS_INDUSTRIAIS, null);
    private static final Stock TCN04 = new Stock("Tecnosolo engenharia S.A", "TCN04", BENS_INDUSTRIAIS, null);
    private static final Stock TGMA3 = new Stock("Tegma gestao logistica S.A", "TGMA3", BENS_INDUSTRIAIS, null, true);
    private static final Stock TPIS3 = new Stock("TPI Triunfo Particip e Invest S.A", "TPIS3", BENS_INDUSTRIAIS, "Exploracao de Rodovias", true);
    private static final Stock VAMO3 = new Stock("Vamos locação de caminhões e maquinas", "VAMO3", BENS_INDUSTRIAIS, null, true);
    private static final Stock VLID3 = new Stock("Valid soluções S.A", "VLID3", BENS_INDUSTRIAIS, null);
    private static final Stock VSPT3 = new Stock("Ferrovia centro atlantica S.A", "VSPT3", BENS_INDUSTRIAIS, null);
    private static final Stock VSPT4 = new Stock("Ferrovia centro atlantica S.A", "VSPT4", BENS_INDUSTRIAIS, null);
    private static final Stock WEGE3 = new Stock("WEG S.A", "WEGE3", BENS_INDUSTRIAIS, null, true);
    private static final Stock WLMM3 = new Stock("Wlm part. e comercio de maquinas", "WLMM3", BENS_INDUSTRIAIS, null);
    private static final Stock WLMM4 = new Stock("Wlm part. e comercio de maquinas", "WLMM4", BENS_INDUSTRIAIS, null);

    private static final Set<Stock> stocks = new HashSet<>();

    private static Set<Stock> getStocks() {
        if (stocks.isEmpty()) {
            Collections.addAll(stocks, AERI3, ALPK3, ARML3, ATMP3, AZEV3, AZEV4, AZUL4, BBML3, BDLL3, BDLL4, CCRO3, CSUD3,
                    DTCY3, DTCY4, EALT3, EALT4, ECOR3, EMBR3, ETER3, FLEX3, FRAS3, FRIO3, GGPS3, GOLL4, HAGA3, HAGA4, HBSA3,
                    INEP3, INEP4, JSLG3, KEPL3, LOGN3, LUXM3, LUXM4, MILS3, MRSA3B, MRSA5B, MRSA6B, MTSA3, MTSA4, MWET3,
                    MWET4, NORD3, OPCT3, POMO3, POMO4, PORT3, PRNR3, PTBL3, PTCA11, PTCA3, RAIL3, RAPT3, RAPT4, RCSL3,
                    RCSL4, RLOG3, ROMI3, RSUL3, RSUL4, SEQL3, SHUL3, SHUL4, SOND3, SOND5, SOND6, STBP3, STTR3, TASA3,
                    TASA4, TCN03, TCN04, TGMA3, TPIS3, TUPY3, VAMO3, VLID3, VSPT3, VSPT4, WEGE3, WLMM3, WLMM4);
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
