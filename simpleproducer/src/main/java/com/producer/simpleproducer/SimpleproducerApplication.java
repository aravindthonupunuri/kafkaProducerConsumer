package com.producer.simpleproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleproducerApplication {
	public static final String TOPIC = "testTopic";

	public static void main(String[] args) {
		boolean isAsync = false;

		SampleProducer producerThread = new SampleProducer(TOPIC, isAsync);
		// start the producer
		producerThread.start();

	}

}
