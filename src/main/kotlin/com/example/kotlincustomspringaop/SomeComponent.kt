package com.example.kotlincustomspringaop

import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class SomeComponent() {

    @PostConstruct
    @LogExecutionTime
    fun serve() {
        Thread.sleep(2000)
    }

}
