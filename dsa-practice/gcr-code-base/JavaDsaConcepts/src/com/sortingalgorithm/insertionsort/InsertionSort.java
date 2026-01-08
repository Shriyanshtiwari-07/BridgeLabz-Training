package com.sortingalgorithm.insertionsort;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] empIds = {104, 101, 109, 102, 105};
		 
		for (int i = 1; i < empIds.length; i++) {

			int key = empIds[i];   // element to be inserted
			int j = i - 1;

			// Move elements of sorted part that are greater than key
			while (j >= 0 && empIds[j] > key) {
				empIds[j + 1] = empIds[j];
				j--;
			}

			// Insert key at correct position
			empIds[j + 1] = key;
		}
	        
		System.out.print("Sorted Employee IDs in Ascending Order: ");
		for (int id : empIds) {
			System.out.print(id + " ");
		}
	}

}