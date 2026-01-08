package com.sortingalgorithm.selectionsort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// sort exam scores
		int[] scores = {72, 88, 65, 90, 79};

        for (int i = 0; i < scores.length - 1; i++) {
        	int minIndex = i;

            // Find minimum element in unsorted part
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap with first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }

        System.out.print("Sorted Exam Scores in Ascending Order: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
	}

}