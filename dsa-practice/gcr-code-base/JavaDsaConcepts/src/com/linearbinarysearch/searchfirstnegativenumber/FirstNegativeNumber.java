package com.linearbinarysearch.searchfirstnegativenumber;
import java.util.Scanner;

public class FirstNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int index = findFirstNegative(arr);

	        if (index != -1) {
	            System.out.println("First negative number is at index: " + index);
	        } else {
	            System.out.println("No negative number found in the array.");
	        }
	    }

	    public static int findFirstNegative(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] < 0) {
	                return i; 
	            }
	        }
	        return -1;
	    }

}