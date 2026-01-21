package com.generics.mealplan;

public class VegeterianMeal implements MealPlan {

    @Override
    public String getName() {
        return "Vegetarian Meal";
    }

    @Override
    public String getDescription() {
        return "Includes vegetables, grains, and dairy but no meat.";
    }

    @Override
    public String toString() {
        return getName() + " - " + getDescription();
    }
}