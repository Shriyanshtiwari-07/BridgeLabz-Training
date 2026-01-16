package com.hospitalqueue;

public class Patient {
    String name;
    int arrivalTime;
    int criticality; // 1 (low) to 10 (high)

    public Patient(String name, int arrivalTime, int criticality) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.criticality = criticality;
    }

    public void display() {
        System.out.println(
            "Name: " + name +
            ", Arrival: " + arrivalTime +
            ", Criticality: " + criticality
        );
    }
}
