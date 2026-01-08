package com.oops.cabbyGo;


public abstract class Vehicle extends Driver{
	private String vehicleNumber;
	private int capacity;
	private String type;
	
	public Vehicle(String driverName, String licenseNo, float rating, String vehicleNumber, int capacity, String type) {
		super(driverName, licenseNo, rating);
		this.vehicleNumber = vehicleNumber;
		this.capacity = capacity;
		this.type = type;
	}
	
	public void showVehicleDetails() {
		System.out.println("-----------------------------------");
		System.out.println("Vehicle Type: " + type);
		System.out.println("Vehicle Number: " + vehicleNumber);
		System.out.println("Capacity: " + capacity);
	}
}
