package com.example.mocktest2;

import junit.framework.TestCase;

/**
 * Unit tests for savings goal calculations
 */
public class TestClass extends TestCase {

    private TestClass calculator;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        calculator = new TestClass();
    }

    @Override
    public void tearDown() throws Exception {
        calculator = null;
        super.tearDown();
    }

    /**
     * Tests the monthly savings goal calculation with specific inputs
     * Target: 5000
     * Starting Value: 0
     * Months: 10
     */
    public void testCalculateMonthlySavingsGoalWithZeroStartingValue() {
        // Arrange
        double targetGoal = 5000;
        double startingValue = 0;
        double months = 10;
        double expectedAmount = 32234.2;

        // Act
        double actualAmount = calculator.Calculate_Monthly_Savings_Goal(targetGoal, startingValue, months);

        // Assert
        assertEquals("Monthly savings calculation should match expected value", 
                    expectedAmount, actualAmount, 0.01);
    }
}