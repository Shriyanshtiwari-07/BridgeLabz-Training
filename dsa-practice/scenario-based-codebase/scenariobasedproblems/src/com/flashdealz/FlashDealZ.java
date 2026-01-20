package com.flashdealz;

public class FlashDealZ {

    static class Product {
        String name;
        int discount;

        Product(String name, int discount) {
            this.name = name;
            this.discount = discount;
        }
    }

    static int partition(Product[] arr, int low, int high) {
        int pivot = arr[high].discount;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].discount > pivot) {
                i++;
                Product temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Product temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void quickSort(Product[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product("Laptop", 30),
            new Product("Mobile", 50),
            new Product("Headphones", 40),
            new Product("Shoes", 60),
            new Product("Watch", 20)
        };

        quickSort(products, 0, products.length - 1);

        System.out.println("Top Discounted Products:");
        for (Product p : products) {
            System.out.println(p.name + " - " + p.discount + "%");
        }
    }
}