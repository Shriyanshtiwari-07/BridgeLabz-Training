package com.oops.payxpress;

import java.time.LocalDate;

public abstract class Bill implements IPayable {

    protected String type;
    protected double amount;
    protected LocalDate dueDate;

    private boolean isPaid; // encapsulated

    // Constructor for recurring bills
    public Bill(String type, double amount, LocalDate dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    // Prevent direct payment status change
    protected void markAsPaid() {
        this.isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }

    // Late fee calculation (baseAmount + penalty)
    public double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    // Payment details internal only
    void showBillDetails() {
        System.out.println(type + " Bill | Amount: " + amount + " | Due: " + dueDate);
    }

    @Override
    public void pay() {
        if (!isPaid) {
            markAsPaid();
            System.out.println(type + " bill paid successfully.");
        } else {
            System.out.println(type + " bill is already paid.");
        }
    }
}