package com.example.neveranother.model

import kotlinx.serialization.Serializable

@Serializable
data class Order(
   val product: Product,
   val customer: Customer
)
