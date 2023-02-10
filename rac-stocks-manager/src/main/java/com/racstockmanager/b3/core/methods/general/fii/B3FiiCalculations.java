package com.racstockmanager.b3.core.methods.general.fii;

import com.racstockmanager.b3.core.builders.fii.FiiIndicatorsBuilder;
import com.racstockmanager.b3.core.builders.fii.FiiValuationBuilder;
import com.racstockmanager.b3.core.methods.bazin.BazinFiiCalculation;
import com.racstockmanager.b3.core.methods.bazin.BazinParams;
import com.racstockmanager.b3.core.model.fii.Fii;
import com.racstockmanager.b3.core.model.fii.FiiIndicators;
import com.racstockmanager.b3.core.model.fii.FiiValuations;
import com.racstockmanager.b3.core.model.stock.StockMethod;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class B3FiiCalculations {

    @Autowired
    BazinFiiCalculation bazinFiiCalculation;

    public FiiIndicators execute(Fii fii) {

        try {
            Document document = Jsoup.connect("https://statusinvest.com.br/fundos-imobiliarios/" + fii.getCode()).get();

            List<String> topInfoValues = document.getElementsByClass("top-info").get(0).getElementsByClass("value").eachText();
            List<String> topInfoSubValues = document.getElementsByClass("top-info").get(0).getElementsByClass("sub-value").eachText();

            List<String> topInfoPatrimonios = document.getElementsByClass("top-info").get(1).getElementsByClass("value").eachText();

            FiiValuations valuations = FiiValuationBuilder.build(topInfoValues, topInfoSubValues, topInfoPatrimonios);

            BazinParams bazinParams = BazinParams.builder()
                    .currentPrice(valuations.currentValue())
                    .sector(fii.getSector())
                    .dy(valuations.dy())
                    .dividendYield12Month(valuations.dividendYield12Month()).build();

            StockMethod bazinValue = bazinFiiCalculation.execute(bazinParams);

            return FiiIndicatorsBuilder.build(valuations, bazinValue);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
