package com.oops.campusconnect;

public class Faculty extends Person{
	
	public Faculty(String name, String email, String id) {
		super(name, email, id);
	}
	
	public void printDetails() {
		System.out.println("Status: Faculty");
		super.printDetails();
	}
}