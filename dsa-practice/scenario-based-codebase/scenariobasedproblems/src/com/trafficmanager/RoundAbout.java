package com.trafficmanager;

class Roundabout {
    private VehicleNode head = null;

    // Add vehicle to roundabout
    public void addVehicle(String vehicleId) {
        VehicleNode newNode = new VehicleNode(vehicleId);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        VehicleNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Remove vehicle from roundabout
    public void removeVehicle(String vehicleId) {
        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        VehicleNode curr = head, prev = null;

        do {
            if (curr.vehicleId.equals(vehicleId)) {
                if (curr == head) {
                    VehicleNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                System.out.println("Vehicle " + vehicleId + " exited the roundabout.");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Vehicle not found in roundabout.");
    }

    // Print roundabout state
    public void printRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        VehicleNode temp = head;
        System.out.print("Roundabout: ");
        do {
            System.out.print(temp.vehicleId + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}