package com.cesarpa.demo

import org.junit.Assert
import org.junit.Before
import org.junit.Test


class TestCalculator {

    lateinit var c : Calculator

    @Before
    fun init(){
        c = Calculator();
    }

    @Test
    fun testAdd() {
        Assert.assertEquals(11, c.add(2, 8))
    }

}