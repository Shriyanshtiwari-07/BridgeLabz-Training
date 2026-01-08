package com.sortingalgorithm.heapsort;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] salaries = {45000, 30000, 60000, 35000, 50000};

        heapSort(salaries);

        System.out.print("Sorted Salary Demands in Ascending Order: ");
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }
	}
	
	// Heap Sort method
    public static void heapSort(int[] arr) {
        int n = arr.length;

        //1-> Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // 2-> Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {

            // Move current root (largest) to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // reheapify reduced heap
            heapify(arr, i, 0);
        }
    }

    // heapify subtree rooted at index i
    public static void heapify(int[] arr, int n, int i) {

        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check left child
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Check right child
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // recursively heapify affected subtree
            heapify(arr, n, largest);
        }
    }

}
