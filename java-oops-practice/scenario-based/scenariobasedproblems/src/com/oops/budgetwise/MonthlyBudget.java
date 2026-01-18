package com.oops.budgetwise;

import java.util.*;

public class MonthlyBudget extends Budget implements IAnalyzable {

    public MonthlyBudget(double income, Map<String, Double> categoryLimits) {
        super(income, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("----- Monthly Budget Report -----");
        System.out.println("Income: " + income);
        System.out.println("Total Expenses: " + getTotalExpenses());
        System.out.println("Net Savings: " + calculateNetSavings());
    }

    @Override
    public void detectOverspend() {
        Map<String, Double> spentByCategory = new HashMap<>();

        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("EXPENSE")) {
                spentByCategory.put(
                    t.getCategory(),
                    spentByCategory.getOrDefault(t.getCategory(), 0.0) + t.getAmount()
                );
            }
        }

        for (String category : categoryLimits.keySet()) {
            if (spentByCategory.getOrDefault(category, 0.0) > categoryLimits.get(category)) {
                System.out.println("Overspent in category: " + category);
            }
        }
    }
}