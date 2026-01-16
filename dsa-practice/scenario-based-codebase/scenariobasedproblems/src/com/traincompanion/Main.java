package com.traincompanion;

public class Main {
    public static void main(String[] args) {

        TrainCompanion train = new TrainCompanion();

        train.addCompartment("Engine");
        train.addCompartment("Sleeper");
        train.addCompartment("Pantry");
        train.addCompartment("WiFi Coach");
        train.addCompartment("AC Coach");

        train.traverseForward();
        train.traverseBackward();

        train.showAdjacent("Pantry");

        train.removeCompartment("WiFi Coach");
        train.traverseForward();
    }
}