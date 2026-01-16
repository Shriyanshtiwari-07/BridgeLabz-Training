package com.zipzipmart;

import java.time.LocalDate;

public class Transaction {
    LocalDate date;
    double amount;
    String branch;

    public Transaction(LocalDate date, double amount, String branch) {
        this.date = date;
        this.amount = amount;
        this.branch = branch;
    }

    public void display() {
        System.out.println("Date: " + date + ", Amount: $" + amount + ", Branch: " + branch);
    }
}