package com.oops.foodloop;


public class DiscountOrder extends Order {

    @Override
    protected double applyDiscount(double total) {
        if (total >= 1000) {
            return total * 0.20;
        } else if (total >= 500) {
            return total * 0.10;
        }
        return 0;
    }
}