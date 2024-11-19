package com.example.mocktest2;

public class Test {
    public double calculateMonthlySavingsGoal(double targetAmount, double currentSavings, double months) {
        if (months <= 0) {
            throw new IllegalArgumentException("Months must be greater than 0");
        }
        if (targetAmount <= currentSavings) {
            throw new IllegalArgumentException("Target amount must be greater than current savings");
        }
        return (targetAmount - currentSavings) / months;
    }
}
