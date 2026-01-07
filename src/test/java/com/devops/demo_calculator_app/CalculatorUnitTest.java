package com.devops.demo_calculator_app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorUnitTest {

    @Test
    void testAddition() {
        assertEquals(5, 2 + 3);
    }

    @Test
    void testSubtraction() {
        assertEquals(3, 5 - 2);
    }

    @Test
    void testMultiplication() {
        assertEquals(12, 4 * 3);
    }

    @Test
    void testDivision() {
        assertEquals(5, 10 / 2);
    }

    @Test
    void testDivisionByZero() {
        ArithmeticException ex = assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 0;
        });

        assertEquals("/ by zero", ex.getMessage());
    }
}
