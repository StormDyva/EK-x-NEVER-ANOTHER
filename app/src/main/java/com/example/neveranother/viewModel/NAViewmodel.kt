package com.example.neveranother.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.neveranother.model.SupabaseDatabase
import kotlinx.coroutines.launch

class NAViewmodel: ViewModel() {
    var upperMeasure = mutableStateOf("")
    var lowerMeasure = mutableStateOf("")
    var breastWidth = mutableStateOf("")
    var breastHeight = mutableStateOf("")


    var customerId = mutableStateOf<Int?>(null)

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
                val id = SupabaseDatabase.insertCustomer(
                    firstName = firstName,
                    lastName = lastName,
                    streetName = streetName,
                    city = city,
                    postalCode = postalCode,
                    phoneNumber = phoneNumber,
                    email = email,
                )
                customerId.value = id
            } catch (e: Exception) {
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
    }



