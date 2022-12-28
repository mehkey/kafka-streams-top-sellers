package com.mehkey.KafkaStreamsTopSellers;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;


import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;
import java.util.Random;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsConfig;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.DockerComposeContainer;
import org.testcontainers.containers.wait.strategy.Wait;

import static org.junit.Assert.assertEquals;

/* This Test Needs the Kafka Broker to be running*/
@SpringBootTest
public class TopSalesOverLastWeekTest {
    private static final String INPUT_TOPIC = "sales";
    private static final String OUTPUT_TOPIC = "top-sales";

    /*
    public static DockerComposeContainer environment;

    @BeforeClass
    public static void setUp() {
        environment =
                new DockerComposeContainer(new File("./docker-compose.yml"))
                        .withExposedService("kafka", 9092, Wait.forListeningPort())
                        .withExposedService("streams-app", 8080, Wait.forHttp("/health"));

    }*/

    /*
    @ClassRule
    public static DockerComposeContainer environment =
            new DockerComposeContainer(new File("docker-compose.yml"))
                    .withExposedService("kafka", 9092, Wait.forListeningPort())
                    .withExposedService("streams-app", 8080, Wait.forHttp("/health"));

    @AfterClass
    public static void cleanUp() {
        environment.stop();
    }*/

    @Test
    public void testTopSalesOverLastWeek() {
        try {
            // Set up the producer to send new sale records to the input topic every 3 seconds
            Properties producerProps = new Properties();
            //producerProps.put("bootstrap.servers", environment.getServiceHost("kafka", 9092));
            producerProps.put("bootstrap.servers", "localhost:9092");
            //producerProps.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
            //producerProps.put("value.serializer", "com.mehkey.KafkaStreamsTopSellers.SaleSerde");
            producerProps.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
            producerProps.put("value.serializer", "org.apache.kafka.common.serialization.LongSerializer");//Serdes.String().getClass());
            KafkaProducer<String, String> producer = new KafkaProducer<>(producerProps);

            Random random = new Random();
            int numCategories = 5;
            int numSales = 0;

            while (numSales < 10) {
                String category = "category-" + random.nextInt(numCategories);
                //Sale sale = new Sale(category, random.nextDouble() * 100);
                String saleString = category +','+ (random.nextLong(1,10000));
                Long price = random.nextLong(1,10000);
                System.out.println("sending sale string :" + saleString );
                //ProducerRecord<String, Long> records =
                producer.send(new ProducerRecord(INPUT_TOPIC, category, price));
                numSales++;
                Thread.sleep(1000);
            }

            // Set up the consumer to read the records from the output topic
            Properties consumerProps = new Properties();
            consumerProps.put("bootstrap.servers", "localhost:9092");
            //consumerProps.put("bootstrap.servers", environment.getServiceHost("kafka", 9092));
            consumerProps.put("group.id", "test-consumer");
            //consumerProps.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
            //consumerProps.put("value.deserializer", "com.mehkey.KafkaStreamsTopSellers.SaleSerde");
            consumerProps.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
            consumerProps.put("value.deserializer", "org.apache.kafka.common.serialization.LongDeserializer");


            KafkaConsumer<String, Long> consumer = new KafkaConsumer<>(consumerProps);
            consumer.subscribe(Arrays.asList(OUTPUT_TOPIC));

            // Wait for 1 minute to allow the Kafka Streams application to process the records and produce the top-sales-over-last-week results
            long startTime = System.currentTimeMillis();
            while (System.currentTimeMillis() - startTime < 60000) {
                ConsumerRecords<String, Long> records = consumer.poll(Duration.ofMillis(1000));
                System.out.println("number of Records Found: "+ records.count());
                for (ConsumerRecord<String, Long> record : records) {

                    //String[] tokens = record.value().split(",");
                    //String category = tokens[0];
                    //Long price = Long.parseLong(tokens[1]);

                    //String expectedCategory = record.key();
                    //Sale expectedSale = record.value();
                    //System.out.println("category:" + category+ " sales:"+price);
                    System.out.println("category:" + record.key()+ " sales:"+record.value());

                    //System.out.println("category:" + category+ " sales:"+price);

                    //assertEquals(category, category);
                    // Add additional checks here to validate the top-sales-over-last-week results
                }
            }
            System.out.println("FINITO");

            consumer.close();
        } catch (InterruptedException e) {
            // Handle interrupt
        }
    }

}


