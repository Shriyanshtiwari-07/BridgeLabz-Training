package com.examcell;

public class ExamCell {

    public static void main(String[] args) {

        // Scores collected from multiple centers (already merged into one array)
        int[] studentScores = {
            450, 380, 500, 420, 390, 480, 410
        };

        // Generate rank list
        StudentScoreMergeSort.mergeSort(studentScores);

        // Display state-level rank list
        System.out.println("State-Level Rank List:");
        for (int i = 0; i < studentScores.length; i++) {
            System.out.println("Rank " + (i + 1) + ": " + studentScores[i]);
        }
    }
}