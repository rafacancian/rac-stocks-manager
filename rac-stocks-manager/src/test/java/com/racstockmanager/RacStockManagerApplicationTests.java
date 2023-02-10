package com.racstockmanager;

import org.springframework.boot.test.context.SpringBootTest;

import java.text.NumberFormat;
import java.util.Locale;

@SpringBootTest
class RacStockManagerApplicationTests {

    public void aagivenAmount_whenConversion_thenNotNull() {
        Locale locale = new Locale("pt", "BR");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String format = numberFormat.format(10);
    }


}
