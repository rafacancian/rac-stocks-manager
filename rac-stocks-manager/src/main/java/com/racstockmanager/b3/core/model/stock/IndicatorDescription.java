package com.racstockmanager.b3.core.model.stock;

public enum IndicatorDescription {

    IPCA("O IPCA (Índice Nacional de Preços ao Consumidor Amplo) é um índice oficial utilizado no Brasil para medir a " +
            "variação média dos preços de bens e serviços consumidos pelas famílias. Ele é calculado mensalmente pelo " +
            "IBGE (Instituto Brasileiro de Geografia e Estatística)."),
    EBITDA("Dívida Líquida / EBITDA Ou, na tradução do inglês, lucro antes dos impostos, juros, depreciação e amortização. " +
            "De forma simplificada, o EBITDA mostra o caixa que a empresa gera somente com a sua operação, ou seja, " +
            "antes da dedução dos juros, impostos, depreciações e amortizações."),
    PL("O indicador P/L mede a relação entre o preço atual de uma ação e o lucro por ação acumulado nos últimos 12 meses. " +
            "Em outras palavras, ele indica o quanto os investidores estão dispostos a pagar pelo lucro gerado."),
    PVP("É um indicador do mercado financeiro que permite avaliar o preço de uma ação em relação ao valor do patrimônio " +
            "líquido da empresa em determinado período. O cálculo é feito mediante a soma dos ativos de uma empresa, " +
            "bem como, de seus passivos.");

    private final String description;

    IndicatorDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
