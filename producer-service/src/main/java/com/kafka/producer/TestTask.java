package com.kafka.producer;

import java.util.Date;
import java.util.Random;

import org.springframework.kafka.core.KafkaTemplate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kafka.producer.model.Event;

public class TestTask implements Runnable {

	private KafkaTemplate<String, String> kafkaTemplate;
	private static final String TOPIC = "testkishore";

	public TestTask(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	public void run() {
		try {
			Random random = new Random();
			while (true) {
				Thread.sleep(30000);
				Gson gson = new GsonBuilder().create(); 
		    	Event event= new Event("NAME:"+Math.abs(random.nextInt()),"OSS:"+Math.abs(random.nextInt()),Math.abs(random.nextInt()),new Date(System.currentTimeMillis()));
		        kafkaTemplate.send(TOPIC, gson.toJson(event));
				//kafkaTemplate.send(TOPIC, "test value");
				System.out.println("Produced..");
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}