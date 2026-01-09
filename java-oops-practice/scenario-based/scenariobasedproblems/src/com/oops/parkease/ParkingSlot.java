package com.oops.parkease;
import java.util.*;

public class ParkingSlot {
	private final String slotId;
    private boolean isOccupied;
    private final String vehicleTypeAllowed;

    private List<String> bookingLogs = new ArrayList<>();

    public ParkingSlot(String slotId, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public String getSlotId() {
        return slotId;
    }

    public String getVehicleTypeAllowed() {
        return vehicleTypeAllowed;
    }

   
    public void assignSlot(Vehicle vehicle) {
        if (isOccupied) {
            System.out.println("Slot already occupied ❌");
            return;
        }
        isOccupied = true;
        bookingLogs.add("Vehicle " + vehicle.getVehicleNumber() +
                        " parked in slot " + slotId);
        System.out.println("Slot " + slotId + " assigned successfully");
    }

    public void releaseSlot(Vehicle vehicle, int hours) {
        if (!isOccupied) {
            System.out.println("Slot already empty ");
            return;
        }
        isOccupied = false;
        double charge = vehicle.calculateCharges(hours);
        bookingLogs.add("Vehicle " + vehicle.getVehicleNumber() +
                        " exited. Charges: " + charge);
        System.out.println("Slot released. Total Charges: " + charge);
    }

    
    public void showLogs() {
        System.out.println(" Booking Logs for Slot " + slotId);
        for (String log : bookingLogs) {
            System.out.println(log);
        }
    }
}