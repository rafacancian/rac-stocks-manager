package com.racstockmanager.b3.core.utils;

import com.racstockmanager.b3.core.model.stock.Valuations;

import java.text.DecimalFormat;

public class B3CalculationUtils {


    protected static double calculateUpside(Double currentPrice, double maximumPrice) {
        return (maximumPrice / currentPrice - 1) * 100;
    }

    protected static String calculateUpsideFormatted(Double currentPrice, double maximumPrice) {
        double upside = calculateUpside(currentPrice, maximumPrice);
        return convertDoubleToPercentage(upside);
    }

    public static double convertStringToDouble(String stringValue) {
        try {
            return Double.parseDouble(stringValue.replace(",", "."));
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    public static double convertStringWithCoinToDouble(String value) {
        try {
            return Double.parseDouble(value.replace("R$", "").replace(",", "."));
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    public static double convertStringWithPercentageToDouble(String value) {
        try {
            return Double.parseDouble(value.replace("%", "").replace(",", "."));
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    public static Integer convertStringWithPercentageToInteger(String value) {
        try {
            return Integer.parseInt(value.replace("%", "").replace(",", "."));
        } catch (NumberFormatException e) {
            return 0;
        }
    }


    public static double convertStringToDoubleRegex(String stringValue) {
        try {
            //Matcher matcher = Pattern.compile("\\d+\\.\\d+").matcher(stringValue);
            stringValue = stringValue.replace(".", "");
            //stringValue = stringValue.replace(String.valueOf(stringValue.charAt(0) - 3), ".");
            return Double.parseDouble(stringValue);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    public static String convertDoubleToPercentage(Double upside) {
        return new DecimalFormat("#.##").format(upside) + "%";
    }

    public boolean validateNegativeValues(Valuations valuations) {
        return valuations.lpa() < 0.0 || valuations.vpa() < 0.0;
    }

}
