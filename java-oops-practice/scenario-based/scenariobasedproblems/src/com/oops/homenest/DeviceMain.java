package com.oops.homenest;

public class DeviceMain {

    public static void main(String[] args) {

        User user = new User("Alice");

        Device light = new Light("L-101");
        Device camera = new Camera("C-201");
        Device thermostat = new Thermostat("T-301");
        Device lock = new Lock("K-401");

        user.registerDevice(light);
        user.registerDevice(camera);
        user.registerDevice(thermostat);
        user.registerDevice(lock);

        light.turnOn();
        camera.turnOn();

        System.out.println("Monthly energy (Light): " +
                light.calculateMonthlyEnergy(6) + " kWh");

        user.resetAllDevices();
    }
}