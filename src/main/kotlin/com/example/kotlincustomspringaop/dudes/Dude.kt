package com.example.kotlincustomspringaop.dudes

import javax.persistence.Id
import javax.persistence.Entity


@Entity
class Dude(
        @Id
    var id: Int = counter++,
        var name: String = "ukjent"
) {
    companion object {
        var counter = 0
    }
}
