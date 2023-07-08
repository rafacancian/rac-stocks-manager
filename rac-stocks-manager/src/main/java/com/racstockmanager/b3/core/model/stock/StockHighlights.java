package com.racstockmanager.b3.core.model.stock;

import lombok.Builder;

@Builder
public record StockHighlights(String code,
                              String companyName,
                              String companyNameClean,
                              Integer companyId,
                              Integer resultType,
                              String resultPercentageValue,
                              String resultAbsoluteValue,
                              String beforeMarket,
                              String afterMarket,
                              Boolean marketIsClosed,
                              String minValue,
                              String maxValue,
                              String volume,
                              Integer recentEvents,
                              Integer recentReports,
                              String uRLClear) {
}

/*{"code":"IRBR3","companyName":"IRB","companyNameClean":"irb-brasil","companyId":360,"resultType":0,
        "resultPercentageValue":"7,29","resultAbsoluteValue":"3,11","beforeMarket":"39,75",
        "afterMarket":"42,66","marketIsClosed":true,"minValue":"39,49","maxValue":"43,04",
        "volume":"232.028.158","recentEvents":0,"recentReports":0,"uRLClear":"/acoes/irbr3"},
*/