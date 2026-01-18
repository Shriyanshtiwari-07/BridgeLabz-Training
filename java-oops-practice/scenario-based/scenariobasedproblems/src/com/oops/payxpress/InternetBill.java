package com.oops.payxpress;

import java.time.LocalDate;

public class InternetBill extends Bill {

    public InternetBill(double amount, LocalDate dueDate) {
        super("Internet", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        if (!isPaid()) {
            System.out.println("🌐 Internet Bill Reminder: Avoid service suspension.");
        }
    }
}