package com.traincompanion;

class TrainCompanion {
    private Compartment head;
    private Compartment tail;

    // Insert compartment at end
    public void addCompartment(String name) {
        Compartment newCompartment = new Compartment(name);

        if (head == null) {
            head = tail = newCompartment;
        } else {
            tail.next = newCompartment;
            newCompartment.prev = tail;
            tail = newCompartment;
        }
    }

    // Remove a compartment by name
    public void removeCompartment(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {

                if (temp == head) {
                    head = temp.next;
                    if (head != null) head.prev = null;
                } 
                else if (temp == tail) {
                    tail = temp.prev;
                    if (tail != null) tail.next = null;
                } 
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println(name + " compartment removed.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found.");
    }

    // Traverse forward
    public void traverseForward() {
        Compartment temp = head;
        System.out.print("Forward Traversal: ");
        while (temp != null) {
            System.out.print(temp.name + " ⇄ ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Traverse backward
    public void traverseBackward() {
        Compartment temp = tail;
        System.out.print("Backward Traversal: ");
        while (temp != null) {
            System.out.print(temp.name + " ⇄ ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    // Display adjacent compartments
    public void showAdjacent(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {

                System.out.println("Current: " + temp.name);
                System.out.println("Previous: " +
                        (temp.prev != null ? temp.prev.name : "None"));
                System.out.println("Next: " +
                        (temp.next != null ? temp.next.name : "None"));
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found.");
    }
}
