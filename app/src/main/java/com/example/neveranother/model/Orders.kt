package com.example.neveranother.model

import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.util.Date

data class Orders(
    val bhData: Bh,
    val firstName: String,
    val lastName: String,
    val road: String,
    val roadNumber: Int,
    val city: String,
    val postalCode: Int,
    val orderDate: LocalDateTime,
    val orderNumber: Int
)

