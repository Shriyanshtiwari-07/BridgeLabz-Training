package com.collectors.orderrevenuesummary;

import java.util.*;
import java.util.stream.Collectors;

public class OrderRevenue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Customer> customers = List.of(new Customer("Nageshwar",5),
											new Customer("Lucky",2),
											new Customer("Himesh",15),
											new Customer("Nageshwar",3),
											new Customer("Lucky",8),
											new Customer("Himesh",10));
		
		Map<String,Double> orders = customers.stream()
				.collect(Collectors.groupingBy(Customer::getName,Collectors.summingDouble(Customer::getOrder)));
		
		orders.forEach((name,total)-> System.out.println(name+" -> "+total));
	}

}
