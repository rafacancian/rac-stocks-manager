package com.racstockmanager.b3.core.utils;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyUtils {

    public static String convertDoubleToBRL(Double value) {
        Locale locale = new Locale("pt", "BR");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        return numberFormat.format(value);
    }
}
