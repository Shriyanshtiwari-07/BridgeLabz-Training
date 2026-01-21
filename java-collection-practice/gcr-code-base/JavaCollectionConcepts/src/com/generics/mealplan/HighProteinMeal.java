package com.generics.mealplan;

public class HighProteinMeal implements MealPlan {

    @Override
    public String getName() {
        return "High-Protein Meal";
    }

    @Override
    public String getDescription() {
        return "Rich in protein to support muscle growth and recovery.";
    }

    @Override
    public String toString() {
        return getName() + " - " + getDescription();
    }
}