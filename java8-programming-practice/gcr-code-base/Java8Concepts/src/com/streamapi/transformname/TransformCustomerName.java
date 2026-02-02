package com.streamapi.transformname;
import java.util.*;

public class TransformCustomerName {
	public static void main(String[] args) {
		List<String> customers = List.of("Nageshwar", "Himesh", "Lucky", "Rajeev");
		
		customers.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
	}
}
