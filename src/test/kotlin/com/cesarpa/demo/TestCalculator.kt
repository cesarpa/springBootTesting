package com.cesarpa.demo

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*


class TestCalculator {

    lateinit var calculator: Calculator
    var service = mock(CalculatorService::class.java)

    @Before
    fun init() {
        calculator = Calculator(service);
    }

    @Test
    fun testAdd() {
        `when`(service.add(2, 8)).thenReturn(10)
        Assert.assertEquals(20, calculator.perform(2, 8))
        verify(service).add(2,8)
    }

}