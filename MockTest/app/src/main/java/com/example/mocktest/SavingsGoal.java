package com.example.mocktest;

public class SavingsGoal {
    public Double Calculate_Monthly_Savings_Goal(double target_amount, double current_savings, double time_month) {
        return  (target_amount -  current_savings) / time_month;
    }
}
