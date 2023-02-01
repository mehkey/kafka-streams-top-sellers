package com.mehkey.KafkaStreamsTopSellers;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.*;

import java.util.Properties;


public class TopSalesOverLastWeek {
    public static void main(String[] args) {
        // Set up the configuration for the Kafka Streams application
        Properties config = new Properties();
        config.put(StreamsConfig.APPLICATION_ID_CONFIG, "top-sales-over-last-week");
        config.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");

        // Define the input and output topics
        String inputTopic = "sales";
        String outputTopic = "top-sales-over-last-week";

        // Set up the StreamsBuilder and the topology
        StreamsBuilder builder = new StreamsBuilder();
        Topology topology = builder.build();

        // Set up the input stream and consume the records from the input topic
        KStream<String, Sale> salesStream = builder.stream(inputTopic, Consumed.with(Serdes.String(), new SaleSerde()));


        KGroupedStream<String, Sale> salesByCategoryStream = salesStream.groupBy((key, value) -> value.getCategory(), Grouped.with(Serdes.String(), new SaleSerde()));

        KStream<String, Sale> totalSalesByCategoryStream = salesByCategoryStream.reduce(
                (aggValue, newValue) -> new Sale(newValue.getCategory(), aggValue.getTotalSales() + newValue.getTotalSales())
        ).toStream();

        KGroupedStream<String, Sale> totalSalesByCategoryGroupedStream = totalSalesByCategoryStream.groupBy((key, value) -> value.getCategory(), Grouped.with(Serdes.String(), new SaleSerde()));
        // Set up the output stream and produce the records to the output topic

        // Filter the stream to only keep the top selling product in each category
        KStream<String, Sale> topSalesByCategoryStream = totalSalesByCategoryStream.filter((key, value) -> value.getTotalSales() > 10);

        topSalesByCategoryStream.to(outputTopic, Produced.with(Serdes.String(), new SaleSerde()));

        // Create the Kafka Streams application and start it
        KafkaStreams streams = new KafkaStreams(topology, config);
        streams.start();

// Add a shutdown hook to clean up resources when the application is closed
        Runtime.getRuntime().addShutdownHook(new Thread(streams::close));

        return;
    }
}
