package com.example.springdocker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathCalcTest {

    @Test
    void add() {
        MyMathCalc m = new MyMathCalc();

        assertEquals(2, m.add(1,1));
    }

    @Test
    void multiply() {
        MyMathCalc m = new MyMathCalc();

        assertEquals(2, m.multiply(1,2));
    }

    @Test
    void divide() {
        MyMathCalc m = new MyMathCalc();

        assertEquals(5, m.divide(10,2));
    }

    @Test
    void divideWithZero() {
        MyMathCalc m = new MyMathCalc();

        assertThrows(ArithmeticException.class, () -> m.divide(10, 0));
    }
}