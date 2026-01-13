package com.oops.foodloop;


public abstract class FoodItem {
    private String name;
    private String category;
    private double price;
    private int stock;   // hidden stock level

    public FoodItem(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    protected boolean isAvailable() {
        return stock > 0;
    }

    protected void reduceStock() {
        if (stock > 0) stock--;
    }
}