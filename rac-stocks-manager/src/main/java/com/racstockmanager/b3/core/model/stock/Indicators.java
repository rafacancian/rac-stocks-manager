package com.racstockmanager.b3.core.model.stock;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Indicators {
    Valuations valuations;
    StockMethod graham;
    StockMethod bazin;
    StockMethod wacc;
    StockMethod barsi;
}



