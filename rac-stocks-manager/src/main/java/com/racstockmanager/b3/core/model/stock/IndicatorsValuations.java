package com.racstockmanager.b3.core.model.stock;

import lombok.Builder;

@Builder
public record IndicatorsValuations(Double ipca,
                                   Double selic,
                                   Double currentValue,
                                   Double minValue,
                                   Double maxValue,
                                   String valorization12Month,
                                   Double dividendYield,
                                   Double dividendYield12Month,
                                   Double divLiquidEbitda,
                                   Double dy,
                                   Double pl,
                                   Double pegRatio,
                                   Double pVp,
                                   Double evEbita,
                                   Double evEbit,
                                   Double pEbitda,
                                   Double pEbit,
                                   Double vpa,
                                   Double pAtivo,
                                   Double lpa,
                                   Double pSr,
                                   Double pCapGiro,
                                   Double pAtivoCircLiq,
                                   Double patrimonioLiquido,
                                   Double ativo,
                                   Double ativocirculante,
                                   Double dividabruta,
                                   Double disponibilidade,
                                   Double dividaLiquida,
                                   Double valorMercado,
                                   Double valorFirma,
                                   Double nroTotalPapeis,
                                   Double segmentoMercado,
                                   String freeFloat,
                                   Double dailyLiquidity) {
}


