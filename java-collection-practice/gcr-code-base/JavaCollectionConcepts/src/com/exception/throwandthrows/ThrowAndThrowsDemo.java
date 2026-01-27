package com.exception.throwandthrows;
import java.util.Scanner;

public class ThrowAndThrowsDemo {

	static void calculateInterest(double amount, double rate, double years) throws IllegalArgumentException {
		if(amount < 0 || rate < 0) {
			throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		try {
			double amount, rate, years;
			System.out.println("Enter Amount: ");
			amount = input.nextDouble();
			
			System.out.println("Enter Rate: ");
			rate = input.nextDouble();
			
			System.out.println("Enter Years: ");
			years = input.nextDouble();
		
			calculateInterest(amount, rate, years);
			System.out.println((amount * rate * years) / 100);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Invalid input: Amount and rate must be positive");
		}
	}

}
