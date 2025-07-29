package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(-1, calc.add(-2, 1));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calc.subtract(5, 3));
        assertEquals(0, calc.subtract(1, 1));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
        assertEquals(0, calc.multiply(0, 100));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calc.divide(4, 2), 0.001);
        assertEquals(-1.0, calc.divide(-2, 2), 0.001);
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(10, 0);
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}
