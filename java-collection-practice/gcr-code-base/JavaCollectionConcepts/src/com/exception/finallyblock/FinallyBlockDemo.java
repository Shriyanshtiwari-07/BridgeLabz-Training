package com.exception.finallyblock;
import java.util.*;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		try {
			
			int first;
			System.out.println("Enter First Number: ");
			first = input.nextInt();
			
			int second;
			System.out.println("Enter Second Number: ");
			second = input.nextInt();
			
			System.out.println("Answer: " + (first / second));
		}
		catch(ArithmeticException e){
			System.out.println("Cannot Divide by Zero...");
		}
		finally {
			System.out.println("Operation Completed....");
		}
		
	}

}