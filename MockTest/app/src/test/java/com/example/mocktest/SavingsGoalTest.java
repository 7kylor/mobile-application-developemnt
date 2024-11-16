package com.example.mocktest;

import junit.framework.TestCase;

public class SavingsGoalTest extends TestCase {
    SavingsGoal tc ;
    public void setUp() throws Exception {
        tc = new SavingsGoal();
        super.setUp();
    }

    public void tearDown() throws Exception {
        tc = null;
    }

    public void testCalculate_Monthly_Savings_Goal() {
        double  target_amount = 4 ,  current_savings =2 ,  time_month =1 , expect_result = 2.0;
        double actual_result = tc.Calculate_Monthly_Savings_Goal(target_amount,current_savings,time_month);
        assertEquals("res" , expect_result, actual_result);
    }
}