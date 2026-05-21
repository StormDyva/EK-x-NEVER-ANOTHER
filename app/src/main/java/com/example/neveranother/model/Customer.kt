package com.example.neveranother.model

import kotlinx.serialization.SerialName

data class Customer (
    @SerialName ("customer_ID") val customer_ID: Int? = null,
    @SerialName ("firstName") val firstName: String,
    @SerialName ("lastName") val lastName: String,
    @SerialName ("streetName")val streetName: String,
    @SerialName ("city")val city: String,
    @SerialName ("postalCode")val postalCode: Int,
    @SerialName ("phoneNumber")val phoneNumber: Int
) {
}