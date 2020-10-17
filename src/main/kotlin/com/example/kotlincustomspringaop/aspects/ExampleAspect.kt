package com.example.kotlincustomspringaop.aspects

import com.example.kotlincustomspringaop.dudes.Dude
import com.example.kotlincustomspringaop.dudes.DudeRepository
import org.aspectj.lang.JoinPoint
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.AfterReturning
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.springframework.stereotype.Component

@Aspect
@Component
class ExampleAspect(private val dudeRepo: DudeRepository) {

    @Around("@annotation(LogExecutionTime)")
    fun logExcecutionTime(joinPoint: ProceedingJoinPoint): Any {
        val start = System.currentTimeMillis()
        val args = joinPoint.args

        val proceed = joinPoint.proceed()

        val executionTime = System.currentTimeMillis() - start

        println(
            joinPoint.signature.name
            + " executed in "
            + executionTime
            + "ms with args "
            + args.map { it.toString() }.toList()
        )
        return proceed
    }

    @AfterReturning(pointcut = "@annotation(SaveName)", returning = "returning")
    fun saveName(joinPoint: JoinPoint) {
        val name = joinPoint.args[0] as String
        val dude = Dude(name = name)
        dudeRepo.save(dude)
        println(joinPoint.signature.name + " returned with name " + name)
    }


}
