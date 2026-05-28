package com.example.neveranother.model

import androidx.compose.runtime.MutableState
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Product(
    @SerialName("ProductID") val productID: Int? = null,
    @SerialName("upperCircumference") val upperCircumference: Int,
    @SerialName("lowerCircumference") val lowerCircumference: Int,
    @SerialName("breastWidth") val breastWidth: Int,
    @SerialName("breastHeight") val breastHeight: Int,
    @SerialName("color") val color: String,
    @SerialName("quantity") val quantity: Int
)