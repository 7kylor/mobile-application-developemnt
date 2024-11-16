package com.example.utest;

import junit.framework.TestCase;

public class TestClassTest extends TestCase {


    //init
    TestClass TC;
    public void setUp() throws Exception {
        super.setUp();
        TC = new TestClass();

    }

    public void tearDown() throws Exception {
    }

    public void testGetCompare() {
        int a=93, b=99;
        boolean comp=TC.getCompare(a,b);
        boolean exp = true;
        assertEquals("Test the comparing method", comp, exp);
    }

    public void testGetSum() {
        int a=21,b=21;
        int act=TC.getSum(a,b);
        int exp= 42;
        assertEquals("Test the sum method", act, exp);
    }
}
