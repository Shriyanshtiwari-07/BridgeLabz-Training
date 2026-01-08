package com.sortingalgorithm.mergesort;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] prices = {499.99, 299.50, 799.00, 199.99, 599.75};

		mergeSort(prices, 0, prices.length - 1);

		System.out.print("Sorted Book Prices in Ascending Order: ");
		for (double price : prices) {
			System.out.print(price + " ");
		}
	}
	
	// merge sort function
	public static void mergeSort(double[] arr, int left, int right) {
        if (left < right) {

            int mid = (left + right) / 2;

            // Sort left half
            mergeSort(arr, left, mid);

            // Sort right half
            mergeSort(arr, mid + 1, right);

            // Merge both halves
            merge(arr, left, mid, right);
        }
    }
	
	// merge function
    public static void merge(double[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        double[] L = new double[n1];
        double[] R = new double[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge the temp arrays
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


}
