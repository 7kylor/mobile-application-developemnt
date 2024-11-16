package com.example.mocktest;

import junit.framework.TestCase;

public class helperTest extends TestCase {
    helper tc;

    public void setUp() throws Exception {
        super.setUp();
        tc = new helper();
    }

    public void tearDown() throws Exception {
        tc = null;
    }

    public void testCalculate_Monthly_Savings_Goal() {
        double tg = 4 , sv = 2 , tm = 1;
        double act = tc.Calculate_Monthly_Savings_Goal(tg,sv,tm);
        double exp = 2.0;
        assertEquals("Result",exp, act);
    }
}