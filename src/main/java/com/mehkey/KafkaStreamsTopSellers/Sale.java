package com.mehkey.KafkaStreamsTopSellers;

import lombok.Data;
import lombok.NonNull;

@Data
public class Sale {
    @NonNull
    private String category;
    @NonNull
    private Double totalSales;

    public Sale(String category, Double totalSales) {
        this.category = category;
        this.totalSales = totalSales;
    }
}