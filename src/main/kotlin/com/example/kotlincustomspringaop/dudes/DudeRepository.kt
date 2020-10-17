package com.example.kotlincustomspringaop.dudes

import com.example.kotlincustomspringaop.dudes.Dude
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface DudeRepository : CrudRepository<Dude, Int>
