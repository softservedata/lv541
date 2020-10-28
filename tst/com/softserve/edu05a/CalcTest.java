package com.softserve.edu05a;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest {
    private static Calc calc = null;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass all methods");
        calc = new Calc();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("@AfterClass all methods");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("\t@Before each methods");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("\t@After each methods");
    }

    @Test
    public void testAdd() {
        System.out.println("\t\t@Test testAdd()");
        //Calc calc = new Calc();
        double expected;
        double actual;
        //
        expected = 8;
        actual = calc.add(4, 4);
        Assert.assertEquals(expected, actual, 0.0001);
        // fail("Not yet implemented");
    }

    @Test
    public void testAdd2() {
        System.out.println("\t\t@Test testAdd()");
        //Calc calc = new Calc();
        double expected;
        double actual;
        //
        expected = 9;
        actual = calc.add(5, 4);
        Assert.assertEquals(expected, actual, 0.0001);
        // fail("Not yet implemented");
    }

    @Test
    public void testDiv() {
        System.out.println("\t\t@Test testDiv()");
        //Calc calc = new Calc();
        double expected;
        double actual;
        //
        expected = 5;
        actual = calc.div(20, 4);
        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testDiv2() {
        System.out.println("\t\t@Test testDiv()");
        //Calc calc = new Calc();
        double expected;
        double actual;
        //
        expected = 2.5;
        actual = calc.div(20, 8);
        Assert.assertEquals(expected, actual, 0.0001);
    }
}
