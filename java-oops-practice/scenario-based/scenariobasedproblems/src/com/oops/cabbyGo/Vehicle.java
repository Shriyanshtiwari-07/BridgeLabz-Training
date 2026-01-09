package com.oops.cabbyGo;

public class Vehicle {
    protected String driverName;
    protected String licenseNo;
    protected float rating;
    protected String vehicleNumber;
    protected int capacity;
    protected String type;

    public Vehicle(String driverName, String licenseNo, float rating, String vehicleNumber, int capacity, String type) {
        this.driverName = driverName;
        this.licenseNo = licenseNo;
        this.rating = rating;
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
    }

    public void showVehicleDetails() {
        System.out.println("Driver: " + driverName);
        System.out.println("License: " + licenseNo);
        System.out.println("Rating: " + rating);
        System.out.println("Vehicle No: " + vehicleNumber);
        System.out.println("Capacity: " + capacity);
        System.out.println("Type: " + type);
    }
}
