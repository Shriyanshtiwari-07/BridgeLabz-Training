package com.generics.onlinemarketplace;

public class Main {
    public static void main(String[] args) {

        Product<BookCategory> book =
                new Product<>("Java Programming", 500.0, new BookCategory());

        Product<ClothingCategory> shirt =
                new Product<>("T-Shirt", 1200.0, new ClothingCategory());

        Product<GadgetCategory> phone =
                new Product<>("Smartphone", 25000.0, new GadgetCategory());

        ProductCatalog catalog = new ProductCatalog();

        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(shirt, 20);
        DiscountUtil.applyDiscount(phone, 5);

        System.out.println("Online Marketplace Products:");
        catalog.displayProducts();
    }
}