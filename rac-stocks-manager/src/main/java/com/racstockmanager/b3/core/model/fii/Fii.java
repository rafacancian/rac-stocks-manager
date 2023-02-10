package com.racstockmanager.b3.core.model.fii;

import com.racstockmanager.b3.core.model.stock.B3;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Fii implements B3 {

    private String name;
    private String code;
    private String sector;
    private String segment;
    private FiiIndicators indicators;

    public Fii(String name, String code, String sector, String segment, FiiIndicators indicators) {
        this.name = name;
        this.code = code;
        this.sector = sector;
        this.segment = segment;
        this.indicators = indicators;
    }

    public Fii(String name, String code, String sector, String segment) {
        this.name = name;
        this.code = code;
        this.sector = sector;
        this.segment = segment;
    }
}

