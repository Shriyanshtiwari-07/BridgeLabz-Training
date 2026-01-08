package com.oops.cabbyGo;

public class Driver {
	
	private String name;
	private String licenseNumber;
	private float rating;  // out of 5
	
	Driver(String name, String licenseNumber, float rating){
		this.name = name;
		this.licenseNumber = licenseNumber;
		this.rating = rating;
	}
	
	public void showDriverDetails() {
		System.out.println("Driver Name: " + name);
		System.out.println("Rating: " + rating);
		System.out.println("-----------------------------------");
	}
	
}
