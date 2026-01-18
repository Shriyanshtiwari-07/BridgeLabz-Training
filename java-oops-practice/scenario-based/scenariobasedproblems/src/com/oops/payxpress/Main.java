package com.oops.payxpress;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Bill electricity = new ElectricityBill(1200, LocalDate.now().plusDays(5));
        Bill water = new WaterBill(450, LocalDate.now().plusDays(3));
        Bill internet = new InternetBill(999, LocalDate.now().plusDays(2));

        Bill[] bills = {electricity, water, internet};

        for (Bill bill : bills) {
            bill.sendReminder(); // polymorphism
            bill.showBillDetails();
            bill.pay();
            System.out.println("Total with late fee: " + bill.calculateLateFee(100));
            System.out.println();
        }
    }
}