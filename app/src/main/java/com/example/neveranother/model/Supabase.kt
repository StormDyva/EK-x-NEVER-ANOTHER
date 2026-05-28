package com.example.neveranother.model

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.neveranother.viewModel.NAViewmodel
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.postgrest.from


@Composable
fun SupabaseScreen(navController: NavHostController, vm: NAViewmodel) {
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Supabase")
    }
}

val supabase = createSupabaseClient(
    supabaseUrl = "https://ofmzqiwzioamrjhbgvhi.supabase.co",
    supabaseKey = "sb_publishable_8Y6VX4LpCWuv2T5Tt04nmw_rb6pCmqK"
) {
    install(Postgrest)
}

object SupabaseDatabase {

    suspend fun insertCustomer(
        firstName: String,
        lastName: String,
        streetName: String,
        city: String,
        postalCode: Int,
        email: String,
        phoneNumber: Int
    ) {
        supabase
            .from("Customer")
            .insert(
                Customer(
                    firstName = firstName,
                    lastName = lastName,
                    streetName = streetName,
                    city = city,
                    postalCode = postalCode,
                    email = email,
                    phoneNumber = phoneNumber
                )
            )
    }

    suspend fun insertProductInformation(
        upperCircumference: Int,
        lowerCircumference: Int,
        breastWidth: Int,
        breastHeight: Int,
        color: String,
        quantity: Int
    ) {
        supabase
            .from("Product")
            .insert(
                Product(
                    upperCircumference = upperCircumference,
                    lowerCircumference = lowerCircumference,
                    breastWidth = breastWidth,
                    breastHeight = breastHeight,
                    color = color,
                    quantity = quantity
                )
            )
    }
}