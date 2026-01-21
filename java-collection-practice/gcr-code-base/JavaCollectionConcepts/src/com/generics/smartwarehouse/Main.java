package com.generics.smartwarehouse;

public class Main {
    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 10));
        electronicsStorage.addItem(new Electronics("Mobile Phone", 20));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice", 50));
        groceryStorage.addItem(new Groceries("Milk", 30));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 15));
        furnitureStorage.addItem(new Furniture("Table", 5));

        System.out.println("Electronics Items:");
        WareHouseUtils.displayItems(electronicsStorage.getItems());

        System.out.println("\nGrocery Items:");
        WareHouseUtils.displayItems(groceryStorage.getItems());

        System.out.println("\nFurniture Items:");
        WareHouseUtils.displayItems(furnitureStorage.getItems());
    }
}