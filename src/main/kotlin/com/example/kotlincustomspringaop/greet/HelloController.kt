package com.example.kotlincustomspringaop.greet

import com.example.kotlincustomspringaop.aspects.LogExecutionTime
import com.example.kotlincustomspringaop.aspects.SaveName
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
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

    @GetMapping("/hello/{name}")
    @LogExecutionTime
    @SaveName
    fun greetName(@PathVariable("name") name: String): String {
        return helloService.greetName(name)
    }

    @GetMapping("/dudes")
    @LogExecutionTime
    fun getDudes(): List<String> {
        return helloService.getDudes()
    }
}
