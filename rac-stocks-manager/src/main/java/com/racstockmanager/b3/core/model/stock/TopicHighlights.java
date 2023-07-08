package com.racstockmanager.b3.core.model.stock;

import lombok.Builder;

@Builder
public record TopicHighlights(String name,
                              String value,
                              String upside,
                              String description) {
}