package com.mehkey.KafkaStreamsTopSellers;

import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.*;
import org.apache.kafka.streams.kstream.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafkaStreams;

import java.time.Instant;
import java.util.Properties;

/*
@SpringBootApplication
public class KafkaStreamsTopSellersApplication {

	public static void main(String[] args) {

		SpringApplication.run(KafkaStreamsTopSellersApplication.class, args);

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

		// Group the records by product category
		//KStream<String, Sale> salesByCategoryStream = salesStream.groupBy((key, value) -> value.getCategory(), Grouped.with(Serdes.String(), new SaleSerde()));

        // Calculate the total sales for each product category
        KStream<String, Sale> totalSalesByCategoryStream = salesByCategoryStream.reduce(
                (aggValue, newValue) -> new Sale(newValue.getCategory(), aggValue.getTotalSales() + newValue.getTotalSales()),
                (aggValue, oldValue) -> new Sale(oldValue.getCategory(), aggValue.getTotalSales() - oldValue.getTotalSales())
        );


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

 */

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KTable;
import org.apache.kafka.streams.kstream.Materialized;
import org.apache.kafka.streams.kstream.TimeWindows;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Duration;
import java.util.Properties;

@SpringBootApplication
public class KafkaStreamsTopSellersApplication {

	public static void main(String[] args) {
		//SpringApplication.run(KafkaStreamsTopSellersApplication.class, args);
		Properties config = new Properties();
		config.put(StreamsConfig.APPLICATION_ID_CONFIG, "top-sales-stream");
		config.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		config.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
		config.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.Long().getClass());

		StreamsBuilder builder = new StreamsBuilder();
		KStream<String, Long> salesStream = builder.stream("sales"); // <-- make sure to specify an input topic

		KTable<Windowed<String>, Long> salesByCategory = salesStream
				.map((key, value) -> {
					//String[] tokens = value.split(",");
					//String category = tokens[0];
					//Long price = Long.parseLong(tokens[1]);
					return new KeyValue<String,Long>(key, value);
				})
				.groupByKey()
				.windowedBy(TimeWindows.of(Duration.ofDays(7)))
				.reduce((value1, value2) -> value1 + value2,
						Materialized.as("sales-by-category"));

		salesByCategory.toStream()
				.map((key, value) -> new KeyValue<String,Long>(key.key(), value))
				.to("top-sales");

		Topology topology = builder.build();
		KafkaStreams streams = new KafkaStreams(topology, config);
		streams.start();
	}

}
/*
	@Bean
	public Topology topology() {
		StreamsBuilder builder = new StreamsBuilder();
		KStream<String, String> salesStream = builder.stream("sales");

		KTable<Windowed<String>, Long> salesByCategory = salesStream
				.map((key, value) -> {
					String[] tokens = value.split(",");
					String category = tokens[0];
					Long price = Long.parseLong(tokens[1]);
					return new KeyValue<>(category, price);
				})
				.groupByKey()
				.windowedBy(TimeWindows.of(Duration.ofDays(7)))
				.reduce((value1, value2) -> value1 + value2, Materialized.as("sales-by-category"));

		salesByCategory.toStream()
				.map((key, value) -> new KeyValue<>(key.key(), value))
				.to("top-sales");

		return builder.build();
	}

	@Bean
	public KafkaStreams kafkaStreams(Topology topology, StreamsConfig config) {
		return new KafkaStreams(topology, config);
	}

	@Bean
	public StreamsConfig streamsConfig() {
		Properties config = new Properties();
		config.put(StreamsConfig.APPLICATION_ID_CONFIG, "top-sales-stream");
		config.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		config.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
		config.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());
		//config.put(StreamsConfig.proper, Serdes.String().getClass());
		return new StreamsConfig(config);
	}
}
*/