package com.oops.homenest;

public class Lock extends Device {

    public Lock(String deviceId) {
        super(deviceId, 0.02);
    }

    @Override
    public void reset() {
        turnOff();
        System.out.println("Lock " + deviceId + " reset: security codes refreshed.");
    }
}