package com.kafka.producer.model;

import java.io.Serializable;
import java.util.Date;

public class Event implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String dept;
	private int empId;
	private Date date;

	public Event(String name, String dept, int empId, Date date) {
		this.name = name;
		this.dept = dept;
		this.empId = empId;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
