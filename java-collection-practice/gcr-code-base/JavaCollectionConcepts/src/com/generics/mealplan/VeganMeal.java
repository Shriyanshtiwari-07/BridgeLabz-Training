package com.generics.mealplan;

public class VeganMeal implements MealPlan {

    @Override
    public String getName() {
        return "Vegan Meal";
    }

    @Override
    public String getDescription() {
        return "Plant-based meals with no animal products.";
    }

    @Override
    public String toString() {
        return getName() + " - " + getDescription();
    }
}