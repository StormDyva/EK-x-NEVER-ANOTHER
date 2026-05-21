package com.example.neveranother.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Customer(
    val customer_ID: Int? = null,
    val firstName: String,
    val lastName: String,
    val streetName: String,
    val city: String,
    val postalCode: Int,
    val phoneNumber: Int
) {
}