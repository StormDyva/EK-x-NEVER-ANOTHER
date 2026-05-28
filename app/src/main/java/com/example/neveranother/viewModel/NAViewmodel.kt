package com.example.neveranother.viewModel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.neveranother.model.SupabaseDatabase
import kotlinx.coroutines.launch

class NAViewmodel: ViewModel() {
    var upperMeasure = mutableStateOf("")
    var lowerMeasure = mutableStateOf("")
    var breastWidth = mutableStateOf("")
    var breastHeight = mutableStateOf("")
    var selectedColor = mutableStateOf("")

    var quantity = mutableStateOf(1)

    fun saveCustomer(
        firstName: String,
        lastName: String,
        streetName: String,
        city: String,
        postalCode: Int,
        phoneNumber: Int,
        email: String
    ) {
        viewModelScope.launch {
            try {
                SupabaseDatabase.insertCustomer(
                    firstName = firstName,
                    lastName = lastName,
                    streetName = streetName,
                    city = city,
                    postalCode = postalCode,
                    phoneNumber = phoneNumber,
                    email = email
                )
                println("Kunde gemt!")
            } catch (e: Exception) {
                println("FEJL: ${e.message}")
                e.printStackTrace()
            }
        }
    }

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
    fun saveProduct(
        upperCircumference: Int,
        lowerCircumference: Int,
        breastWidth: Int,
        breastHeight: Int,
        color: String,
        quantity: Int
    ) {
        viewModelScope.launch {
            try {
                SupabaseDatabase.insertProductInformation(
                    upperCircumference = upperCircumference,
                    lowerCircumference = lowerCircumference,
                    breastWidth = breastWidth,
                    breastHeight = breastHeight,
                    color = color,
                    quantity = quantity
                )
                println("Mål gemt!")
            } catch (e: Exception) {
                println("FEJL: ${e.message}")
                e.printStackTrace()
            }
        }
    }
    }



