package com.racstockmanager.b3.core.print;

import com.racstockmanager.b3.core.model.stock.Stock;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.Set;

@Service
public class StockPrints {

    public void printStockInformation(Set<Stock> stocks) {
        System.out.println("");
        DecimalFormat fmt = new DecimalFormat("0.00");
        stocks.stream().forEach(stock -> {

            System.out.print(stock.getCode() + " | R$" + stock.getIndicators().getValuations().currentValue());
            if (stock.getIndicators().getGraham() != null && stock.getIndicators().getGraham().isValid()) {
                System.out.print(" | Graham R$" + fmt.format(stock.getIndicators().getGraham().maximumPrice())
                        + ", Upside " + stock.getIndicators().getGraham().upside());
            }

            if (stock.getIndicators().getBazin().isValid()) {
                System.out.print(" | Bazin R$" + fmt.format(stock.getIndicators().getBazin().maximumPrice()));
            }

            if (stock.getIndicators().getWacc().isValid()) {
                System.out.print(" | Wacc " + stock.getIndicators().getWacc().upside() + "%");
            }

            if (stock.getIndicators().getBarsi().isValid()) {
                System.out.print(" | Barsi AGV " + fmt.format(stock.getIndicators().getBarsi().maximumPrice()));
            }
            System.out.println("");
        });
    }
}
