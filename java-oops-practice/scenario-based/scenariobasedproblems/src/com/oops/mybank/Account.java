package com.oops.mybank;

abstract class Account implements ITransaction {
    private String accountNumber;
    protected double balance; 
    
    public Account(String accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    public Account(String accountNumber) {
        this(accountNumber, 0.0);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Account: " + accountNumber + " | Current Balance: $" + balance);
    }

    public abstract void calculateInterest();
}