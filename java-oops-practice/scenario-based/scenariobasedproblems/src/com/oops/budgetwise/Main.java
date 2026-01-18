package com.oops.budgetwise;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Double> limits = new HashMap<>();
        limits.put("Food", 500.0);
        limits.put("Transport", 300.0);

        IAnalyzable budget = new MonthlyBudget(3000, limits);

        ((MonthlyBudget) budget).addTransaction(
            new Transaction(200, "EXPENSE", LocalDate.now(), "Food"));
        ((MonthlyBudget) budget).addTransaction(
            new Transaction(400, "EXPENSE", LocalDate.now(), "Food"));

        budget.generateReport();
        budget.detectOverspend();
    }
}