package com.inheritance;

class BankAccount{
	long accountNumber;
	double balance;
	BankAccount(long accountNumber,double balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	public void displayDetails(){
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: "+balance);
	}
}

class SavingsAccount extends BankAccount{
	double interestRate;
	SavingsAccount(long accountNumber,double balance,double interestRate){
		super(accountNumber,balance);
		this.interestRate=interestRate;
	}
	public void displayAccountType(){
		System.out.println("Account Type: Savings Account");
	}
}

class CheckingAccount extends BankAccount{
	double withdrawalLimit;
	CheckingAccount(long accountNumber,double balance,double withdrawalLimit){
		super(accountNumber,balance);
		this.withdrawalLimit=withdrawalLimit;
	}
	public void displayAccountType(){
		System.out.println("Account Type: Checking Account");
	}
}

class FixedDepositAccount extends BankAccount{
	int lockInPeriod;
	FixedDepositAccount(long accountNumber,double balance,int lockInPeriod){
		super(accountNumber,balance);
		this.lockInPeriod=lockInPeriod;
	}
	public void displayAccountType(){
		System.out.println("Account Type: Fixed Deposit Account");
	}
}

public class BankingSystem{
	public static void main(String[] args){
		SavingsAccount savings=new SavingsAccount(1002003001L,50000,4.5);
		CheckingAccount checking=new CheckingAccount(1002003002L,30000,20000);
		FixedDepositAccount fixed=new FixedDepositAccount(1002003003L,100000,3);
		savings.displayAccountType();
		savings.displayDetails();
		System.out.println();
		checking.displayAccountType();
		checking.displayDetails();
		System.out.println();
		fixed.displayAccountType();
		fixed.displayDetails();
	}
}

