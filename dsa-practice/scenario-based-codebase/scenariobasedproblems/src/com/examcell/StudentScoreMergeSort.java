package com.examcell;

public class StudentScoreMergeSort {

    // Public method to start merge sort
    public static void mergeSort(int[] scores) {
        if (scores.length < 2)
            return;

        int mid = scores.length / 2;

        int[] left = new int[mid];
        int[] right = new int[scores.length - mid];

        // Copy data into subarrays
        for (int i = 0; i < mid; i++)
            left[i] = scores[i];

        for (int i = mid; i < scores.length; i++)
            right[i - mid] = scores[i];

        // Recursive sorting
        mergeSort(left);
        mergeSort(right);

        // Merge sorted halves
        merge(scores, left, right);
    }

    // Merge two sorted arrays
    private static void merge(int[] scores, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] >= right[j]) {  // Descending order for ranks
                scores[k++] = left[i++];
            } else {
                scores[k++] = right[j++];
            }
        }

        while (i < left.length)
            scores[k++] = left[i++];

        while (j < right.length)
            scores[k++] = right[j++];
    }
}
