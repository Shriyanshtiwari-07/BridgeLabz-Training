package com.smartcheckout;

import java.util.*;

public class Checkout {
	
	Queue<Customer> queue;
	
	Checkout(){
		queue = new LinkedList<>();
	}
	
	public void addCustomers(Customer customer) {
		queue.add(customer);
	}
	
	public void calculateTotalAmount() {
		if(queue.isEmpty()) {
			System.out.println("Nothing in queue.....");
			return;
		}
		for(Customer customer: queue) {
			customer.totalBill();
		}
	}
}