package com.cesarpa.demo

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    val c = Calculator();
    print(c.perform(2, 8))
}
