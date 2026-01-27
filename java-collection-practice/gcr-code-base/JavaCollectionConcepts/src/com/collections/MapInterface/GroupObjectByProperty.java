package com.collections.MapInterface;

import java.util.*;

class Department{
	public String name;
	public String dept;
	
	public Department(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
}
public class GroupObjectByProperty {
	public static Map<String, List<String>> groupObject(List<Department> list){
		Map<String, List<String>> ans =new HashMap<>();
		
		for(Department emp: list) {
			ans.computeIfAbsent(emp.dept, k -> new ArrayList<>())
			.add(emp.name);
		}
		return ans;
	} 
	
	public static void main(String[] args) {
		List<Department> employees = List.of(
	            new Department("Alice", "HR"),
	            new Department("Bob", "IT"),
	            new Department("Carol", "HR")
	        );
		System.out.println(groupObject(employees));
	}
}
