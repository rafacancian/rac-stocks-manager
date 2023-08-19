package com.racstockmanager.b3.adapters.rest.dto.stock;

import com.racstockmanager.b3.core.methods.bazin.ValidateError;
import com.racstockmanager.b3.core.model.stock.Ranking;
import lombok.Builder;

import java.util.Comparator;
import java.util.List;

@Builder
public record StockShortDto(String code,
                            String name,
                            String currentPrice,
                            String dividendYield,
                            String valorization12M,
                            String earningYield,
                            String roe,
                            String maximumPrice,
                            String upsideFormatted,
                            Double upside,
                            String status,
                            String description,
                            Integer score,
                            List<ValidateError> errors,
                            boolean showErrors,
                            Ranking ranking) implements Comparator<StockShortDto> {
    @Override
    public int compare(StockShortDto o1, StockShortDto o2) {
        return Double.compare(o1.upside(), o2.upside());
    }
}
