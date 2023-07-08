package com.racstockmanager.b3.core.model.stock;

public enum Sector {

    MATERIAIS_BASICOS("Materiais basicos"),
    COMUNICACOES("Comunicacoes"),
    CONSUMO_CICLICO("Consumo Ciclico"),
    FINANCEIRO_E_OUTROS("Financeiro e outros"),
    SAUDE("Saude"),
    BENS_INDUSTRIAIS("Bens Industriais"),
    CONSUMO_NAO_CICLICO("Consumo nao Ciclico"),
    PETROLEO_GAS_BIOCOMBUSTIVEIS("Petroleo gas e combustiveis"),
    UTILIDADE_PUBLICA("Utilidade Publica"),
    TECNOLOGIA_DA_INFORMACAO("tecnologia da informacao");

    private final String name;

    Sector(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
