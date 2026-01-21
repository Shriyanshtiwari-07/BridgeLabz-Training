package com.generics.smartwarehouse;

public class Groceries extends WareHouseItem {
    public Groceries(String name, int quantity) {
        super(name, quantity);
    }

    @Override
    public String getCategory() {
        return "Groceries";
    }
}