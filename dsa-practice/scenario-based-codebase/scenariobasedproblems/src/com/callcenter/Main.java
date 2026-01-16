package com.callcenter;

public class Main {

    public static void main(String[] args) {

        CallCenter callCenter = new CallCenter();

        Customer c1 = new Customer("Rahul", false);
        Customer c2 = new Customer("Anita", true);
        Customer c3 = new Customer("Suresh", false);
        Customer c4 = new Customer("Priya", true);

        callCenter.receiveCall(c1);
        callCenter.receiveCall(c2);
        callCenter.receiveCall(c3);
        callCenter.receiveCall(c4);
        callCenter.receiveCall(c2); // Anita calls again

        callCenter.handleCall();
        callCenter.handleCall();
        callCenter.handleCall();
        callCenter.handleCall();

        callCenter.displayCallCount();
    }
}