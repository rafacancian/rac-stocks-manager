package com.racstockmanager.b3.core.model.stock;

public enum Segment {

    VAREJO("Varejo"),
    ENERGIA_ELETRICA("Energia eletrica"),
    EXPLORACAO_DE_IMOVEIS("Exploracao de Imoveis"),
    TECIDOS_VESTUARIOS_E_CALCADOS("Tecidos, vestuarios e calcados"),
    MINERAIS_METALICOS("Minerais metalicos"),
    SERVICOS_EDUCACIONAIS("Servicos Educacionais"),
    VIAGENS_E_TURISMO("Viagens e Turismo"),
    INCORPORACOES("Incorporacoes"),
    SERVICO_MEDICO_HOSPITAR_ANALISES_E_DIAGNOSTICOS("Servico Medico Hospitar, analises e diagnosticos"),
    PREVIDENCIA_E_SEGUROS("Previdencia e seguros"),
    ALIMENTOS("Alimentos"),
    TECIDOS_VESTUARIO_E_CALCADOS("Tecidos, vestuario e calcados"),
    PROGRAMAS_E_SERVIÇOS("Programas e serviços"),
    MEDICAMENTOS_E_OUTROS_PRODUTOS("Medicamentos e outros produtos");

    private final String name;

    Segment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
