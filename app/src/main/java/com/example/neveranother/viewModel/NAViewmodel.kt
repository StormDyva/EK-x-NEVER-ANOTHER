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
//Loui + Frederik
class NAViewmodel: ViewModel() {
    var upperMeasure = mutableStateOf("")
    var lowerMeasure = mutableStateOf("")
    var breastWidth = mutableStateOf("")
    var breastHeight = mutableStateOf("")
    var selectedColor = mutableStateOf("")
    var quantity = mutableStateOf(1)

    var isUpperMeasure1Valid = mutableStateOf(false)

    var isLowerMeasure1Valid = mutableStateOf(false)

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
        val number = value.toIntOrNull()
        isUpperMeasure1Valid.value = number != null && number in 77..113
    }

    fun updateLowerMeasure(value: String) {
        lowerMeasure.value = value
        val number = value.toIntOrNull()
        isLowerMeasure1Valid.value = number != null && number in 65..100
    }
    fun updateBreastWidth(value: String) {
        breastWidth.value = value
    }

    fun updateBreastHeight(value: String) {
        breastHeight.value = value
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



