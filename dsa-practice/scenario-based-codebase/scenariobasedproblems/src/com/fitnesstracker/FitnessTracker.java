package com.fitnesstracker;

public class FitnessTracker {

    static class User {
        String name;
        int steps;

        User(String name, int steps) {
            this.name = name;
            this.steps = steps;
        }
    }

    static void bubbleSort(User[] users) {
        int n = users.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (users[j].steps < users[j + 1].steps) {
                    User temp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {

        User[] users = {
            new User("Amit", 8500),
            new User("Neha", 12000),
            new User("Ravi", 9800),
            new User("Priya", 11000),
            new User("Kiran", 7600)
        };

        bubbleSort(users);

        System.out.println("Daily Step Count Leaderboard:");
        for (User u : users) {
            System.out.println(u.name + " - " + u.steps + " steps");
        }
    }
}