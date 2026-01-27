package com.exception.nestedtrycatch;
import java.util.Scanner;

public class NestedTryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		try {
			
			int[] arr = {2, 5, 7, 9, 1};
			int idx, divisor;
			
			System.out.println("Enter Index: " );
			idx = input.nextInt();
			
			System.out.println("Enter Divisor: " );
			divisor = input.nextInt();
			
			System.out.println("Answer: " + (arr[idx] / divisor));
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid array index!");
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero!");
		}
	}

}