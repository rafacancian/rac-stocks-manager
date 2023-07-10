package com.racstockmanager.b3.core.methods.general.stock;

import com.racstockmanager.b3.core.builders.stock.StockIndicatorsBuilder;
import com.racstockmanager.b3.core.builders.stock.StockValuationBuilder;
import com.racstockmanager.b3.core.exceptions.StockNotFoundException;
import com.racstockmanager.b3.core.methods.barsi.BarsiCalculation;
import com.racstockmanager.b3.core.methods.bazin.BazinCalculation;
import com.racstockmanager.b3.core.methods.bazin.BazinParams;
import com.racstockmanager.b3.core.methods.graham.GrahamCalculation;
import com.racstockmanager.b3.core.methods.wacc.WaccCalculation;
import com.racstockmanager.b3.core.model.stock.Indicators;
import com.racstockmanager.b3.core.model.stock.Stock;
import com.racstockmanager.b3.core.model.stock.StockMethod;
import com.racstockmanager.b3.core.model.stock.Valuations;
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

            List<String> htmlIndicators = document.getElementsByClass("indicators").get(0).getElementsByClass("value").eachText();
            List<String> htmlIndicatorsDebt = document.getElementsByClass("indicators").get(1).getElementsByClass("value").eachText();

            Valuations valuations = StockValuationBuilder.build(htmlIndicators, htmlIndicatorsDebt, topInfoValues, topInfoSubValues, topInfoPatrimonios);

            BazinParams bazinParams = BazinParams.builder()
                    .currentPrice(valuations.currentValue())
                    .sector(stock.getSector().getName())
                    .dy(valuations.dy())
                    .dividendYield12Month(valuations.dividendYield12Month())
                    .divLiquidEbitda(valuations.divLiquidEbitda())
                    .build();

            StockMethod barsiValue = barsiCalculation.execute(stock, valuations);
            StockMethod bazinValue = bazinCalculation.execute(bazinParams);
            StockMethod grahamValue = grahamCalculation.execute(stock, valuations);
            StockMethod waccValue = waccCalculation.execute(stock, valuations);

            return StockIndicatorsBuilder.build(valuations, barsiValue, bazinValue, grahamValue, waccValue);

        } catch (IOException e) {
            log.error("[Stock Calculator] Unexpected error for " + stock.getCode() + " | Error: " + e.getMessage());
            throw new StockNotFoundException(stock);
        }
    }
}
