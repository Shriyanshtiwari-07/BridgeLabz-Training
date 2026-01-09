package com.oops.cabbyGo;

public class SUV extends Vehicle implements IRideService {
    private double distance;
    private double baseFare = 55;

    public SUV(String driverName, String licenseNo, float rating, String vehicleNumber) {
        super(driverName, licenseNo, rating, vehicleNumber, 6, "SUV");
    }

    public void bookRide(double distance) {
        this.distance = distance;
    }

    public void endRide() {
        System.out.println("Your Fare: " + (baseFare * distance));
    }

    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("Distance: " + distance);
    }
}
