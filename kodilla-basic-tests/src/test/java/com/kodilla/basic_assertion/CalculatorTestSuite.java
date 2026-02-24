package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        // given
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        // when
        int sumResult = calculator.sum(a, b);
        // then
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        // given
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        // when
        int subResult = calculator.subtract(a, b);
        // then
        assertEquals(-3, subResult);
    }

    @Test
    public void testSquaredForPositiveNumber() {
        // given
        Calculator calculator = new Calculator();
        int a = 5;
        // when
        double squareResult = calculator.squared(a);
        // then
        assertEquals(25.0, squareResult, 0.001);
    }

    @Test
    public void testSquaredForZero() {
        // given
        Calculator calculator = new Calculator();
        int a = 0;
        // when
        double squareResult = calculator.squared(a);
        // then
        assertEquals(0.0, squareResult, 0.001);
    }

    @Test
    public void testSquaredForNegativeNumber() {
        // given
        Calculator calculator = new Calculator();
        int a = -4;
        // when
        double squareResult = calculator.squared(a);
        // then
        assertEquals(16.0, squareResult, 0.001);
    }
}