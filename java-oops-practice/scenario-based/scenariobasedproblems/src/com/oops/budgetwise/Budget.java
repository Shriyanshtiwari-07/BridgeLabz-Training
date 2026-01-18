package com.oops.budgetwise;

import java.util.*;

public class Budget {
    protected double income;
    protected Map<String, Double> categoryLimits;
    protected List<Transaction> transactions;

    public Budget(double income, Map<String, Double> categoryLimits) {
        this.income = income;
        this.categoryLimits = categoryLimits;
        this.transactions = new ArrayList<>();
    }

    // Encapsulation: expenses can only be added, not edited directly
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    protected double getTotalExpenses() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("EXPENSE")) {
                total += t.getAmount();
            }
        }
        return total;
    }

    // Operator usage: net savings
    public double calculateNetSavings() {
        return income - getTotalExpenses();
    }
}
