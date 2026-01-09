package com.linearbinarysearch.concatenatestrings;
import java.util.Scanner;

public class ConcatenateStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }

        String result = concatenateStrings(arr);

        System.out.println("Concatenated string: " + result);
	}
	
	public static String concatenateStrings(String[] arr) {

        StringBuffer sb = new StringBuffer();

        for (String s : arr) {
            sb.append(s); // Efficiently append strings
        }

        return sb.toString(); // Convert StringBuffer back to String
    }

}
