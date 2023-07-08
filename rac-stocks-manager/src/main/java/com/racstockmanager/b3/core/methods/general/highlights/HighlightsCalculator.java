package com.racstockmanager.b3.core.methods.general.highlights;

import com.google.gson.Gson;
import com.racstockmanager.b3.core.model.stock.StockHighlights;
import com.racstockmanager.b3.core.model.stock.TopicHighlights;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Service
@Slf4j
public class HighlightsCalculator {

    public List<TopicHighlights> topicsHighlights() {
        try {
            Document documentIbovespa_CDI_IPCA = Jsoup.connect("https://statusinvest.com.br").get();
            Document documentIfix = Jsoup.connect("https://statusinvest.com.br/fundos-imobiliarios").get();
            Document documentBitcoin = Jsoup.connect("https://statusinvest.com.br/criptomoedas/btc").get();
            Document documentIVVB11 = Jsoup.connect("https://statusinvest.com.br/etfs/ivvb11").get();

            //Gson gson = new Gson(); // Or use new GsonBuilder().create();

            String ibovName = "Ibovespa";//documentIbovespa_CDI_IPCA.getElementsByClass("ibov").get(0).getElementsByClass("name").get(0).text();
            String ibovValue = documentIbovespa_CDI_IPCA.getElementsByClass("ibov").get(0).getElementsByClass("value").get(0).text();
            String ibovUpside = "1,23%";
            String ibovDescription = documentIbovespa_CDI_IPCA.getElementsByClass("ibov").get(0).getElementsByClass("name").get(1).text();
            ibovDescription = ibovDescription + " R$ " + documentIbovespa_CDI_IPCA.getElementsByClass("ibov").get(0).getElementsByClass("value").get(1).text();
            TopicHighlights ibovespa = new TopicHighlights(ibovName, ibovValue, ibovUpside, ibovDescription);

            String ivvbName = "IVVB11";
            String ivvbValue = documentIVVB11.getElementsByClass("info").get(0).getElementsByClass("value").eachText().get(0);
            String ivvbUpside = documentIVVB11.getElementsByClass("info").get(0).getElementsByClass("v-align-middle").eachText().get(0);
            String ivvbDescription = documentIVVB11.getElementsByClass("info").get(1).getElementsByClass("title").eachText().get(0);
            ivvbDescription = ivvbDescription + " R$ " + documentIVVB11.getElementsByClass("info").get(1).getElementsByClass("value").eachText().get(0);
            TopicHighlights ivvb11 = new TopicHighlights(ivvbName, ivvbValue, ivvbUpside, ivvbDescription);

            String btcName = "Bitcoin";
            String btcValue = documentBitcoin.getElementsByClass("info").get(0).getElementsByClass("value").eachText().get(0);
            String btcPercentage = documentBitcoin.getElementsByClass("info").get(0).getElementsByClass("v-align-middle").eachText().get(0);
            String btcDescription = documentBitcoin.getElementsByClass("info").get(1).getElementsByClass("title").eachText().get(0);
            btcDescription = btcDescription + " R$ " + documentBitcoin.getElementsByClass("info").get(1).getElementsByClass("value").eachText().get(0);
            TopicHighlights bitcoin = new TopicHighlights(btcName, btcValue, btcPercentage, btcDescription);

            String cdiName = documentIbovespa_CDI_IPCA.getElementsByClass("indices").get(0).getElementsContainingText("CDI").get(1).getElementsByClass("name").eachText().get(0);
            String cdiValue = documentIbovespa_CDI_IPCA.getElementsByClass("indices").get(0).getElementsContainingText("CDI").get(1).getElementsByClass("value").eachText().get(0);
            String cdiDescription = documentIbovespa_CDI_IPCA.getElementsByClass("indices").get(0).getElementsContainingText("CDI").get(1).getElementsByClass("name").eachText().get(1);
            cdiDescription = cdiDescription + ": " + documentIbovespa_CDI_IPCA.getElementsByClass("indices").get(0).getElementsContainingText("CDI").get(1).getElementsByClass("value").eachText().get(1);
            TopicHighlights cdi = new TopicHighlights(cdiName, cdiValue, null, cdiDescription);

            String ipcaName = documentIbovespa_CDI_IPCA.getElementsByClass("indices").get(0).getElementsContainingText("IPCA").get(1).getElementsByClass("name").eachText().get(0);
            String ipcsValue = documentIbovespa_CDI_IPCA.getElementsByClass("indices").get(0).getElementsContainingText("IPCA").get(1).getElementsByClass("value").eachText().get(0);
            String ipcaDescription = documentIbovespa_CDI_IPCA.getElementsByClass("indices").get(0).getElementsContainingText("IPCA").get(1).getElementsByClass("name").eachText().get(1);
            ipcaDescription = ipcaDescription + ": " + documentIbovespa_CDI_IPCA.getElementsByClass("indices").get(0).getElementsContainingText("IPCA").get(1).getElementsByClass("value").eachText().get(1);
            TopicHighlights ipca = new TopicHighlights(ipcaName, ipcsValue, null, ipcaDescription);

            String ifixName = documentIfix.getElementsByClass("indices").get(0).getElementsContainingText("IFIX").get(1).getElementsByClass("name").eachText().get(0);
            String ifixValue = documentIfix.getElementsByClass("indices").get(0).getElementsContainingText("IFIX").get(1).getElementsByClass("value").eachText().get(0);
            String ifixDescription = documentIfix.getElementsByClass("indices").get(0).getElementsContainingText("IFIX").get(1).getElementsByClass("name").eachText().get(1);
            ifixDescription = ifixDescription + ": " + documentIfix.getElementsByClass("indices").get(0).getElementsContainingText("IFIX").get(1).getElementsByClass("value").eachText().get(1);
            TopicHighlights ifix = new TopicHighlights(ifixName, ifixValue, null, ifixDescription);


            List<TopicHighlights> topicsHighlights = List.of(ibovespa, ivvb11, bitcoin, cdi, ipca, ifix);
            return topicsHighlights;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<StockHighlights> stocksHighlights() {
        try {
            Document documentStocks = Jsoup.connect("https://statusinvest.com.br/acoes/variacao/ibovespa").get();

            Gson gson = new Gson(); // Or use new GsonBuilder().create();

            String jsonStocks = documentStocks.getElementById("result").val();
            StockHighlights[] stocksHighlights = gson.fromJson(jsonStocks, StockHighlights[].class);// deserializes json into target2

            List<StockHighlights> stockHighlights = Arrays.stream(stocksHighlights).sorted(Comparator.comparing(stock -> getDoubleValue(stock.resultPercentageValue()))).toList();
            return stockHighlights;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<StockHighlights> fiisHighlights() {
        try {
            Document documentFiis = Jsoup.connect("https://statusinvest.com.br/fundos-imobiliarios/variacao/ifix").get();

            Gson gson = new Gson(); // Or use new GsonBuilder().create();

            String jsonFIIs = documentFiis.getElementById("result").val();
            StockHighlights[] fiisHighlights = gson.fromJson(jsonFIIs, StockHighlights[].class);// deserializes json into target2

            List<StockHighlights> stockHighlights = Arrays.stream(fiisHighlights).sorted(Comparator.comparing(stock -> getDoubleValue(stock.resultPercentageValue()))).toList();
            return stockHighlights;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public List<StockHighlights> bdrsHighlights() {
        try {
            Document documentBDRs = Jsoup.connect("https://statusinvest.com.br/bdrs/variacao/indice-de-bdrs-nao-patrocinados-global").get();

            Gson gson = new Gson(); // Or use new GsonBuilder().create();

            String jsonBDRs = documentBDRs.getElementById("result").val();
            StockHighlights[] bdrHighlights = gson.fromJson(jsonBDRs, StockHighlights[].class);// deserializes json into target2

            List<StockHighlights> stockHighlights = Arrays.stream(bdrHighlights).sorted(Comparator.comparing(stock -> getDoubleValue(stock.resultPercentageValue()))).toList();
            return stockHighlights;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<StockHighlights> criptosHighlights() {
        try {
            Document documentCriptos = Jsoup.connect("https://statusinvest.com.br/criptomoedas/variacao").get();

            Gson gson = new Gson(); // Or use new GsonBuilder().create();

            String jsonBDRs = documentCriptos.getElementById("result").val();
            StockHighlights[] bdrHighlights = gson.fromJson(jsonBDRs, StockHighlights[].class);// deserializes json into target2

            List<StockHighlights> stockHighlights = Arrays.stream(bdrHighlights).sorted(Comparator.comparing(stock -> getDoubleValue(stock.resultPercentageValue()))).toList();
            return stockHighlights;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Double getDoubleValue(String value) {
        try {
            value = value.replace(",", ".");
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            log.error("NumberFormatException for: " + value);
            return 0.0;
        }
    }
}
