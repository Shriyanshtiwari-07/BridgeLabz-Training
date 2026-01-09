package com.linearbinarysearch.findfirstlastoccurrence;
import java.util.Scanner;

public class FindFirstAndLastOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of elements in the sorted array: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter array elements in sorted order:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.print("Enter target element: ");
	        int target = sc.nextInt();

	        int first = findFirstOccurrence(arr, target);
	        int last = findLastOccurrence(arr, target);

	        System.out.println("First occurrence: " + first);
	        System.out.println("Last occurrence: " + last);
	    }

	    public static int findFirstOccurrence(int[] arr, int target) {
	        int left = 0, right = arr.length - 1;
	        int result = -1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] == target) {
	                result = mid;
	                right = mid - 1; // search in left half
	            } else if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return result;
	    }

	    public static int findLastOccurrence(int[] arr, int target) {
	        int left = 0, right = arr.length - 1;
	        int result = -1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] == target) {
	                result = mid;
	                left = mid + 1; // search in right half
	            } else if (arr[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return result;
	    }
}