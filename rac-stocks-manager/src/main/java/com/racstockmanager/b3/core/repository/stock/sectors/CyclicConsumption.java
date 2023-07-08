package com.racstockmanager.b3.core.repository.stock.sectors;

import com.racstockmanager.b3.core.exceptions.StockNotFoundException;
import com.racstockmanager.b3.core.model.stock.Stock;
import lombok.SneakyThrows;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static com.racstockmanager.b3.core.model.stock.Sector.CONSUMO_CICLICO;

public class CyclicConsumption {

    private static final Set<Stock> stocks = new HashSet<>();
    private static final Stock AHEB3 = new Stock("", "AHEB3", CONSUMO_CICLICO, null);
    private static final Stock AHEB5 = new Stock("", "AHEB5", CONSUMO_CICLICO, null);
    private static final Stock AHEB6 = new Stock("", "AHEB6", CONSUMO_CICLICO, null);
    private static final Stock ALLD3 = new Stock("", "ALLD3", CONSUMO_CICLICO, null);
    private static final Stock ALPA3 = new Stock("", "ALPA3", CONSUMO_CICLICO, null);
    private static final Stock ALPA4 = new Stock("", "ALPA4", CONSUMO_CICLICO, null);
    private static final Stock AMAR3 = new Stock("Lojas Marisa", "AMAR3", CONSUMO_CICLICO, "TECIDOS_VESTUARIOS_E_CALCADOS", true);
    private static final Stock AMER3 = new Stock("Lojas americanas", "AMER3", CONSUMO_CICLICO, null, true);
    private static final Stock ANIM3 = new Stock("", "ANIM3", CONSUMO_CICLICO, null);
    private static final Stock ARZZ3 = new Stock("Arezzo", "ARZZ3", CONSUMO_CICLICO, null, true);
    private static final Stock AVLL3 = new Stock("", "AVLL3", CONSUMO_CICLICO, null);
    private static final Stock BAHI3 = new Stock("", "BAHI3", CONSUMO_CICLICO, null);
    private static final Stock BMKS3 = new Stock("", "BMKS3", CONSUMO_CICLICO, null);
    private static final Stock CALI3 = new Stock("", "CALI3", CONSUMO_CICLICO, null);
    private static final Stock CALI4 = new Stock("", "CALI4", CONSUMO_CICLICO, null);
    private static final Stock CAMB3 = new Stock("", "CAMB3", CONSUMO_CICLICO, null);
    private static final Stock CAMB4 = new Stock("", "CAMB4", CONSUMO_CICLICO, null);
    private static final Stock CATA3 = new Stock("", "CATA3", CONSUMO_CICLICO, null);
    private static final Stock CATA4 = new Stock("", "CATA4", CONSUMO_CICLICO, null);
    private static final Stock CEAB3 = new Stock("C&A", "CEAB3", CONSUMO_CICLICO, null, true);
    private static final Stock CEDO4 = new Stock("", "CEDO4", CONSUMO_CICLICO, null);
    private static final Stock CGRA3 = new Stock("", "CGRA3", CONSUMO_CICLICO, null);
    private static final Stock CGRA4 = new Stock("", "CGRA4", CONSUMO_CICLICO, null);
    private static final Stock CNSY3 = new Stock("", "CNSY3", CONSUMO_CICLICO, null);
    private static final Stock COGN3 = new Stock("Cogna on", "COGN3", CONSUMO_CICLICO, "SERVICOS_EDUCACIONAIS", true);
    private static final Stock CRDE3 = new Stock("", "CRDE3", CONSUMO_CICLICO, null);
    private static final Stock CSED3 = new Stock("", "CRDE3", CONSUMO_CICLICO, null);
    private static final Stock CTKA3 = new Stock("", "CTKA3", CONSUMO_CICLICO, null);
    private static final Stock CTKA4 = new Stock("", "CTKA4", CONSUMO_CICLICO, null);
    private static final Stock CTNM3 = new Stock("", "CTNM3", CONSUMO_CICLICO, null);
    private static final Stock CTNM4 = new Stock("", "CTNM4", CONSUMO_CICLICO, null);
    private static final Stock CTSA3 = new Stock("", "CTSA3", CONSUMO_CICLICO, null);
    private static final Stock CTSA4 = new Stock("", "CTSA4", CONSUMO_CICLICO, null);
    private static final Stock CTSA48 = new Stock("", "CTSA48", CONSUMO_CICLICO, null);
    private static final Stock CURY3 = new Stock("", "CURY3", CONSUMO_CICLICO, null);
    private static final Stock CVCB3 = new Stock("CVC Brasil", "CVCB3", CONSUMO_CICLICO, "VIAGENS_E_TURISMO", true);
    private static final Stock CYRE3 = new Stock("Cyrela", "CYRE3", CONSUMO_CICLICO, null, true);
    private static final Stock DIRR3 = new Stock("", "DIRR3", CONSUMO_CICLICO, null);
    private static final Stock DOHL3 = new Stock("", "DOHL3", CONSUMO_CICLICO, null);
    private static final Stock DOHL4 = new Stock("", "DOHL4", CONSUMO_CICLICO, null);
    private static final Stock ECPR3 = new Stock("", "ECPR3", CONSUMO_CICLICO, null);
    private static final Stock ECPR4 = new Stock("", "ECPR4", CONSUMO_CICLICO, null);
    private static final Stock ESTR3 = new Stock("", "ESTR3", CONSUMO_CICLICO, null);
    private static final Stock ESTR4 = new Stock("", "ESTR4", CONSUMO_CICLICO, null);
    private static final Stock EVEN3 = new Stock("", "EVEN3", CONSUMO_CICLICO, null);
    private static final Stock EZTC3 = new Stock("EZ Tec", "EZTC3", CONSUMO_CICLICO, "INCORPORACOES", true);
    private static final Stock GFSA3 = new Stock("", "GFSA3", CONSUMO_CICLICO, null);
    private static final Stock GRND3 = new Stock("Grendene", "GRND3", CONSUMO_CICLICO, "Calcados", true);
    private static final Stock GUAR3 = new Stock("", "GUAR3", CONSUMO_CICLICO, null);
    private static final Stock GUAR4 = new Stock("", "GUAR4", CONSUMO_CICLICO, null);
    private static final Stock HBOR3 = new Stock("", "HBOR3", CONSUMO_CICLICO, null);
    private static final Stock HETA3 = new Stock("", "HETA3", CONSUMO_CICLICO, null);
    private static final Stock HETA4 = new Stock("", "HETA4", CONSUMO_CICLICO, null);
    private static final Stock HGTX3 = new Stock("", "HGTX3", CONSUMO_CICLICO, null);
    private static final Stock HOOT3 = new Stock("", "HOOT3", CONSUMO_CICLICO, null);
    private static final Stock HOOT4 = new Stock("", "HOOT4", CONSUMO_CICLICO, null);
    private static final Stock INNT3 = new Stock("", "INNT3", CONSUMO_CICLICO, null);
    private static final Stock JFEN3 = new Stock("", "JFEN3", CONSUMO_CICLICO, null);
    private static final Stock JHSF3 = new Stock("", "JHSF3", CONSUMO_CICLICO, null);
    private static final Stock LAME3 = new Stock("", "LAME3", CONSUMO_CICLICO, null);
    private static final Stock LAME4 = new Stock("", "LAME4", CONSUMO_CICLICO, null);
    private static final Stock LAVV3 = new Stock("", "LAVV3", CONSUMO_CICLICO, null);
    private static final Stock LCAM3 = new Stock("", "LCAM3", CONSUMO_CICLICO, null);
    private static final Stock LEVE3 = new Stock("Mahle", "LEVE3", CONSUMO_CICLICO, null, true);
    private static final Stock LJQQ3 = new Stock("", "LJQQ3", CONSUMO_CICLICO, null);
    private static final Stock LREN3 = new Stock("Lojas Renner", "LREN3", CONSUMO_CICLICO, "TECIDOS_VESTUARIO_E_CALCADOS", true);
    private static final Stock MBLY3 = new Stock("", "MBLY3", CONSUMO_CICLICO, null);
    private static final Stock MDNE3 = new Stock("", "MDNE3", CONSUMO_CICLICO, null);
    private static final Stock MEAL3 = new Stock("", "MEAL3", CONSUMO_CICLICO, null);
    private static final Stock MELK3 = new Stock("", "MELK3", CONSUMO_CICLICO, null);
    private static final Stock MGLU3 = new Stock("Magazine Luiza", "MGLU3", CONSUMO_CICLICO, "Eletrodomesticos", true);
    private static final Stock MNDL3 = new Stock("", "MNDL3", CONSUMO_CICLICO, null);
    private static final Stock MOVI3 = new Stock("Movida", "MOVI3", CONSUMO_CICLICO, "Aluguel de carros", true);
    private static final Stock MRVE3 = new Stock("MRV Engenharia", "MRVE3", CONSUMO_CICLICO, null, true);
    private static final Stock MSPA3 = new Stock("", "MSPA3", CONSUMO_CICLICO, null);
    private static final Stock MSPA4 = new Stock("", "MSPA4", CONSUMO_CICLICO, null);
    private static final Stock MSRO3 = new Stock("", "MSRO3", CONSUMO_CICLICO, null);
    private static final Stock MTRE3 = new Stock("", "MSRO3", CONSUMO_CICLICO, null);
    private static final Stock MYPK3 = new Stock("Lochpe Maxion", "MYPK3", CONSUMO_CICLICO, null, true);
    private static final Stock NAFG3 = new Stock("", "NAFG3", CONSUMO_CICLICO, null);
    private static final Stock NAFG4 = new Stock("", "NAFG4", CONSUMO_CICLICO, null);
    private static final Stock PDGR3 = new Stock("", "PDGR3", CONSUMO_CICLICO, null);
    private static final Stock PETZ4 = new Stock("", "PETZ4", CONSUMO_CICLICO, null);
    private static final Stock PLAS3 = new Stock("", "PLAS3", CONSUMO_CICLICO, null);
    private static final Stock PLPL3 = new Stock("", "PLPL3", CONSUMO_CICLICO, null);
    private static final Stock PTNT3 = new Stock("", "PTNT3", CONSUMO_CICLICO, null);
    private static final Stock PTNT4 = new Stock("", "PTNT4", CONSUMO_CICLICO, null);
    private static final Stock RDNI3 = new Stock("", "RDNI3", CONSUMO_CICLICO, null);
    private static final Stock RENT3 = new Stock("", "RENT3", CONSUMO_CICLICO, null);
    private static final Stock RSID3 = new Stock("", "RSID3", CONSUMO_CICLICO, null);
    private static final Stock SBFG3 = new Stock("", "SBFG3", CONSUMO_CICLICO, null);
    private static final Stock SEDU3 = new Stock("", "SEDU3", CONSUMO_CICLICO, null);
    private static final Stock SEER3 = new Stock("", "SEER3", CONSUMO_CICLICO, null);
    private static final Stock SGPS3 = new Stock("", "SGPS3", CONSUMO_CICLICO, null);
    private static final Stock SHOW3 = new Stock("", "SHOW3", CONSUMO_CICLICO, null);
    private static final Stock SLED3 = new Stock("", "SLED3", CONSUMO_CICLICO, null);
    private static final Stock SLED4 = new Stock("", "SLED4", CONSUMO_CICLICO, null);
    private static final Stock SMFT3 = new Stock("", "SMFT3", CONSUMO_CICLICO, null);
    private static final Stock SMLS3 = new Stock("", "SMLS3", CONSUMO_CICLICO, null);
    private static final Stock SOMA3 = new Stock("", "SOMA3", CONSUMO_CICLICO, null);
    private static final Stock STKF3 = new Stock("", "STKF3", CONSUMO_CICLICO, null);
    private static final Stock TCSA3 = new Stock("", "TCSA3", CONSUMO_CICLICO, null);
    private static final Stock TECN3 = new Stock("", "TECN3", CONSUMO_CICLICO, null);
    private static final Stock TEKA3 = new Stock("", "TEKA3", CONSUMO_CICLICO, null);
    private static final Stock TEKA4 = new Stock("", "TEKA4", CONSUMO_CICLICO, null);
    private static final Stock TEND3 = new Stock("", "TEND3", CONSUMO_CICLICO, null);
    private static final Stock TFCO4 = new Stock("Track & Field", "TFCO4", CONSUMO_CICLICO, null, true);
    private static final Stock TOYB3 = new Stock("", "TOYB3", CONSUMO_CICLICO, null);
    private static final Stock TOYB4 = new Stock("", "TOYB4", CONSUMO_CICLICO, null);
    private static final Stock TRIS3 = new Stock("", "TRIS3", CONSUMO_CICLICO, null);
    private static final Stock TXRX3 = new Stock("", "TXRX3", CONSUMO_CICLICO, null);
    private static final Stock TXRX4 = new Stock("", "TXRX3", CONSUMO_CICLICO, null);
    private static final Stock UCAS3 = new Stock("", "UCAS3", CONSUMO_CICLICO, null);
    private static final Stock VIIA3 = new Stock("Via S.A", "VIIA3", CONSUMO_CICLICO, "Eletrodomesticos", true);
    private static final Stock VIVA3 = new Stock("Vivara", "VIVA3", CONSUMO_CICLICO, null, true);
    private static final Stock VIVR3 = new Stock("vivara", "VIVR3", CONSUMO_CICLICO, null, true);
    private static final Stock VSTE3 = new Stock("", "VSTE3", CONSUMO_CICLICO, null);
    private static final Stock VULC3 = new Stock("", "VULC3", CONSUMO_CICLICO, null);
    private static final Stock VVAR11 = new Stock("", "VVAR11", CONSUMO_CICLICO, null);
    private static final Stock VVAR4 = new Stock("", "VVAR4", CONSUMO_CICLICO, null);
    private static final Stock WEST3 = new Stock("", "WEST3", CONSUMO_CICLICO, null);
    private static final Stock WHRL3 = new Stock("", "WHRL3", CONSUMO_CICLICO, null);
    private static final Stock WHRL4 = new Stock("", "WHRL4", CONSUMO_CICLICO, null);
    private static final Stock YDUQ3 = new Stock("", "YDUQ3", CONSUMO_CICLICO, null);
    private static final Stock ZAMP3 = new Stock("", "ZAMP3", CONSUMO_CICLICO, null);

    private static Set<Stock> getStocks() {
        if (stocks.isEmpty()) {
            Collections.addAll(stocks, AHEB3, AHEB5, AHEB6, AHEB5, ALLD3, ALPA3, ALPA4, AMAR3, AMER3, ANIM3, ARZZ3, AVLL3,
                    BAHI3, BMKS3, CALI3, CALI4, CAMB3, CAMB4, CATA3, CATA4, CEAB3, CEDO4, CGRA3, CGRA4, CNSY3, COGN3,
                    CRDE3, CSED3, CTKA3, CTKA4, CTNM3, CTNM4, CTSA3, CTSA4, CTSA48, CURY3, CVCB3, CYRE3, DIRR3, DOHL3,
                    DOHL4, ECPR3, ECPR4, ESTR3, ESTR4, EVEN3, EZTC3, GFSA3, GRND3, GUAR3, GUAR4, HBOR3, HETA3, HETA4,
                    HGTX3, HOOT3, HOOT4, INNT3, JFEN3, JHSF3, LAME3, LAME4, LAVV3, LCAM3, LEVE3, LJQQ3, LREN3, MBLY3,
                    MDNE3, MEAL3, MELK3, MGLU3, MNDL3, MOVI3, MRVE3, MSPA3, MSPA4, MSRO3, MTRE3, MYPK3, NAFG3, NAFG4,
                    PDGR3, PETZ4, PLAS3, PLPL3, PTNT3, PTNT4, RDNI3, RENT3, RSID3, SBFG3, SEDU3, SEER3, SGPS3, SHOW3,
                    SLED3, SLED4, SMFT3, SMLS3, SOMA3, STKF3, TCSA3, TECN3, TEKA3, TEKA4, TEND3, TFCO4, TOYB3, TOYB4,
                    TRIS3, TXRX3, TXRX4, UCAS3, VIIA3, VIVA3, VIVR3, VSTE3, VULC3, VVAR11, VVAR4, WEST3, WHRL3, WHRL4,
                    YDUQ3, ZAMP3);
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