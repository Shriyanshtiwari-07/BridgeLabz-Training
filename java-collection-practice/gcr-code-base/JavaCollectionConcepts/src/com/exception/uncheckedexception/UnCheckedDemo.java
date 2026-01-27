package com.exception.uncheckedexception;
import java.io.*;
import java.util.*;

public class UnCheckedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		try {

			int a;
			System.out.println("Enter First Number: ");
			a = input.nextInt();
			
			int b;
			System.out.println("Enter Second Number: ");
			b = input.nextInt();
			
			System.out.println("Answer: " + (a/b));
		}
		catch(ArithmeticException e){
			System.out.println("Cannot divide by Zero..");
		}
		catch(InputMismatchException e) {
			System.out.println("Enter Numeric Value");
		}
		finally {
			input.close();
		}
	}

}