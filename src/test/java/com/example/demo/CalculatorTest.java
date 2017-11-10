package com.example.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class CalculatorTest {
    private Calculator calcuator = new Calculator();

    @Test
    public void testSum() {
        assertEquals(5, calcuator.sum(2, 3));
        assertEquals(8, calcuator.sum(4, 4));
    }
    
    @Test
    public void testDiv() {
        assertEquals(2, calcuator.sum(2, 2));
        assertEquals(4, calcuator.sum(8, 2));
    }

}