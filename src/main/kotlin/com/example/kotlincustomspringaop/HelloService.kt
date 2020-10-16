package com.example.kotlincustomspringaop

import org.springframework.stereotype.Service

@Service
class HelloService {

    fun getMessage(): String {
        val randomNumber = (0L..1000L).random()
        Thread.sleep(randomNumber)
        return "Hello you!"
    }

}
