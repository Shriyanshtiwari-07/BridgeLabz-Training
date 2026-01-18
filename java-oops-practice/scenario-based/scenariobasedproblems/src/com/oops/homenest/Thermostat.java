package com.oops.homenest;

public class Thermostat extends Device {

    private int temperature;

    public Thermostat(String deviceId) {
        super(deviceId, 0.20);
        this.temperature = 24;
    }

    @Override
    public void reset() {
        temperature = 24;
        System.out.println("Thermostat " + deviceId + " reset: temperature set to 24°C.");
    }
}