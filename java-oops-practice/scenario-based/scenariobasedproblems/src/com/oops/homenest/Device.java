package com.oops.homenest;

public abstract class Device implements IControllable {

    protected String deviceId;
    private boolean status;              // Encapsulated
    protected double energyUsage;         // in kWh

    // Firmware logs should not be publicly accessible
    protected String firmwareUpdateLog;

    // Constructor registers device with user
    public Device(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
        this.firmwareUpdateLog = "Initialized";
    }

    // Encapsulation: status cannot be modified externally
    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    public double getEnergyUsage() {
        return energyUsage;
    }

    // Operator usage: energy calculation
    public double calculateMonthlyEnergy(double hoursPerDay) {
        return energyUsage * hoursPerDay * 30;
    }

    // Secure firmware update
    protected void updateFirmware(String version) {
        firmwareUpdateLog = "Updated to version " + version;
    }

    @Override
    public void turnOn() {
        setStatus(true);
    }

    @Override
    public void turnOff() {
        setStatus(false);
    }

    // Polymorphic behavior
    @Override
    public abstract void reset();
}