package com.ambulanceroute;

public class AmbulanceRoute {

    private HospitalUnitNode head = null;

    // Add unit to circular linked list
    public void addUnit(String unitName, boolean available) {
        HospitalUnitNode newNode = new HospitalUnitNode(unitName, available);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            HospitalUnitNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Find nearest available unit
    public void redirectPatient() {
        if (head == null) {
            System.out.println("No hospital units available.");
            return;
        }

        HospitalUnitNode current = head;
        do {
            if (current.available) {
                System.out.println("Patient redirected to: " + current.unitName);
                return;
            }
            current = current.next;
        } while (current != head);

        System.out.println("All units are currently unavailable.");
    }

    // Remove unit under maintenance
    public void removeUnit(String unitName) {
        if (head == null) return;

        HospitalUnitNode current = head;
        HospitalUnitNode previous = null;

        do {
            if (current.unitName.equals(unitName)) {

                // If only one node
                if (current == head && current.next == head) {
                    head = null;
                    return;
                }

                // If head needs removal
                if (current == head) {
                    HospitalUnitNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    previous.next = current.next;
                }

                System.out.println(unitName + " removed (under maintenance).");
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);
    }

    // Display route
    public void displayUnits() {
        if (head == null) {
            System.out.println("No hospital units in route.");
            return;
        }

        HospitalUnitNode temp = head;
        System.out.print("Ambulance Route: ");
        do {
            System.out.print(temp.unitName + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Back to Emergency)");
    }
}