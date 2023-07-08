package com.racstockmanager.b3.core.builders.stock;

import com.racstockmanager.b3.core.model.stock.Valuations;

import java.util.List;

import static com.racstockmanager.b3.core.utils.CalculatorUtils.*;

public class StockValuationBuilder {

    //Selic: trata da taxa básica de juros da nossa economia e serve como referência para os juros
    // que serão cobrados do consumidor final em operações de crédito.
    public static final double SELIC = 8.0;

    //IPCA é o índice que mede a inflação a partir do cálculo da variação do preço dos principais
    // produtos e serviços consumidos pelas famílias
    public static final double IPCA = 12.0;

    public static Valuations build(List<String> htmlIndicators, List<String> htmlIndicatorsDebt,
                                   List<String> topInfoValues, List<String> topInfoSubValues, List<String> topInfoPatrimonios) {

        return Valuations.builder()
                .ipca(IPCA)
                .selic(SELIC)
                .currentValue(convertStringToDouble(topInfoValues.get(0)))
                .minValue(convertStringToDouble(topInfoValues.get(1)))
                .maxValue(convertStringToDouble(topInfoValues.get(2)))
                .valorization12Month(topInfoValues.get(4)) // %
                .dividendYield12Month(convertStringWithCoinToDouble(topInfoSubValues.get(3)))
                .divLiquidEbitda(convertStringToDouble(htmlIndicatorsDebt.get(2)))
                .dy(convertStringWithPercentageToDouble(htmlIndicators.get(0)))
                .pl(convertStringToDouble(htmlIndicators.get(1)))
                .pegRatio(convertStringToDouble(htmlIndicators.get(2)))
                .pVp(convertStringToDouble(htmlIndicators.get(3)))
                .evEbita(convertStringToDouble(htmlIndicators.get(4)))
                .evEbit(convertStringToDouble(htmlIndicators.get(5)))
                .pEbitda(convertStringToDouble(htmlIndicators.get(6)))
                .pEbit(convertStringToDouble(htmlIndicators.get(7)))
                .vpa(convertStringToDouble(htmlIndicators.get(8)))
                .pAtivo(convertStringToDouble(htmlIndicators.get(9)))
                .lpa(convertStringToDouble(htmlIndicators.get(10)))
                .pSr(convertStringToDouble(htmlIndicators.get(11)))
                .pCapGiro(convertStringToDouble(htmlIndicators.get(12)))
                .pAtivoCircLiq(convertStringToDouble(htmlIndicators.get(13)))

                .patrimonioLiquido(convertStringToDoubleRegex(topInfoPatrimonios.get(0)))
                .ativo(convertStringToDoubleRegex(topInfoPatrimonios.get(1)))
                .ativocirculante(convertStringToDoubleRegex(topInfoPatrimonios.get(2)))
                .dividabruta(convertStringToDoubleRegex(topInfoPatrimonios.get(3)))
                .disponibilidade(convertStringToDoubleRegex(topInfoPatrimonios.get(4)))
                .dividaLiquida(convertStringToDoubleRegex(topInfoPatrimonios.get(5)))
                .valorMercado(convertStringToDoubleRegex(topInfoPatrimonios.get(6)))
                .valorFirma(convertStringToDoubleRegex(topInfoPatrimonios.get(7)))
                .nroTotalPapeis(convertStringToDoubleRegex(topInfoPatrimonios.get(8)))
                .nroTotalPapeis(convertStringToDoubleRegex(topInfoPatrimonios.get(9)))
                //.segmentoMercado(convertStringToDouble(topInfoPatrimonios.get(10)))
                //.freeFloat(topInfoPatrimonios.get(11))
                .build();
    }
}
