package com.racstockmanager.b3.core.model.stock;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.racstockmanager.b3.core.model.fii.Fiis;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Stocks.class, name = "Stocks"),
        @JsonSubTypes.Type(value = Fiis.class, name = "Fiis"),
})
public interface B3 {
}
