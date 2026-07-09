package com.dn5;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setting up before test...");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Cleaning up after test...");
    }

    @Test
    public void testAssertions() {
        assertEquals(5, calculator.add(2, 3));
        assertTrue(calculator.add(2, 3) > 0);
        assertFalse(calculator.add(2, 3) < 0);
        assertNotNull(calculator);
    }

    @Test
    public void testAddition_usingAAAPattern() {
        int a = 10;
        int b = 5;

        int result = calculator.add(a, b);

        assertEquals(15, result);
    }

    @Test
    public void testSubtraction_usingAAAPattern() {
        int a = 10;
        int b = 5;

        int result = calculator.subtract(a, b);

        assertEquals(5, result);
    }

    @Test
    public void testDivideByZero_throwsException() {
        int a = 10;
        int b = 0;

        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(a, b);
        });
    }
}