package com.racstockmanager.b3.core.utils;

import com.racstockmanager.b3.core.model.stock.IndicatorsValuations;
import lombok.extern.slf4j.Slf4j;

import java.text.DecimalFormat;

@Slf4j
public class CalculatorUtils {


    protected static double calculateUpside(Double currentPrice, double maximumPrice) {
        return (maximumPrice / currentPrice - 1) * 100;
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
            if (stringValue.matches("-?[0-9.]+")) {
                stringValue = stringValue.replace(".", "");
                //stringValue = stringValue.replace(String.valueOf(stringValue.charAt(0) - 3), ".");
                return Double.parseDouble(stringValue);
            }
            //log.warn("Not a number to convert: " + stringValue);
            return 0.0;

        } catch (Exception e) {
            log.error("Error to convert value: " + stringValue);
            return 0.0;
        }
    }

    public static double convertStringBigNumberToDoubleRegex(String stringValue) {
        try {
            String valorFormatado = stringValue.replaceAll("\\.", "").replace(",", ".");
            return Double.parseDouble(valorFormatado);
        } catch (Exception e) {
            log.error("Error to convert value: " + stringValue);
            return 0.0;
        }
    }

    public static String convertDoubleToPercentage(Double upside) {
        return new DecimalFormat("#.##").format(upside) + "%";
    }

    public boolean validateNegativeValues(IndicatorsValuations indicatorsValuations) {
        return indicatorsValuations.lpa() < 0.0 || indicatorsValuations.vpa() < 0.0;
    }

}
