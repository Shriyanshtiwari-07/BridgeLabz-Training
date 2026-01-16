package com.trafficmanager;

public class VehicleQueue {
    private String[] queue;
    private int front, rear, size, capacity;

    public VehicleQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue
    public void enqueue(String vehicleId) {
        if (size == capacity) {
            System.out.println("Queue Overflow! Cannot add " + vehicleId);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = vehicleId;
        size++;
    }

    // Dequeue
    public String dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow! No vehicles waiting.");
            return null;
        }
        String vehicle = queue[front];
        front = (front + 1) % capacity;
        size--;
        return vehicle;
    }

    // Print queue
    public void printQueue() {
        if (size == 0) {
            System.out.println("Waiting Queue is empty.");
            return;
        }

        System.out.print("Waiting Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}