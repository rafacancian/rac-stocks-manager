package com.racstockmanager.b3.core.model.stock;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Stock implements B3 {
    
    private String name;
    private String code;
    private String sector;
    private String segment;
    private Indicators indicators;

    public Stock(String name, String code, String sector, String segment, Indicators indicators) {
        this.name = name;
        this.code = code;
        this.sector = sector;
        this.segment = segment;
        this.indicators = indicators;
    }

    public Stock(String name, String code, String sector, String segment) {
        this.name = name;
        this.code = code;
        this.sector = sector;
        this.segment = segment;
    }
}

