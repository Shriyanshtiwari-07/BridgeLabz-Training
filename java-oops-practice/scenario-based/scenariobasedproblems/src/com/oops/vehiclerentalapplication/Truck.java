package com.oops.vehiclerentalapplication;

public class Truck extends Vehicle implements Rentable{
	public Truck(String plateNumber) {
        super(plateNumber, 100.0); 
    }

    @Override
    public double calculateRent(int days) {
        double heavyDutyTax = 1.2; 
        return (baseRate * days) * heavyDutyTax;
    }

    @Override
    public String getVehicleType() { return "Truck"; }
}