package com.example.week4_desgin_ui_unit_test;

import junit.framework.TestCase;

public class myCalcTest extends TestCase {
    myCalc tc;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        tc = new myCalc();
    }

    @Override
    public void tearDown() throws Exception {
        tc = null;
        super.tearDown();
    }

    public void testGetSalary() {
        double w = 456;
        double h = 5243;
        double act = tc.getSalary(w, h);
        double exp = 2390808.0;
        assertEquals("salary", exp, act);
    }
}
