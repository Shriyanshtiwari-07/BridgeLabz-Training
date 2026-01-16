package com.zipzipmart;

import java.time.LocalDate;

public class ZipZipMart {

    // Merge Sort wrapper
    public static void mergeSort(Transaction[] arr) {
        if (arr == null || arr.length < 2) return;
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(Transaction[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(Transaction[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Transaction[] L = new Transaction[n1];
        Transaction[] R = new Transaction[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (compare(L[i], R[j]) <= 0) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // Comparison: first by date, then by amount
    private static int compare(Transaction t1, Transaction t2) {
        int dateCompare = t1.date.compareTo(t2.date);
        if (dateCompare != 0) return dateCompare;
        return Double.compare(t1.amount, t2.amount);
    }

    public static void main(String[] args) {
        Transaction[] records = {
            new Transaction(LocalDate.of(2026, 1, 12), 250.0, "Branch A"),
            new Transaction(LocalDate.of(2026, 1, 11), 300.0, "Branch B"),
            new Transaction(LocalDate.of(2026, 1, 12), 200.0, "Branch C"),
            new Transaction(LocalDate.of(2026, 1, 10), 150.0, "Branch A"),
        };

        System.out.println("Before Sorting:");
        for (Transaction t : records) t.display();

        mergeSort(records);

        System.out.println("\nAfter Sorting by Date, then Amount:");
        for (Transaction t : records) t.display();
    }
}