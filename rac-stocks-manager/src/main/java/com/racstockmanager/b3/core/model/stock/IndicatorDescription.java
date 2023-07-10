package com.racstockmanager.b3.core.model;

public enum IndicatorDescription {

    IPCA("O IPCA (Índice Nacional de Preços ao Consumidor Amplo) é um índice oficial utilizado no Brasil para medir a " +
            "variação média dos preços de bens e serviços consumidos pelas famílias. Ele é calculado mensalmente pelo " +
            "IBGE (Instituto Brasileiro de Geografia e Estatística)."),
    EBITDA("Dívida Líquida / EBITDA Ou, na tradução do inglês, lucro antes dos impostos, juros, depreciação e amortização. " +
            "De forma simplificada, o EBITDA mostra o caixa que a empresa gera somente com a sua operação, ou seja," +
            "antes da dedução dos juros, impostos, depreciações e amortizações."),
    PL("TODO"),
    PVP("TODO");

    private final String description;

    IndicatorDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
