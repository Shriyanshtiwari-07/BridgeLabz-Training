package com.oops.budgetwise;


import java.util.*;

public class AnnualBudget extends Budget implements IAnalyzable {

    public AnnualBudget(double income, Map<String, Double> categoryLimits) {
        super(income, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("===== Annual Budget Report =====");
        System.out.println("Annual Income: " + income);
        System.out.println("Annual Expenses: " + getTotalExpenses());
        System.out.println("Annual Savings: " + calculateNetSavings());
    }

    @Override
    public void detectOverspend() {
        System.out.println("Checking annual overspending...");
        super.categoryLimits.forEach((category, limit) -> {
            double spent = transactions.stream()
                .filter(t -> t.getType().equalsIgnoreCase("EXPENSE") &&
                             t.getCategory().equals(category))
                .mapToDouble(Transaction::getAmount)
                .sum();

            if (spent > limit) {
                System.out.println("Annual overspend detected in: " + category);
            }
        });
    }
}