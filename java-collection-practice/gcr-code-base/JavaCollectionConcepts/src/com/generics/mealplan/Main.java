package com.generics.mealplan;

public class Main {
    public static void main(String[] args) {

        // Generate different meal plans
        Meal<VegeterianMeal> vegetarianMeal =
                MealPlanGenerator.generateMealPlan(new VegeterianMeal());

        Meal<VeganMeal> veganMeal =
                MealPlanGenerator.generateMealPlan(new VeganMeal());

        Meal<KetoMeal> ketoMeal =
                MealPlanGenerator.generateMealPlan(new KetoMeal());

        Meal<HighProteinMeal> highProteinMeal =
                MealPlanGenerator.generateMealPlan(new HighProteinMeal());

        System.out.println("\nPersonalized Meal Plans:");
        vegetarianMeal.displayMeal();
        veganMeal.displayMeal();
        ketoMeal.displayMeal();
        highProteinMeal.displayMeal();
    }
}