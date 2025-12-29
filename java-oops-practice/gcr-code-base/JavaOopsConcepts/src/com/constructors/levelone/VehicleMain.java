package com.constructors.levelone;

public class VehicleMain {
	public static void main(String[] args) {
		
		// Creating vehicles objects
		Vehicle v1 = new Vehicle("Shriyansh", "Bike");
		Vehicle v2 = new Vehicle("Raj", "Bike");
		Vehicle v3 = new Vehicle("Saraswati", "Scooty");
		Vehicle v4 = new Vehicle("Rupam agrawal", "Bike");
		
		
		// Calling vehicle details 
		v1.displayVehicleDetails();
		v2.displayVehicleDetails();
		v3.displayVehicleDetails();
		v4.displayVehicleDetails();
		
		Vehicle.updateRegistrationFee();
		
		
		v1.displayVehicleDetails();
	}
}