package com.oops.foodloop;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrderable {

    protected List<FoodItem> items = new ArrayList<>();

    public void addItem(FoodItem item) {
        if (item.isAvailable()) {
            items.add(item);
            item.reduceStock();
        }
    }

    // Operator logic: sum of prices
    public double calculateTotal() {
        double total = 0;
        for (FoodItem item : items) {
            total += item.getPrice();
        }
        return total - applyDiscount(total);
    }

    // Polymorphic method
    protected double applyDiscount(double total) {
        return 0; // default: no discount
    }

    @Override
    public void placeOrder() {
        System.out.println("Order placed. Total: ₹" + calculateTotal());
    }

    @Override
    public void cancelOrder() {
        items.clear();
        System.out.println("Order cancelled.");
    }
}