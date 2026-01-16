package com.trafficmanager;

public class Main {
    public static void main(String[] args) {

        Roundabout roundabout = new Roundabout();
        VehicleQueue queue = new VehicleQueue(3);

        // Vehicles arrive
        queue.enqueue("CAR-101");
        queue.enqueue("CAR-102");
        queue.enqueue("CAR-103");
        queue.enqueue("CAR-104"); // Overflow

        queue.printQueue();

        // Move vehicles from queue to roundabout
        String vehicle;
        while ((vehicle = queue.dequeue()) != null) {
            roundabout.addVehicle(vehicle);
        }

        roundabout.printRoundabout();

        // Vehicles exit
        roundabout.removeVehicle("CAR-102");
        roundabout.printRoundabout();

        roundabout.removeVehicle("CAR-999"); // Not found
    }
}