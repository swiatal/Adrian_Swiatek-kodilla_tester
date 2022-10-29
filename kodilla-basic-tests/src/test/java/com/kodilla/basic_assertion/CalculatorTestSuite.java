package com.kodilla.basic_assertion;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testPowerpos() {
        Calculator calculator = new Calculator();
        double a = 2;
        double b = 3;
        double sumPower = calculator.power(a, b);
        assertEquals(8, sumPower, 0.01);
    }

    @Test
    public void testPower0() {
        Calculator calculator = new Calculator();
        double a = 0;
        double b = 3;
        double sumPower = calculator.power(a, b);
        assertEquals(0, sumPower, 0.01);
    }
    @Test
    public void testPowerneg() {
        Calculator calculator = new Calculator();
        double a = -2;
        double b = 4;
        double sumPower = calculator.power(a, b);
        assertEquals(16, sumPower, 0.01);
    }
    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator.subtract(a, b);
        assertEquals(-3, subResult);
    }
}
