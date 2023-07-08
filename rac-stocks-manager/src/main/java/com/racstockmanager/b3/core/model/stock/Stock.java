package com.racstockmanager.b3.core.model.stock;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
public class Stock implements B3 {

    private String name;
    private String code;
    private Sector sector;
    private String segment;
    private Indicators indicators;
    private Boolean isRelevant;

    public Stock() {
    }

    public Stock(String name, String code, Sector sector, String segment, Indicators indicators) {
        this.name = name;
        this.code = code;
        this.sector = sector;
        this.segment = segment;
        this.indicators = indicators;
        this.isRelevant = false;
    }

    public Stock(String name, String code, Sector sector, String segment, Indicators indicators, Boolean isRelevant) {
        this.name = name;
        this.code = code;
        this.sector = sector;
        this.segment = segment;
        this.indicators = indicators;
        this.isRelevant = isRelevant;
    }

    public Stock(String name, String code, Sector sector, String segment) {
        this.name = name;
        this.code = code;
        this.sector = sector;
        this.segment = segment;
        this.isRelevant = false;
    }

    public Stock(String name, String code, Sector sector, String segment, Boolean isRelevant) {
        this.name = name;
        this.code = code;
        this.sector = sector;
        this.segment = segment;
        this.isRelevant = isRelevant;
    }

}

