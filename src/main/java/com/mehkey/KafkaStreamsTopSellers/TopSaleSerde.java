package com.mehkey.KafkaStreamsTopSellers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerde;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.Map;

public class TopSaleSerde implements Serde<TopSale> {

    private final JsonSerde<TopSale> jsonSerde;

    public TopSaleSerde() {
        this.jsonSerde = new JsonSerde<>(TopSale.class);
    }

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        jsonSerde.configure(configs, isKey);
    }

    @Override
    public void close() {
        jsonSerde.close();
    }

    @Override
    public Serializer<TopSale> serializer() {
        return jsonSerde.serializer();
    }

    @Override
    public Deserializer<TopSale> deserializer() {
        return jsonSerde.deserializer();
    }

}
