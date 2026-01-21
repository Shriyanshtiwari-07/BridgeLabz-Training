package com.generics.smartwarehouse;

public class Furniture extends WareHouseItem {
    public Furniture(String name, int quantity) {
        super(name, quantity);
    }

    @Override
    public String getCategory() {
        return "Furniture";
    }
}