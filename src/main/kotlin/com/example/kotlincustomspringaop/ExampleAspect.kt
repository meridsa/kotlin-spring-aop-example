package com.example.kotlincustomspringaop

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.springframework.stereotype.Component

@Aspect
@Component
class ExampleAspect {

    @Around("@annotation(LogExecutionTime)")
    fun logExcecutionTime(joinPoint: ProceedingJoinPoint): Any {
        val start = System.currentTimeMillis()

        val proceed = joinPoint.proceed()

        val executionTime = System.currentTimeMillis() - start

        System.out.println(joinPoint.signature.name + " executed in " + executionTime + "ms")
        return proceed
    }


}
