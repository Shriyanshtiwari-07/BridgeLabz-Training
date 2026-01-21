package com.generics.smartwarehouse;

public abstract class WareHouseItem {
    private String name;
    private int quantity;

    public WareHouseItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract String getCategory();

    @Override
    public String toString() {
        return getCategory() + " [Name=" + name + ", Quantity=" + quantity + "]";
    }
}