package com.oops.vehiclerentalapplication;

public class Customer {
	private String name;
    private String customerId;

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public void rentVehicle(Vehicle v, int days) {
        if (v.isAvailable()) {
            
            double total = ((Rentable) v).calculateRent(days);
            v.setAvailable(false);
            System.out.println(name + " rented a " + v.getVehicleType() + 
                               " [" + v.getPlateNumber() + "] for " + days + 
                               " days. Total: $" + total);
        } else {
            System.out.println("Sorry, " + v.getPlateNumber() + " is already rented.");
        }
    }
}