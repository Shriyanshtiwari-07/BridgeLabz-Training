package com.collectors.employeesalarycategorization;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSalaryCategorization {
	public static void main(String[] args) {
		
		List<Employee> employees = List.of(new Employee("Nageshwar","IT",50000),
											new Employee("Himesh", "IT", 40000),
											new Employee("Lucky","IT", 45000),
											new Employee("Rajeev","Management", 30000),
											new Employee("Raj","Management", 30000));
		
		Map<String, Double> ans = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDept,
						Collectors.averagingDouble(Employee::getSalary)));
		
		ans.forEach((dept, salary) -> System.out.println(dept+" -> "+salary));
	}
}
