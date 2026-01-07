package com.oops.mybank;

public class SavingsAccount extends Account{
	private double interestRate = 4.5; 

    public SavingsAccount(String accNum, double initial) {
        super(accNum, initial);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds in Savings!");
        }
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: $" + interest);
    }
}