package com.example.neveranother.model

import kotlinx.serialization.Serializable

@Serializable
data class Product(
    val upperCircumference: Int,
    val lowerCircumference: Int,
    val breastSpan: Int,
    val breastHeight: Int,
    val color: String,
    val quantity: Int
)
