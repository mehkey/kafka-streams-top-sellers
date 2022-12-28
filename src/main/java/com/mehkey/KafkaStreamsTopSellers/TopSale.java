package com.mehkey.KafkaStreamsTopSellers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TopSale {

    private int amount;
    private Instant timestamp;

}