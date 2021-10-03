package com.kafka.consumer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.kafka.consumer.model.Event;
import com.kafka.consumer.repo.EventRepo;

@Service
public class ConsumerService {

	@Autowired(required = true)
	@Qualifier("eventRepo")
	private EventRepo eventRepo;

	public List<Event> getEventByEmpId(Integer empId) {

		try {
			return eventRepo.findByEmpId(empId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public List<Event> getEventDetails() {

		try {
			return eventRepo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
