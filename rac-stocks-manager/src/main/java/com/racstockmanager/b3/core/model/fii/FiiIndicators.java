package com.racstockmanager.b3.core.model.fii;

import com.racstockmanager.b3.core.model.stock.StockMethod;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FiiIndicators {
    FiiValuations valuations;
    StockMethod bazin;
}



