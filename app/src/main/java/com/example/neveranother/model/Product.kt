package com.example.neveranother.model

abstract class Product (
    val upperCircumference: Float,
    val lowerCircumference: Float,
    val breastSpan: Float,
    val breastHeight: Float
){
    abstract val color: String
}