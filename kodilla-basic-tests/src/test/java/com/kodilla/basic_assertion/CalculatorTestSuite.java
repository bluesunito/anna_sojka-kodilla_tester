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
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int subResult = calculator.subtract(a, b);

        assertEquals(-3, subResult);
    }

    @Test
    public void testSquaredForPositiveNumber() {
        Calculator calculator = new Calculator();
        int a = 5;

        double squareResult = calculator.squared(a);

        assertEquals(25.0, squareResult, 0.001);
    }

    @Test
    public void testSquaredForZero() {
        Calculator calculator = new Calculator();
        int a = 0;

        double squareResult = calculator.squared(a);

        assertEquals(0.0, squareResult, 0.001);
    }

    @Test
    public void testSquaredForNegativeNumber() {
        Calculator calculator = new Calculator();
        int a = -4;

        double squareResult = calculator.squared(a);

        assertEquals(16.0, squareResult, 0.001);
    }
}