package com.example.neveranother.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class NAViewmodel: ViewModel(){
    var upperMeasure = mutableStateOf("")
    var lowerMeasure = mutableStateOf("")
    var breastWidth = mutableStateOf("")
    var breastHeight = mutableStateOf("")





    fun updateUpperMeasure(value: String) {
        upperMeasure.value = value
    }

    fun updateLowerMeasure(value: String) {
        lowerMeasure.value = value
    }

    fun updateBreastWidth(value: String) {
        breastWidth.value = value
    }

    fun updateBreastHeight(value: String) {
        breastHeight.value = value
    }
    fun isUpperMeasureValid(): Boolean {

        val number = upperMeasure.value.toIntOrNull()

        return number != null &&

                number in 77..113

    }

    fun isLowerMeasureValid(): Boolean {

        val number = lowerMeasure.value.toIntOrNull()

        return number != null &&

                number in 60..100

    }

    fun isBreastWidthValid(): Boolean {

        val number = breastWidth.value.toIntOrNull()

        return number != null &&

                number in 10..50

    }

    fun isBreastHeightValid(): Boolean {

        val number = breastHeight.value.toIntOrNull()

        return number != null &&

                number in 10..50

    }
}