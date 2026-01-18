package com.oops.homenest;

public class Camera extends Device {

    public Camera(String deviceId) {
        super(deviceId, 0.15);
    }

    @Override
    public void reset() {
        turnOff();
        System.out.println("Camera " + deviceId + " reset: recalibrating motion sensors.");
    }
}