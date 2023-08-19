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

    private static final String AUTOMOVEIS_MOTOCICLETAS = "Automóveis e motocicletas";
    private static final String COMERCIO = "Comércio";
    private static final String CONSTRUCAO_CIVIL = "Construção civil";
    private static final String SERVICOS_EDUCACIONAIS = "Serviços educacionais";
    private static final String ALUGUEL_CARROS = "Aluguel de carros";
    private static final String PROGRAMA_FIDELIZACAO = "Programa de fidelização";
    private static final String HOTEIS_RESTAURANTES = "Hoteis e restaurantes";
    private static final String MIDIA = "Mídia";
    private static final String TECIDOS_VESTUARIOS_CALCADOS = "Tecidos, vestuários e calçados";
    private static final String UTILIDADES_DOMESTICAS = "Utilidades domésticas";
    private static final String VIAGENS_LAZER = "viagens e lazer";
    
    private static final Stock AHEB3 = new Stock("São paulo turismo", "AHEB3", CONSUMO_CICLICO, VIAGENS_LAZER);
    private static final Stock AHEB5 = new Stock("São paulo turismo", "AHEB5", CONSUMO_CICLICO, VIAGENS_LAZER);
    private static final Stock AHEB6 = new Stock("São paulo turismo", "AHEB6", CONSUMO_CICLICO, VIAGENS_LAZER);
    private static final Stock ALLD3 = new Stock("Allied tecnologia", "ALLD3", CONSUMO_CICLICO, COMERCIO);
    private static final Stock ALPA3 = new Stock("Alpargatas", "ALPA3", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS, true);
    private static final Stock ALPA4 = new Stock("Alpargatas", "ALPA4", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock AMAR3 = new Stock("Lojas Marisa", "AMAR3", CONSUMO_CICLICO, COMERCIO, true);
    private static final Stock AMER3 = new Stock("Lojas americanas", "AMER3", CONSUMO_CICLICO, COMERCIO, true);
    private static final Stock ANIM3 = new Stock("Anima", "ANIM3", CONSUMO_CICLICO, SERVICOS_EDUCACIONAIS);
    private static final Stock ARZZ3 = new Stock("Arezzo", "ARZZ3", CONSUMO_CICLICO, COMERCIO, true);
    private static final Stock AVLL3 = new Stock("Alphaville", "AVLL3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL);
    private static final Stock BAHI3 = new Stock("Bahema", "BAHI3", CONSUMO_CICLICO, SERVICOS_EDUCACIONAIS);
    private static final Stock BMKS3 = new Stock("Bicicletas monark", "BMKS3", CONSUMO_CICLICO, VIAGENS_LAZER);
    private static final Stock CALI3 = new Stock("Construtora adolpho lindenberg", "CALI3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL);
    private static final Stock CALI4 = new Stock("Construtora adolpho lindenberg", "CALI4", CONSUMO_CICLICO, CONSTRUCAO_CIVIL);
    private static final Stock CAMB3 = new Stock("Cambuci", "CAMB3", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock CAMB4 = new Stock("Cambuci", "CAMB4", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock CATA3 = new Stock("Cia industrial cataguases", "CATA3", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock CATA4 = new Stock("Cia industrial cataguases", "CATA4", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock CEAB3 = new Stock("C&A", "CEAB3", CONSUMO_CICLICO, COMERCIO, true);
    private static final Stock CEDO3 = new Stock("Cedro textil", "CEDO4", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock CEDO4 = new Stock("Cedro textil", "CEDO4", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock CGRA3 = new Stock("Grazziotin", "CGRA3", CONSUMO_CICLICO, COMERCIO);
    private static final Stock CGRA4 = new Stock("Grazziotin", "CGRA4", CONSUMO_CICLICO, COMERCIO);
    private static final Stock CNSY3 = new Stock("Cinesystem", "CNSY3", CONSUMO_CICLICO, MIDIA);
    private static final Stock COGN3 = new Stock("Cogna on", "COGN3", CONSUMO_CICLICO, SERVICOS_EDUCACIONAIS, true);
    private static final Stock CSED3 = new Stock("Cruzeiro do sul educacional", "CRDE3", CONSUMO_CICLICO, SERVICOS_EDUCACIONAIS, true);
    private static final Stock CTKA3 = new Stock("Karsten", "CTKA3", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock CTKA4 = new Stock("Karsten", "CTKA4", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock CTNM3 = new Stock("Coteminas", "CTNM3", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock CTNM4 = new Stock("Coteminas", "CTNM4", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock CTSA3 = new Stock("Santanense", "CTSA3", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock CTSA4 = new Stock("Santanense", "CTSA4", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock CTSA48 = new Stock("Santanense", "CTSA48", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock CURY3 = new Stock("Cury construtora e incorporadora", "CURY3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL);
    private static final Stock CVCB3 = new Stock("CVC Brasil", "CVCB3", CONSUMO_CICLICO, VIAGENS_LAZER, true);
    private static final Stock CYRE3 = new Stock("Cyrela", "CYRE3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL, true);
    private static final Stock DIRR3 = new Stock("Direcional engenharia", "DIRR3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL);
    private static final Stock DOHL3 = new Stock("Dohler", "DOHL3", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock DOHL4 = new Stock("Dohler", "DOHL4", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock ECPR3 = new Stock("Encorpar", "ECPR3", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock ECPR4 = new Stock("Encorpar", "ECPR4", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock ESTR3 = new Stock("Estrela", "ESTR3", CONSUMO_CICLICO, VIAGENS_LAZER);
    private static final Stock ESTR4 = new Stock("Estrela", "ESTR4", CONSUMO_CICLICO, VIAGENS_LAZER);
    private static final Stock EVEN3 = new Stock("Even construtora e incorporadora", "EVEN3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL);
    private static final Stock EZTC3 = new Stock("EZ Tec", "EZTC3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL, true);
    private static final Stock FIEI3 = new Stock("Fica empreendimentos imobiliarios", "GFSA3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL);
    private static final Stock GFSA3 = new Stock("Gafisa", "GFSA3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL);
    private static final Stock GRND3 = new Stock("Grendene", "GRND3", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS, true);
    private static final Stock GUAR3 = new Stock("Guararapes confecções", "GUAR3", CONSUMO_CICLICO, COMERCIO);
    private static final Stock GUAR4 = new Stock("Guararapes confecções", "GUAR4", CONSUMO_CICLICO, COMERCIO);
    private static final Stock HBOR3 = new Stock("Helbor", "HBOR3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL);
    private static final Stock HETA3 = new Stock("Hercules", "HETA3", CONSUMO_CICLICO, UTILIDADES_DOMESTICAS);
    private static final Stock HETA4 = new Stock("Hercules", "HETA4", CONSUMO_CICLICO, UTILIDADES_DOMESTICAS);
    private static final Stock HGTX3 = new Stock("Cia Hering", "HGTX3", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock HOOT3 = new Stock("Hoteis othon", "HOOT3", CONSUMO_CICLICO, HOTEIS_RESTAURANTES);
    private static final Stock HOOT4 = new Stock("Hoteis othon", "HOOT4", CONSUMO_CICLICO, HOTEIS_RESTAURANTES);
    private static final Stock INNT3 = new Stock("Inter construtora e incorporadora", "INNT3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL);
    private static final Stock JFEN3 = new Stock("João fortes engenharia", "JFEN3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL);
    private static final Stock JHSF3 = new Stock("JHSF", "JHSF3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL);
    private static final Stock LAME3 = new Stock("Lojas americanas", "LAME3", CONSUMO_CICLICO, COMERCIO, true);
    private static final Stock LAME4 = new Stock("Lojas americanas", "LAME4", CONSUMO_CICLICO, COMERCIO);
    private static final Stock LAVV3 = new Stock("Lavvi empreendimentos imobiliarios", "LAVV3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL, true);
    private static final Stock LCAM3 = new Stock("Locamerica", "LCAM3", CONSUMO_CICLICO, ALUGUEL_CARROS);
    private static final Stock LEVE3 = new Stock("Mahle metal leve", "LEVE3", CONSUMO_CICLICO, AUTOMOVEIS_MOTOCICLETAS, true);
    private static final Stock LJQQ3 = new Stock("Lojas quero quero", "LJQQ3", CONSUMO_CICLICO, COMERCIO);
    private static final Stock LREN3 = new Stock("Lojas Renner", "LREN3", CONSUMO_CICLICO, COMERCIO, true);
    private static final Stock MBLY3 = new Stock("Mobly", "MBLY3", CONSUMO_CICLICO, COMERCIO, true);
    private static final Stock MDNE3 = new Stock("Moura dubeux enhenharia", "MDNE3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL);
    private static final Stock MEAL3 = new Stock("International meal company", "MEAL3", CONSUMO_CICLICO, HOTEIS_RESTAURANTES);
    private static final Stock MELK3 = new Stock("Melnick even desenvolvimento", "MELK3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL);
    private static final Stock MGLU3 = new Stock("Magazine Luiza", "MGLU3", CONSUMO_CICLICO, COMERCIO, true);
    private static final Stock MNDL3 = new Stock("Mundial", "MNDL3", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS, false);
    private static final Stock MOVI3 = new Stock("Movida", "MOVI3", CONSUMO_CICLICO, ALUGUEL_CARROS, true);
    private static final Stock MRVE3 = new Stock("MRV Engenharia e participações", "MRVE3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL, true);
    private static final Stock MSPA3 = new Stock("Melhoramentos", "MSPA3", CONSUMO_CICLICO, MIDIA);
    private static final Stock MSPA4 = new Stock("Melhoramentos", "MSPA4", CONSUMO_CICLICO, MIDIA);
    private static final Stock MSRO3 = new Stock("Maestro locadora de veiculos", "MSRO3", CONSUMO_CICLICO, ALUGUEL_CARROS);
    private static final Stock MTRE3 = new Stock("Mitre realty empreendimentos", "MSRO3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL);
    private static final Stock MYPK3 = new Stock("Lochpe Maxion", "MYPK3", CONSUMO_CICLICO, AUTOMOVEIS_MOTOCICLETAS, true);
    private static final Stock NAFG3 = new Stock("Nadir figueiredo", "NAFG3", CONSUMO_CICLICO, UTILIDADES_DOMESTICAS);
    private static final Stock NAFG4 = new Stock("Melhoramentos", "NAFG4", CONSUMO_CICLICO, UTILIDADES_DOMESTICAS);
    private static final Stock PDGR3 = new Stock("PDG realty", "PDGR3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL);
    private static final Stock PETZ3 = new Stock("Petz", "PETZ3", CONSUMO_CICLICO, COMERCIO, true);
    private static final Stock PLAS3 = new Stock("Plascar participações", "PLAS3", CONSUMO_CICLICO, AUTOMOVEIS_MOTOCICLETAS);
    private static final Stock PLPL3 = new Stock("Plano e plano desenvolvimento", "PLPL3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL);
    private static final Stock PTNT3 = new Stock("Pettenati", "PTNT3", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock PTNT4 = new Stock("Pettenati", "PTNT4", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock RDNI3 = new Stock("RNI negócios imobiliarios", "RDNI3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL);
    private static final Stock RENT3 = new Stock("Localiza", "RENT3", CONSUMO_CICLICO, ALUGUEL_CARROS, true);
    private static final Stock RSID3 = new Stock("Rossi residencial", "RSID3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL, true);
    private static final Stock SBFG3 = new Stock("Centauro", "SBFG3", CONSUMO_CICLICO, COMERCIO, true);
    private static final Stock SEDU3 = new Stock("Somos educacional", "SEDU3", CONSUMO_CICLICO, SERVICOS_EDUCACIONAIS, true);
    private static final Stock SEER3 = new Stock("Ser educacional", "SEER3", CONSUMO_CICLICO, SERVICOS_EDUCACIONAIS, true);
    private static final Stock SGPS3 = new Stock("Springs", "SGPS3", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock SHOW3 = new Stock("Time for fun", "SHOW3", CONSUMO_CICLICO, VIAGENS_LAZER);
    private static final Stock SLED3 = new Stock("Saraiva", "SLED3", CONSUMO_CICLICO, COMERCIO);
    private static final Stock SLED4 = new Stock("Saraiva", "SLED4", CONSUMO_CICLICO, COMERCIO);
    private static final Stock SMFT3 = new Stock("Smartfit escola de ginastica", "SMFT3", CONSUMO_CICLICO, VIAGENS_LAZER, true);
    private static final Stock SMLS3 = new Stock("Smiles", "SMLS3", CONSUMO_CICLICO, PROGRAMA_FIDELIZACAO, true);
    private static final Stock SOMA3 = new Stock("Grupo de moda soma", "SOMA3", CONSUMO_CICLICO, COMERCIO);
    private static final Stock STKF3 = new Stock("Statkarft energias renovaveis", "STKF3", CONSUMO_CICLICO, VIAGENS_LAZER);
    private static final Stock TCSA3 = new Stock("Tecnisa", "TCSA3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL);
    private static final Stock TECN3 = new Stock("Technos", "TECN3", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock TEKA3 = new Stock("Teka", "TEKA3", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock TEKA4 = new Stock("Teka", "TEKA4", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock TEND3 = new Stock("Construtora tenda", "TEND3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL, true);
    private static final Stock TFCO4 = new Stock("Track & Field", "TFCO4", CONSUMO_CICLICO, COMERCIO, true);
    private static final Stock TOYB3 = new Stock("Tec toy", "TOYB3", CONSUMO_CICLICO, VIAGENS_LAZER);
    private static final Stock TOYB4 = new Stock("Tec toy", "TOYB4", CONSUMO_CICLICO, VIAGENS_LAZER);
    private static final Stock TRIS3 = new Stock("Trisul", "TRIS3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL, true);
    private static final Stock TXRX3 = new Stock("Textil renauxview", "TXRX3", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock TXRX4 = new Stock("Textil renauxview", "TXRX3", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock UCAS3 = new Stock("Unicasa", "UCAS3", CONSUMO_CICLICO, UTILIDADES_DOMESTICAS);
    private static final Stock VIIA3 = new Stock("Via S.A", "VIIA3", CONSUMO_CICLICO, COMERCIO, true);
    private static final Stock VIVA3 = new Stock("Vivara", "VIVA3", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS, true);
    private static final Stock VIVR3 = new Stock("Viver incorporadora e construtora", "VIVR3", CONSUMO_CICLICO, CONSTRUCAO_CIVIL, true);
    private static final Stock VSTE3 = new Stock("Veste estilo", "VSTE3", CONSUMO_CICLICO, COMERCIO);
    private static final Stock VULC3 = new Stock("Vuscabras", "VULC3", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_CALCADOS);
    private static final Stock WEST3 = new Stock("Westwing comercio varejista", "WEST3", CONSUMO_CICLICO, null);
    private static final Stock WHRL3 = new Stock("Whirlpool", "WHRL3", CONSUMO_CICLICO, COMERCIO);
    private static final Stock WHRL4 = new Stock("Whirlpool", "WHRL4", CONSUMO_CICLICO, COMERCIO);
    private static final Stock YDUQ3 = new Stock("Yduqs", "YDUQ3", CONSUMO_CICLICO, SERVICOS_EDUCACIONAIS, true);
    private static final Stock ZAMP3 = new Stock("Zamp", "ZAMP3", CONSUMO_CICLICO, HOTEIS_RESTAURANTES);

    private static final Set<Stock> stocks = new HashSet<>();

    private static Set<Stock> getStocks() {
        if (stocks.isEmpty()) {
            Collections.addAll(stocks, AHEB3, AHEB5, AHEB6, AHEB5, ALLD3, ALPA3, ALPA4, AMAR3, AMER3, ANIM3, ARZZ3, AVLL3,
                    BAHI3, BMKS3, CALI3, CALI4, CAMB3, CAMB4, CATA3, CATA4, CEAB3, CEDO3, CEDO4, CGRA3, CGRA4, CNSY3,
                    COGN3, CSED3, CTKA3, CTKA4, CTNM3, CTNM4, CTSA3, CTSA4, CTSA48, CURY3, CVCB3, CYRE3, DIRR3, DOHL3,
                    DOHL4, ECPR3, ECPR4, ESTR3, ESTR4, EVEN3, EZTC3, FIEI3, GFSA3, GRND3, GUAR3, GUAR4, HBOR3, HETA3,
                    HETA4, HGTX3, HOOT3, HOOT4, INNT3, JFEN3, JHSF3, LAME3, LAME4, LAVV3, LCAM3, LEVE3, LJQQ3, LREN3,
                    MBLY3, MDNE3, MEAL3, MELK3, MGLU3, MNDL3, MOVI3, MRVE3, MSPA3, MSPA4, MSRO3, MTRE3, MYPK3, NAFG3,
                    NAFG4, PDGR3, PETZ3, PLAS3, PLPL3, PTNT3, PTNT4, RDNI3, RENT3, RSID3, SBFG3, SEDU3, SEER3, SGPS3,
                    SHOW3, SLED3, SLED4, SMFT3, SMLS3, SOMA3, STKF3, TCSA3, TECN3, TEKA3, TEKA4, TEND3, TFCO4, TOYB3,
                    TOYB4, TRIS3, TXRX3, TXRX4, UCAS3, VIIA3, VIVA3, VIVR3, VSTE3, VULC3, WEST3, WHRL3, WHRL4, YDUQ3, ZAMP3);
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