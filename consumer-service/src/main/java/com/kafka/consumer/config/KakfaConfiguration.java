package com.kafka.consumer.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.google.gson.Gson;
import com.kafka.consumer.model.Event;
import com.kafka.consumer.repo.EventRepo;

@Configuration
public class KakfaConfiguration {
	
	@Autowired(required = true)
	@Qualifier("eventRepo")
	private EventRepo eventRepo;

	@KafkaListener(id = "myid", topics = "testkishore")
	public void listen(String in) {		
		System.out.println("consumed message==" + in);
		Gson g = new Gson();
		try {
			Event event = g.fromJson(in, Event.class);
			eventRepo.save(event);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}