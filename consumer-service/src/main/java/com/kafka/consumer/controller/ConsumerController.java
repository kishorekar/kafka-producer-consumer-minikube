package com.kafka.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.consumer.service.ConsumerService;

@RestController
public class ConsumerController {

	@Autowired
	private ConsumerService service;
	
	@GetMapping("/events/{empId}")
	public ResponseEntity<?> getEventById(@PathVariable("empId") int empId) {

		try {
			return new ResponseEntity<>(service.getEventByEmpId(empId), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(new Exception(e.getMessage()), HttpStatus.EXPECTATION_FAILED);
		}
	}
	
	@GetMapping("/events")
	public ResponseEntity<?> getEventDtls() {

		try {
			return new ResponseEntity<>(service.getEventDetails(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(new Exception(e.getMessage()), HttpStatus.EXPECTATION_FAILED);
		}
	}

}
