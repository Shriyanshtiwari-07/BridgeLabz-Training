package com.exception.banktransactionsystem;
import java.util.Scanner;

public class BankTransaction {

	static int balance;
	
	public BankTransaction(int balance) {
		this.balance = balance;
	}
	
	void withdraw(double amount) throws InsufficientBalanceException {
		
		if(amount < 0) {
			throw new IllegalArgumentException("Invalid amount!");
		}
		
		if(amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance!");
		}
		
		balance -= amount;
		System.out.println("Withdrawal successful, new balance: X" + balance);
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		BankTransaction bank = new BankTransaction(4500);
		
		try {
			
			int amount;
			System.out.println("Enter withdraw amount: ");
			amount = input.nextInt();
			
			bank.withdraw(amount);
		}
		catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
