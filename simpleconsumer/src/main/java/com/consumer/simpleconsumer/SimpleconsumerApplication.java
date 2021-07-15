package com.consumer.simpleconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.Consumer;

@SpringBootApplication
public class SimpleconsumerApplication {

	public static void main(String[] args)  {
		SampleConsumer consumerThread = new SampleConsumer("testTopic");
        consumerThread.start();
	}

}
