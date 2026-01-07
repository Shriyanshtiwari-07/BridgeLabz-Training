package com.oops.vehiclerentalapplication;

public class RentalSystem {
	public static void main(String[] args) {
        
        Vehicle myCar = new Car("ABC-123");
        Vehicle myTruck = new Truck("TRK-999");
        Vehicle myBike = new Bike("BKE-001");

        
        Customer user = new Customer("Alice Smith", "CUST001");

        System.out.println("--- Rental Receipt ---");
        user.rentVehicle(myCar, 5);    
        user.rentVehicle(myTruck, 3);  
        user.rentVehicle(myBike, 2);   

        System.out.println("\n--- Availability Test ---");
        user.rentVehicle(myCar, 1);    
    }
}