package com.oops.cabbyGo;

public class Sedan extends Vehicle implements IRideService{
	private double distance;
	private double baseFare = 70;
	
	public Sedan(String driverName, String licenseNo, float rating, String vehicleNumber) {
		super(driverName, licenseNo, rating, vehicleNumber, 3, "Sedan");
	}
	
	@Override
	public void bookRide(double distance) {
		this.distance = distance;
	}
	
	@Override
	public void endRide() {
		System.out.println("Your Fare: " + (baseFare * distance));
		System.out.println("Hope your ride was excellent, Visit Again..");
	}
	
	@Override
	public void showVehicleDetails() {
		super.showVehicleDetails();
		System.out.println("Distance: " + distance);
	}
}