package com.example.kotlincustomspringaop

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(
        private val helloService: HelloService
) {
    @GetMapping("/hello")
    @LogExecutionTime
    fun test(): String {
        return helloService.getMessage()
    }
}
