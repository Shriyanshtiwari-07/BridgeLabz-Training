package com.sortingalgorithm.quicksort;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sort product price
		double[] prices = {899.99, 299.50, 499.00, 199.99, 699.75};

		quickSort(prices, 0, prices.length - 1);

        System.out.print("Sorted Product Prices Ascending Order: ");
        for (double price : prices) {
            System.out.print(price + " ");
        }
	}
	
	// quick sort function
    public static void quickSort(double[] arr, int low, int high) {
        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            // recursively sort 
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // partition method 
    public static int partition(double[] arr, int low, int high) {

        double pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swapping
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot at correct position
        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

}
