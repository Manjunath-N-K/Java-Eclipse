package com.association1.java;

public class Student {

	private String name;
	private int rollno;
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public synchronized int getRollno() {
		return rollno;
	}

	public synchronized void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public synchronized String getCity() {
		return city;
	}

	public synchronized void setCity(String city) {
		this.city = city;
	}
	
	
	
}
