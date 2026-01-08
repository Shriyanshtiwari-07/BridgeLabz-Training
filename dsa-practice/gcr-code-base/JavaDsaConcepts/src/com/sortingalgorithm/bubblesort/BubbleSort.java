package com.sortingalgorithm.bubblesort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {78, 45, 90, 62, 55};

		for (int i = 0; i < marks.length - 1; i++) {
			for (int j = 0; j < marks.length - 1 - i; j++) {
				if (marks[j] > marks[j + 1]) {
					// swap
					int temp = marks[j];
					marks[j] = marks[j + 1];
					marks[j + 1] = temp;
				}
			}
		}
		
		System.out.print("Sorted Student Marks in Ascending Order: ");
		for (int mark : marks) {
			System.out.print(mark + " ");
		}
	}

}