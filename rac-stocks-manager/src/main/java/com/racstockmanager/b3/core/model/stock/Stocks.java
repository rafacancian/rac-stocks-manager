package com.racstockmanager.b3.core.model.stock;

import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Stocks {
    LocalDate lastCalculation;
    Set<Stock> stocks;
}
