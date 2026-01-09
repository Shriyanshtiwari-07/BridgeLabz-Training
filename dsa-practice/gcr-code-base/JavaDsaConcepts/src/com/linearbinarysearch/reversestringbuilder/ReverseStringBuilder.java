package com.linearbinarysearch.reversestringbuilder;
import java.util.Scanner;

public class ReverseStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a string: ");
		 String input = sc.nextLine();

		 // Create StringBuilder
		 StringBuilder sb = new StringBuilder(input);

		 // Reverse the string
		 sb.reverse();

		 // Convert back to string
		 String reversed = sb.toString();

		 System.out.println("Reversed string: " + reversed);
	}

}