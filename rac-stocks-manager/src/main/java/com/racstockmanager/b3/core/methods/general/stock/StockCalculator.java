package com.racstockmanager.b3.core.methods.general.stock;

import com.racstockmanager.b3.core.builders.stock.*;
import com.racstockmanager.b3.core.exceptions.StockNotFoundException;
import com.racstockmanager.b3.core.methods.barsi.BarsiCalculation;
import com.racstockmanager.b3.core.methods.bazin.BazinCalculation;
import com.racstockmanager.b3.core.methods.cheaper.CheaperCalculation;
import com.racstockmanager.b3.core.methods.graham.GrahamCalculation;
import com.racstockmanager.b3.core.methods.wacc.WaccCalculation;
import com.racstockmanager.b3.core.model.stock.*;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@Slf4j
public class StockCalculator {

    @Autowired
    BarsiCalculation barsiCalculation;
    @Autowired
    BazinCalculation bazinCalculation;
    @Autowired
    GrahamCalculation grahamCalculation;
    @Autowired
    WaccCalculation waccCalculation;
    @Autowired
    CheaperCalculation cheaperCalculation;

    @SneakyThrows
    public Indicators execute(Stock stock) {

        try {
            //log.info("[Stock Calculator] Collecting values for " + stock.getCode());
            Document document = Jsoup.connect("https://statusinvest.com.br/acoes/" + stock.getCode()).get();
            //https://www.youtube.com/watch?v=skb_I6OlVrk
            // IPCA + https://www.tesourodireto.com.br/titulos/precos-e-taxas.htm
            // pegar todas as taxas e faz a média
            // pegar todos os fundos: https://www.fundsexplorer.com.br/funds

            List<String> topInfoValues = document.getElementsByClass("top-info").get(0).getElementsByClass("value").eachText();
            List<String> topInfoSubValues = document.getElementsByClass("top-info").get(0).getElementsByClass("sub-value").eachText();

            List<String> topInfoPatrimonios = document.getElementsByClass("top-info").get(4).getElementsByClass("value").eachText();

            List<String> topInfoParticipation = document.getElementsByClass("top-info").get(1).getElementsByClass("value").eachText();

            List<String> htmlIndicators = document.getElementsByClass("indicators").get(0).getElementsByClass("value").eachText();
            List<String> htmlIndicatorsDebt = document.getElementsByClass("indicators").get(1).getElementsByClass("value").eachText();
            List<String> htmlIndicatorsEfficiency = document.getElementsByClass("indicators").get(2).getElementsByClass("value").eachText();
            List<String> htmlIndicatorsProfitability = document.getElementsByClass("indicators").get(3).getElementsByClass("value").eachText();
            List<String> htmlIndicatorsGrowth = document.getElementsByClass("indicators").get(4).getElementsByClass("value").eachText();

            IndicatorsValuations indicatorsValuations = StockValuationBuilder.build(htmlIndicators, htmlIndicatorsDebt, topInfoValues, topInfoSubValues, topInfoPatrimonios, topInfoParticipation);
            IndicatorsEfficiency indicatorsEfficiency = StockEfficiencyBuilder.build(htmlIndicatorsEfficiency);
            IndicatorsProfitability indicatorsProfitability = StockProfitabilityBuilder.build(htmlIndicatorsProfitability);
            IndicatorsGrowth indicatorsGrowth = StockGrowthBuilder.build(htmlIndicatorsGrowth);
            boolean isJudicialRecovery = !document.getElementsContainingText("RECUPERAÇÃO JUDICIAL").isEmpty();

            StockMethod barsiValue = barsiCalculation.execute(stock, indicatorsValuations);
            StockMethod bazinValue = bazinCalculation.execute(stock, indicatorsValuations);
            StockMethod grahamValue = grahamCalculation.execute(stock, indicatorsValuations);
            StockMethod waccValue = waccCalculation.execute(stock, indicatorsValuations);
            StockMethod cheaper = cheaperCalculation.execute(stock, indicatorsValuations, indicatorsEfficiency,
                    indicatorsProfitability, indicatorsGrowth, isJudicialRecovery);

            return StockIndicatorsBuilder.build(indicatorsValuations, indicatorsEfficiency, indicatorsProfitability, indicatorsGrowth, isJudicialRecovery, barsiValue, bazinValue, grahamValue, waccValue, cheaper);

        } catch (IOException e) {
            log.error("[Stock Calculator] Unexpected error for " + stock.getCode() + " | Error: " + e.getMessage());
            throw new StockNotFoundException(stock);
        }
    }
}
