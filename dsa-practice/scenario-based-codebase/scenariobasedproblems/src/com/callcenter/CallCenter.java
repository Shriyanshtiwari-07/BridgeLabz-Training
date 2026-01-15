package com.callcenter;

import java.util.*;

public class CallCenter {

    // Queue for normal customers (FIFO)
    private Queue<Customer> normalQueue;

    // Priority Queue for VIP customers
    private PriorityQueue<Customer> vipQueue;

    // HashMap to store number of calls per customer
    private HashMap<String, Integer> callCount;

    public CallCenter() {
        normalQueue = new LinkedList<>();

        vipQueue = new PriorityQueue<>(
            (a, b) -> Boolean.compare(b.isVIP, a.isVIP)
        );

        callCount = new HashMap<>();
    }

    // Method to receive a call
    public void receiveCall(Customer customer) {

        // Update call count
        callCount.put(
            customer.name,
            callCount.getOrDefault(customer.name, 0) + 1
        );

        // Add customer to appropriate queue
        if (customer.isVIP) {
            vipQueue.add(customer);
        } else {
            normalQueue.add(customer);
        }
    }

    // Method to handle calls
    public void handleCall() {

        if (!vipQueue.isEmpty()) {
            Customer customer = vipQueue.poll();
            System.out.println("Handling VIP customer: " + customer.name);
        }
        else if (!normalQueue.isEmpty()) {
            Customer customer = normalQueue.poll();
            System.out.println("Handling normal customer: " + customer.name);
        }
        else {
            System.out.println("No calls in queue.");
        }
    }

    // Display call count for all customers
    public void displayCallCount() {
        System.out.println("\nCustomer Call Records:");
        for (String name : callCount.keySet()) {
            System.out.println(name + " called " + callCount.get(name) + " times");
        }
    }
}