package com.oops.homenest;

public class Light extends Device {

    public Light(String deviceId) {
        super(deviceId, 0.06);
    }

    @Override
    public void reset() {
        turnOff();
        System.out.println("Light " + deviceId + " reset: brightness set to default.");
    }
}