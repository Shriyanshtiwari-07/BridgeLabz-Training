package com.lambdaExpression.CustomSortinginECommerce;

import java.util.*;

public class EcommerceSorting {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop", 70000, 4.5, 10));
        products.add(new Product(2, "Phone", 40000, 4.8, 15));
        products.add(new Product(3, "Headphones", 3000, 4.2, 25));
        products.add(new Product(4, "Smartwatch", 12000, 4.0, 20));
        
        products.sort((p1, p2) ->
        Double.compare(p1.price, p2.price));

		System.out.println("Sorted by Price:");
		products.forEach(System.out::println);
		
        products.sort((p1, p2) ->
        Double.compare(p2.rating, p1.rating));

		System.out.println("\nSorted by Rating:");
		products.forEach(System.out::println);
		
        products.sort((p1, p2) ->
        Double.compare(p2.discount, p1.discount));

		System.out.println("\nSorted by Discount:");
		products.forEach(System.out::println);
		
    }
}
