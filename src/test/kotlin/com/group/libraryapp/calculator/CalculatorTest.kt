package com.group.libraryapp.calculator

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CalculatorTest {

    @Test
    fun testAdd() {
        val calculator = Calculator(10)
        calculator.add(5)
        assertEquals(15, calculator.getNumber())
    }

    @Test
    fun testSubtract() {
        val calculator = Calculator(10)
        calculator.subtract(5)
        assertEquals(5, calculator.getNumber())
    }

    @Test
    fun testMultiply() {
        val calculator = Calculator(10)
        calculator.multiply(5)
        assertEquals(50, calculator.getNumber())
    }

    @Test
    fun testDivide() {
        val calculator = Calculator(10)
        calculator.divide(5)
        assertEquals(2, calculator.getNumber())
    }

    @Test
    fun testDivideByZero() {
        val calculator = Calculator(10)
        assertThrows(IllegalArgumentException::class.java) {
            calculator.divide(0)
        }
    }
}
