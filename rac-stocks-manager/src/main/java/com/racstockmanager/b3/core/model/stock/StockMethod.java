package com.racstockmanager.b3.core.model.stock;

import com.racstockmanager.b3.core.methods.bazin.ValidateError;
import lombok.Builder;

import java.util.List;

@Builder
public record StockMethod(Boolean isValid,
                          Integer score,
                          String maximumPrice,
                          String upsideFormatted,
                          Double upside,
                          String description,
                          List<ValidateError> errors) {
}
