package com.generics.mealplan;

public class MealPlanGenerator {

    // Generic method to validate and generate a meal plan
    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealPlan) {
        // Simple validation: ensure mealPlan is not null
        if (mealPlan == null) {
            throw new IllegalArgumentException("Invalid meal plan selected!");
        }
        System.out.println("Generating personalized meal plan: " + mealPlan.getName());
        return new Meal<>(mealPlan);
    }
}
