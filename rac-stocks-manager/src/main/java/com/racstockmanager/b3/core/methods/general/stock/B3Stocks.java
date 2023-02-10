package com.racstockmanager.b3.core.methods.general.stock;

import com.racstockmanager.b3.core.model.stock.Stock;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class B3Stocks {

    public static void main(String[] args) {
        Set<Stock> execute = execute();
        System.out.println(execute);
    }

    public static Set<Stock> execute() {

        try {
            Document document = Jsoup.connect("https://valorinveste.globo.com/cotacoes/").get();

            Element element = document.getElementsByClass("vd-table__body").get(0);
            Elements stocks = element.getElementsByTag("tr");
            return stocks.stream().map(stock ->
                    Stock.builder()
                            .name(stock.getAllElements().get(1).text())
                            .code(stock.getAllElements().get(2).text())
                            .build()).collect(Collectors.toSet());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
