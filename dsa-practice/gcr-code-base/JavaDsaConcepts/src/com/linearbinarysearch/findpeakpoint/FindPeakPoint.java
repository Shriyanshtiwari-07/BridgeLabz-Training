package com.linearbinarysearch.findpeakpoint;
import java.util.Scanner;

public class FindPeakPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of elements in the array: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int peakIndex = findPeakElement(arr);

	        System.out.println("Index of a peak element: " + peakIndex);
	        System.out.println("Peak element: " + arr[peakIndex]);
	}
	
	 public static int findPeakElement(int[] arr) {
	        int left = 0;
	        int right = arr.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            boolean leftOK = (mid == 0) || (arr[mid] > arr[mid - 1]);
	            boolean rightOK = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);

	            if (leftOK && rightOK) {
	                // mid is a peak element
	                return mid;
	            } else if (!leftOK) {
	                // Peak is in the left half
	                right = mid - 1;
	            } else {
	                // Peak is in the right half
	                left = mid + 1;
	            }
	        }

	        return -1; 
	    }
}