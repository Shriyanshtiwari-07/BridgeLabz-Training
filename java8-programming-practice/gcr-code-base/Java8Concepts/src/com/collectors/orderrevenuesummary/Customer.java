package com.collectors.orderrevenuesummary;

public class Customer {
	private String name;
	private int order;
	
	public Customer(String name, int order) {
		
		this.name = name;
		this.order = order;
	}

	public String getName() {
		return name;
	}

	public int getOrder() {
		return order;
	}
	
}
