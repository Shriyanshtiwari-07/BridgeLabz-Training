package com.ambulanceroute;

public class Main {
    public static void main(String[] args) {

        AmbulanceRoute route = new AmbulanceRoute();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        route.displayUnits();

        // Redirect patient
        route.redirectPatient();

        // Remove unit under maintenance
        route.removeUnit("Radiology");

        route.displayUnits();

        // Redirect again
        route.redirectPatient();
    }
}