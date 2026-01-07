package com.oops.vehiclerentalapplication;

public abstract class Vehicle {
	private String plateNumber;
    protected double baseRate; 
    private boolean isAvailable;

    public Vehicle(String plateNumber, double baseRate) {
        this.plateNumber = plateNumber;
        this.baseRate = baseRate;
        this.isAvailable = true;
    }

    
    public String getPlateNumber() { return plateNumber; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    public abstract String getVehicleType();
}