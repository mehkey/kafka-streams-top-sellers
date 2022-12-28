package com.mehkey.KafkaStreamsTopSellers;

/*
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.Map;

public class SaleSerde implements Serde<Sale> {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Serializer<Sale> serializer() {
        return new JsonSerializer<Sale>( );
    }

    @Override
    public Deserializer<Sale> deserializer() {
        return new JsonDeserializer<Sale>();
    }

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        // No-op
    }

    @Override
    public void close() {
        // No-op
    }
}
*/

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

public class SaleSerde extends JsonSerde<Sale> implements Serializer<Sale>, Serde<Sale>,Deserializer<Sale> {
    private final ObjectMapper objectMapper = new ObjectMapper();

    public SaleSerde() {
        super(Sale.class);
    }

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        super.configure(configs, isKey);
    }

    @Override
    public Sale deserialize(String topic, byte[] data) {

        return super.deserializer().deserialize(topic, data);

    }

    @Override
    public byte[] serialize(String topic, Sale data) {
        try {
            return objectMapper.writeValueAsBytes(data);
        } catch (JsonProcessingException e) {
            throw new SerializationException("Error serializing Sale object", e);
        }
    }

    @Override
    public void close() {
        // No-op
    }

    /*
    @Override
    public Serializer<Sale> serializer() {
        return new JsonSerializer<Sale>( );
    }

    @Override
    public Deserializer<Sale> deserializer() {
        return new JsonDeserializer<Sale>();
    }*/
}
