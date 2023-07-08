package com.racstockmanager.b3.core.utils;

import com.racstockmanager.b3.core.model.stock.Stock;

import java.text.DecimalFormat;
import java.util.Set;

public class ShowPercentageProgress {

    public static void execute(Set<Stock> stocksDB, Set<Stock> stocksResult) {
        int total = stocksDB.size();
        int totalProcessed = stocksResult.size();
        double percentage = (double) totalProcessed / total * 100;
        System.out.println(formatPercentage(percentage) + "%");
    }

    private static String formatPercentage(double porcentagem) {
        DecimalFormat pattern = new DecimalFormat("0.00");
        return pattern.format(porcentagem);
    }
}
