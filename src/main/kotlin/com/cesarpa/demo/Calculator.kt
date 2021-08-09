package com.cesarpa.demo

class Calculator(val service: CalculatorService? = null) {
    fun perform(i: Int, j: Int) = service?.add(i, j)?.times(2)

}