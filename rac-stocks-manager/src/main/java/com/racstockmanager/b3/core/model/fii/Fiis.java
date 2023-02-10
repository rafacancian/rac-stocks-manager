package com.racstockmanager.b3.core.model.fii;

import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Fiis {
    LocalDate lastCalculation;
    Set<Fii> fiis;
}
