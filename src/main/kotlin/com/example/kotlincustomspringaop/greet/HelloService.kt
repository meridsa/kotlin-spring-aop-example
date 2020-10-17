package com.example.kotlincustomspringaop.greet

import com.example.kotlincustomspringaop.dudes.DudeRepository
import org.springframework.stereotype.Service

@Service
class HelloService(private val dudeRepository: DudeRepository) {

    fun getMessage(): String {
        val randomNumber = (0L..1000L).random()
        Thread.sleep(randomNumber)
        return "Hello you!"
    }

    fun greetName(name: String): String {
        return "Hello $name!"
    }

    fun getDudes(): List<String> {
        return dudeRepository.findAll()
                .map{it.name}
                .toList()
    }
}
