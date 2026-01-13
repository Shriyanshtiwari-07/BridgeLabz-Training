package com.oops.foodloop;


public class Main {
    public static void main(String[] args) {

        FoodItem paneer = new VegItem("Paneer Butter Masala", 250, 5);
        FoodItem chicken = new NonVegItem("Chicken Biryani", 350, 5);
        FoodItem combo = new ComboMeal("Family Combo", 800);

        Order order = new DiscountOrder();
        order.addItem(paneer);
        order.addItem(chicken);
        order.addItem(combo);

        order.placeOrder();
    }
}