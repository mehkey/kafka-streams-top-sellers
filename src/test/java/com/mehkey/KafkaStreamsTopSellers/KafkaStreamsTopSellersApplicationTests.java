package com.mehkey.KafkaStreamsTopSellers;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.junit.After;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.KafkaMessageListenerContainer;
import org.springframework.kafka.listener.MessageListener;
import org.springframework.kafka.test.utils.ContainerTestUtils;
import org.springframework.kafka.test.utils.KafkaTestUtils;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

/*
@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext
class KafkaStreamsTopSellersApplicationTests {


	private static final String SALE_TOPIC = "sales";

	private static final String TOP_SALES_TOPIC = "top-sales";
	private static final int NUM_CATEGORIES = 100;
	private static final int RECORD_INTERVAL_SECONDS = 3;
	private static final int CHECK_INTERVAL_SECONDS = 60;

	@Autowired
	private SaleProducer saleProducer;

	@ClassRule
	public static KafkaEmbedded embeddedKafka = new KafkaEmbedded(1, true, SALE_TOPIC, TOP_SALES_TOPIC);

	private KafkaMessageListenerContainer<String, String> container;
	private BlockingQueue<ConsumerRecord<String, String>> records;

	@Before
	public void setUp() throws Exception {
		// set up the consumer
		Map<String, Object> consumerProps = KafkaTestUtils.consumerProps("top-sales-group", "true", embeddedKafka);
		DefaultKafkaConsumerFactory<String, String> consumerFactory = new DefaultKafkaConsumerFactory<>(consumerProps, new StringDeserializer(), new StringDeserializer());
		ContainerProperties containerProperties = new ContainerProperties(TOP_SALES_TOPIC);
		container = new KafkaMessageListenerContainer<
				container.setupMessageListener((MessageListener<String, String>) records::add);
		container.start();
		ContainerTestUtils.waitForAssignment(container, embeddedKafka.getPartitionsPerTopic());

		// start producing sale records
		saleProducer.startProducing(NUM_CATEGORIES, RECORD_INTERVAL_SECONDS);
	}

	@After
	public void tearDown() {
		container.stop();
		saleProducer.stopProducing();
	}

	@Test
	public void testTopSales() throws Exception {
		// wait for a minute to allow sale records to be produced and processed
		TimeUnit.SECONDS.sleep(CHECK_INTERVAL_SECONDS);

		// check the top-sales topic to make sure it has the correct values
		while (records.size() > 0) {
			ConsumerRecord<String, String> record = records.poll(10, TimeUnit.MILLISECONDS);
			String[] tokens = record.value().split(",");
			String category = tokens[0];
			long totalSales = Long.parseLong(tokens[1]);
			// check that the total sales for the category are greater than zero
			assertThat(totalSales).isGreaterThan(0L);
		}
	}

	public static class SaleProducer {

		private final Random random = new Random();
		private final BlockingQueue<String> queue = new LinkedBlockingQueue<>();
		private volatile boolean running = true;
		private Thread thread;

		@Autowired
		private SaleProducerTemplate template;

		public void startProducing(int numCategories, int intervalSeconds) {
			thread = new Thread(() -> {
				while (running) {
					try {
						String category = "category-" + random.nextInt(numCategories);
						long price = random.nextInt(1000);
						String sale = category + "," + price;
						queue.put(sale);
						template.send(SALE_TOPIC, sale);
						TimeUnit.SECONDS.sleep(intervalSeconds);
					} catch (InterruptedException e) {
						// ignore
					}
				}
			});
			thread.start();
		}

		public void stopProducing() {
			running = false;
			if (thread != null) {
				thread.interrupt();
			}
		}
	}
}

*/