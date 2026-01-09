package com.oops.cabbyGo;

public class CabbyGoDemo {
    public static void main(String[] args) {
        IRideService ride1 = new Sedan("Amit", "DL123", 4.5f, "MP09AB1234");
        ride1.bookRide(10);
        ride1.showVehicleDetails();
        ride1.endRide();

        IRideService ride2 = new SUV("Rohit", "DL456", 4.7f, "MP09CD5678");
        ride2.bookRide(8);
        ride2.showVehicleDetails();
        ride2.endRide();
    }
}
