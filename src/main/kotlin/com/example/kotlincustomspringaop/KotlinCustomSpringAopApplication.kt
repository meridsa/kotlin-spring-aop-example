package com.example.kotlincustomspringaop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.EnableAspectJAutoProxy

@SpringBootApplication
@EnableAspectJAutoProxy
class KotlinCustomSpringAopApplication

fun main(args: Array<String>) {
	runApplication<KotlinCustomSpringAopApplication>(*args)
}
