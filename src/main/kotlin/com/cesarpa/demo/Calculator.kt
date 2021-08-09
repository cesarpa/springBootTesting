package com.cesarpa.demo

abstract class Calculator {

    abstract val service : CalculatorService

    fun add(i: Int, j: Int) = service.add(i ,j)

}