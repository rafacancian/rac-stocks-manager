package com.racstockmanager.b3.core.model.stock;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Indicators {
    IndicatorsValuations indicatorsValuations;
    Boolean isJuridicalRecovery;
    StockMethod graham;
    StockMethod bazin;
    StockMethod wacc;
    StockMethod barsi;
    StockMethod cheaper;

}



