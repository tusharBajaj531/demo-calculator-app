package com.devops.demo_calculator_app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorUnitTest {

    @Test
    void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result);
    }

    @Test
    void testSubtraction() {
        int result = 5 - 2;
        assertEquals(3, result);
    }

    @Test
    void testMultiplication() {
        int result = 4 * 3;
        assertEquals(12, result);
    }

    @Test
    void testDivision() {
        int result = 10 / 2;
        assertEquals(5, result);
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 0;
        });
    assertEquals("/ by zero", ex.getMessage());
    }
}