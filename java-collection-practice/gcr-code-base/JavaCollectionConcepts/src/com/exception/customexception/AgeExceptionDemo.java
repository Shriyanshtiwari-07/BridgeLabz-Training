package com.exception.customexception;
import java.util.*;

public class AgeExceptionDemo {

	static void validateAge(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("Age must be Greater than or equal to 18");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		try {
			int age;
			System.out.println("Enter Age: ");
			age = input.nextInt();
			
			validateAge(age);
			System.out.println("Age is Valid");
		}
		catch(InvalidAgeException e) {
			System.out.println("Age must be Greater than or equal to 18");
		}
		finally {
			input.close();
		}
	}

}
