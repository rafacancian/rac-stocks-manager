package com.racstockmanager.b3.core.methods.bazin;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BazinParams {

    Double currentPrice;
    String sector;
    Double dy;
    Double dividendYield12Month;
    Double divLiquidEbitda;
}
