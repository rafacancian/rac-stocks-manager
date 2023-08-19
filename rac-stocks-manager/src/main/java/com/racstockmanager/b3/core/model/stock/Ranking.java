package com.racstockmanager.b3.core.model.stock;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ranking {

    private Integer roe;
    private Integer earningYield;
    private Integer magicFormula;

    public Ranking(Integer roe, Integer earningYield, Integer magicFormula) {
        this.roe = roe;
        this.earningYield = earningYield;
        this.magicFormula = magicFormula;
    }

    public Ranking() {
    }
}
