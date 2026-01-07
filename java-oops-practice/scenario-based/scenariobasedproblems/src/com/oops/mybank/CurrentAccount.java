package com.oops.mybank;

public class CurrentAccount extends Account{
	public CurrentAccount(String accNum, double initial) {
        super(accNum, initial);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Overdraft limit reached!");
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current accounts do not earn interest.");
    }
}