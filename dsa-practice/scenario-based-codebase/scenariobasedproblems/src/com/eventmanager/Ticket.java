package com.eventmanager;

public class Ticket {

    // Public method to sort ticket prices
    public static void quickSort(double[] prices) {
        quickSort(prices, 0, prices.length - 1);
    }

    // Recursive Quick Sort method
    private static void quickSort(double[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);

            // Sort left and right partitions
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    // Partition method
    private static int partition(double[] prices, int low, int high) {
        double pivot = prices[high]; // Last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] <= pivot) {
                i++;
                swap(prices, i, j);
            }
        }

        swap(prices, i + 1, high);
        return i + 1;
    }

    // Swap utility
    private static void swap(double[] prices, int i, int j) {
        double temp = prices[i];
        prices[i] = prices[j];
        prices[j] = temp;
    }
}