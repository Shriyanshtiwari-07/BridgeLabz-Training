package com.generics.mealplan;

public class KetoMeal implements MealPlan {

    @Override
    public String getName() {
        return "Keto Meal";
    }

    @Override
    public String getDescription() {
        return "High-fat, low-carb meal plan for ketogenic diet.";
    }

    @Override
    public String toString() {
        return getName() + " - " + getDescription();
    }
}
