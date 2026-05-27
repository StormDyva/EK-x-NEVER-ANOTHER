package com.example.neveranother.model

import android.R
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Customer(
    @SerialName("customer_ID") val customerID: Int? = null,
    @SerialName("firstName") val firstName: String,
    @SerialName("lastName") val lastName: String,
    @SerialName("streetName") val streetName: String,
    @SerialName("city") val city: String,
    @SerialName("postalCode") val postalCode: Int,
    @SerialName("phoneNumber") val phoneNumber: Int,
    @SerialName("email") val email: String,
)