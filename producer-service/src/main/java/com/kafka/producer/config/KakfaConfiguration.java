package com.kafka.producer.config;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

import com.kafka.producer.TestTask;

@Configuration
public class KakfaConfiguration {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@Bean
	public void executeService() {
		ExecutorService execService = Executors.newFixedThreadPool(2);
		execService.execute(new TestTask(kafkaTemplate));
	}
	
}