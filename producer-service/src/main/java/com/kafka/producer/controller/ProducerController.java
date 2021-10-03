package com.kafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kafka.producer.model.Event;

@RestController
public class ProducerController {
	
	 @Autowired
	    private KafkaTemplate<String, String> kafkaTemplate;

	    private static final String TOPIC = "testkishore";

	    @PostMapping("/publish")
	    public String post(@RequestBody Event event) {
	    	Gson gson = new GsonBuilder().create(); 
	    	
	        kafkaTemplate.send(TOPIC, gson.toJson(event));
	        return "Event published";
	    }

}
