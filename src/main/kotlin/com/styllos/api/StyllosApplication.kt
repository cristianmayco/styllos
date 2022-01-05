package com.styllos.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StyllosApplication

fun main(args: Array<String>) {
    runApplication<StyllosApplication>(*args)
}
