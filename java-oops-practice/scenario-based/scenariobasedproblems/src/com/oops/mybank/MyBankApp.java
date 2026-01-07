package com.oops.mybank;
import java.util.*;

public class MyBankApp {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to MyBank!");
        System.out.print("Set up your Savings Account Number: ");
        String accNo = sc.next();
        
        Account userAccount = new SavingsAccount(accNo, 1000.0); 

        boolean active = true;
        while (active) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Calculate Interest\n5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter amount: ");
                    userAccount.deposit(sc.nextDouble());
                }
                case 2 -> {
                    System.out.print("Enter amount: ");
                    userAccount.withdraw(sc.nextDouble());
                }
                case 3 -> userAccount.checkBalance();
                case 4 -> userAccount.calculateInterest();
                case 5 -> active = false;
                default -> System.out.println("Invalid choice.");
            }
        }
        System.out.println("Thank you for banking with MyBank!");
        sc.close();
    }
}