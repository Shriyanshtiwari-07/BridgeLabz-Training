package com.hospitalqueue;

public class HospitalQueue {

    public static void bubbleSortByCriticality(Patient[] patients) {
        int n = patients.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (patients[j].criticality < patients[j + 1].criticality) {
                    // Swap adjacent patients
                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Patient[] queue = {
            new Patient("Ravi", 1, 5),
            new Patient("Anita", 2, 9),
            new Patient("Suresh", 3, 4),
            new Patient("Meena", 4, 8)
        };

        System.out.println("Before Sorting:");
        for (Patient p : queue) {
            p.display();
        }

        bubbleSortByCriticality(queue);

        System.out.println("\nAfter Sorting by Criticality:");
        for (Patient p : queue) {
            p.display();
        }
    }
}