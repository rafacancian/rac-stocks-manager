package com.racstockmanager.b3.core.repository.stock;

import com.racstockmanager.b3.core.model.stock.Stock;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class StockRepositoryData {

    public static final String FINANCEIRO_E_OUTROS = "Financeiro e outros";
    public static final String CONSUMO_CICLICO = "Consumo Ciclico";
    public static final String CONSUMO_NAO_CICLICO = "Consumo nao Ciclico";
    public static final String BANCOS = "Bancos";
    public static final String SEGURADORAS = "Seguradoras";
    public static final String UTILIDADE_PUBLICA = "Utilidade Publica";
    public static final String ENERGIA_ELETRICA = "Energia eletrica";
    public static final String SAUDE = "Saude";
    public static final String EXPLORACAO_DE_IMOVEIS = "Exploracao de Imoveis";
    public static final String TELECOMUNICACOES = "Telecomunicacoes";
    public static final String COMUNICACAO = "Comunicacao";
    public static final String BENS_INDUSTRIAIS = "Bens Industriais";
    public static final String TECIDOS_VESTUARIOS_E_CALCADOS = "Tecidos, vestuarios e calcados";
    public static final String MINERAIS_METALICOS = "Minerais metalicos";
    public static final String MATERIAL_BASICO = "Material basico";
    public static final String SERVICOS_EDUCACIONAIS = "Servicos Educacionais";
    public static final String VIAGENS_E_TURISMO = "Viagens e Turismo";
    public static final String INCORPORACOES = "Incorporacoes";
    public static final String SERVICO_MEDICO_HOSPITAR_ANALISES_E_DIAGNOSTICOS = "Servico Medico Hospitar, analises e diagnosticos";
    public static final String PREVIDENCIA_E_SEGUROS = "Previdencia e seguros";
    public static final String ALIMENTOS = "Alimentos";
    public static final String TECIDOS_VESTUARIO_E_CALCADOS = "Tecidos, vestuario e calcados";
    public static final String TECNOLOGIA_DA_INFORMACAO = "tecnologia da informacao";
    public static final String PROGRAMAS_E_SERVIÇOS = "Programas e serviços";
    public static final String MEDICAMENTOS_E_OUTROS_PRODUTOS = "Medicamentos e outros produtos";
    public static final String VAREJO = "Varejo";

    public static Stock ALSO3 = new Stock("Alianscsonae", "ALSO3", FINANCEIRO_E_OUTROS, EXPLORACAO_DE_IMOVEIS);
    public static Stock AMAR3 = new Stock("Lojas Marisa", "AMAR3", CONSUMO_CICLICO, TECIDOS_VESTUARIOS_E_CALCADOS);
    public static Stock AURA33 = new Stock("Aura Minerals inc", "AURA33", MATERIAL_BASICO, MINERAIS_METALICOS);
    public static Stock BBAS3 = new Stock("Banco do Brasil", "BBAS3", FINANCEIRO_E_OUTROS, BANCOS);
    public static Stock BBSE3 = new Stock("BB Seguridade", "BBSE3", FINANCEIRO_E_OUTROS, SEGURADORAS);
    public static Stock COGN3 = new Stock("Cogna on", "COGN3", CONSUMO_CICLICO, SERVICOS_EDUCACIONAIS);
    public static Stock CVCB3 = new Stock("CVC Brasil", "CVCB3", CONSUMO_CICLICO, VIAGENS_E_TURISMO);
    public static Stock EGIE3 = new Stock("Engie Brasil", "EGIE3", UTILIDADE_PUBLICA, ENERGIA_ELETRICA);
    public static Stock ELET3 = new Stock("Eletrobras", "ELET3", UTILIDADE_PUBLICA, ENERGIA_ELETRICA);
    public static Stock ENBR3 = new Stock("EDP Brasil", "ENBR3", UTILIDADE_PUBLICA, ENERGIA_ELETRICA);
    public static Stock EZTC3 = new Stock("EZ Tec", "EZTC3", CONSUMO_CICLICO, INCORPORACOES);
    public static Stock FLRY3 = new Stock("Fleury", "FLRY3", SAUDE, SERVICO_MEDICO_HOSPITAR_ANALISES_E_DIAGNOSTICOS);
    public static Stock GMAT3 = new Stock("Grupo Mateus", "GMAT3", CONSUMO_NAO_CICLICO, ALIMENTOS);
    public static Stock IGTI11 = new Stock("Jereissati", "IGTI11", EXPLORACAO_DE_IMOVEIS, EXPLORACAO_DE_IMOVEIS);
    public static Stock IRBR3 = new Stock("IRB", "IRBR3", PREVIDENCIA_E_SEGUROS, SEGURADORAS);
    public static Stock ITSA4 = new Stock("Itausa", "ITSA4", FINANCEIRO_E_OUTROS, BANCOS);
    public static Stock BBDC4 = new Stock("Bradesco", "BBDC4", FINANCEIRO_E_OUTROS, BANCOS);
    public static Stock LREN3 = new Stock("Lojas Renner", "LREN3", CONSUMO_CICLICO, TECIDOS_VESTUARIO_E_CALCADOS);
    public static Stock MGLU3 = new Stock("Magazine Luiza", "MGLU3", CONSUMO_CICLICO, "Eletrodomesticos");
    public static Stock NGRD3 = new Stock("Neogrid", "NGRD3", TECNOLOGIA_DA_INFORMACAO, PROGRAMAS_E_SERVIÇOS);
    public static Stock OIBR4 = new Stock("OI", "OIBR4", COMUNICACAO, TELECOMUNICACOES);
    public static Stock PNVL3 = new Stock("Dimed", "PNVL3", SAUDE, MEDICAMENTOS_E_OUTROS_PRODUTOS);
    public static Stock SAPR4 = new Stock("Sanepar", "SAPR4", UTILIDADE_PUBLICA, "Agua e Saneamento");
    public static Stock SULA11 = new Stock("Sul America", "SULA11", FINANCEIRO_E_OUTROS, SEGURADORAS);
    public static Stock TAEE11 = new Stock("TAEE11", "TAEE11", UTILIDADE_PUBLICA, ENERGIA_ELETRICA);
    public static Stock VALE3 = new Stock("VALE", "VALE3", "Materiais basicos", MINERAIS_METALICOS);
    public static Stock VIIA3 = new Stock("Via S.A", "VIIA3", CONSUMO_CICLICO, "Eletrodomesticos");
    public static Stock WEGE3 = new Stock("WEG", "WEGE3", "Bens industriais", "Motores, compressores e outros");
    public static Stock WIZC3 = new Stock("WIZ", "WIZC3", "Previdencia e Seguros", "Corretoras de Seguros");
    public static Stock SYNE3 = new Stock("SYN Prop e Tech S.A", "SYNE3", FINANCEIRO_E_OUTROS, EXPLORACAO_DE_IMOVEIS);
    public static Stock BAZA3 = new Stock("Banco Amazonia", "BAZA3", FINANCEIRO_E_OUTROS, BANCOS);
    public static Stock TPIS3 = new Stock("TPI Triunfo Particip e Invest S.A", "TPIS3", BENS_INDUSTRIAIS, "Exploracao de Rodovias");
    public static Stock MRFG3 = new Stock("Marfrig", "MRFG3", "Consumo não Ciclico", "Carnes e Derivados");
    public static Stock TIMS3 = new Stock("TIM", "TIMS3", COMUNICACAO, TELECOMUNICACOES);
    public static Stock BRKM5 = new Stock("Braskem", "BRKM5", "Materiais Básicos", "Petroquimicos");
    public static Stock PETR4 = new Stock("Petrobras", "PETR4", "Petroleo, gas e biocombustiveis", "Exploracao, refino e distribuicao");
    public static Stock TASA4 = new Stock("Tauros Armas", "TASA4", BENS_INDUSTRIAIS, "Armas e munições");
    public static Stock CSNA3 = new Stock("Cosan", "CSNA3", "Petroleo, gas e biocombustiveis", "Exploracao, refino e distribuicao");
    public static Stock CCRO3 = new Stock("CCR", "CCRO3", BENS_INDUSTRIAIS, "Exploracao de Rodovias");
    public static Stock GRND3 = new Stock("Grendene", "GRND3", CONSUMO_CICLICO, "Calcados");
    public static Stock CPLE6 = new Stock("Copel", "CPLE6", UTILIDADE_PUBLICA, ENERGIA_ELETRICA);
    public static Stock BLAU3 = new Stock("Blau farmáceutica S.A", "BLAU3", SAUDE, MEDICAMENTOS_E_OUTROS_PRODUTOS);
    public static Stock TTEN3 = new Stock("Três tentos agroindustrial S.A", "TTEN3", CONSUMO_NAO_CICLICO, "Agricultura");
    public static Stock BRBI11 = new Stock("BR Advisory Partners Participações S.A", "BRBI11", FINANCEIRO_E_OUTROS, BANCOS);
    public static Stock MOVI3 = new Stock("Movida", "MOVI3", CONSUMO_CICLICO, "Aluguel de carros");
    public static Stock KLBN11 = new Stock("Klabin", "KLBN11", MATERIAL_BASICO, "Papel e Celulose");
    public static Stock USIM5 = new Stock("Usiminas", "USIM5", MATERIAL_BASICO, "Siderurgia");
    public static Stock VIVT3 = new Stock("Vivo", "VIVT3", COMUNICACAO, TELECOMUNICACOES);
    public static Stock AGRO3 = new Stock("Brasilagro", "AGR", "", "");
    public static Stock LEVE3 = new Stock("Mahle", "LEVE3", "", "");
    public static Stock MRVE3 = new Stock("MRV Engenharia", "MRVE3", "", "");
    public static Stock ALUP11 = new Stock("Alupar", "ALUP11", "", "");
    public static Stock B3SA3 = new Stock("B3", "B3SA3", "", "");
    public static Stock UNIP6 = new Stock("Unipar", "UNIP6", "", "");
    public static Stock VIVA3 = new Stock("Vivara", "VIVA3", "", "");
    public static Stock NEOE3 = new Stock("Neoenergia", "NEOE3", "", "");
    public static Stock VAMO3 = new Stock("Vamos Locacao", "VAMO3", "", "");
    public static Stock MYPK3 = new Stock("Lochpe Maxion", "MYPK3", "", "");
    public static Stock RAIL3 = new Stock("Rumo", "RAIL3", "", "");
    public static Stock TFCO4 = new Stock("Track & Field", "TFCO4", "", "");
    public static Stock TUPY3 = new Stock("", "TUPY3", "", "");
    public static Stock CEAB3 = new Stock("C&A", "CEAB3", "CONSUMO_CICLICO", "");

    private StockRepositoryData() {
    }

    public static Set<Stock> getAll() {
        return Set.of(ALSO3, AMAR3, AURA33, BBAS3, BBSE3, BLAU3, COGN3, CVCB3, EGIE3, ELET3,
                ENBR3, EZTC3, FLRY3, GMAT3, IGTI11, IRBR3, ITSA4, BBDC4, KLBN11, LREN3, MGLU3,
                NGRD3, OIBR4, PNVL3, SAPR4, SULA11, TAEE11, TIMS3, USIM5, VALE3, VIIA3,
                VIVT3, WEGE3, WIZC3, SYNE3, BAZA3, TPIS3, MRFG3, BRKM5, PETR4, TASA4,
                CSNA3, CCRO3, GRND3, CPLE6, TTEN3, BRBI11, MOVI3, CEAB3);
    }

    public static Set<Stock> getTestValidationShort() {
        return Set.of(USIM5, VIVT3);
    }
}
