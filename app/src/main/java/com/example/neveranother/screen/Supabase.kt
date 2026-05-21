package com.example.neveranother.screen

import android.widget.Button
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.neveranother.model.Customer
import com.example.neveranother.model.Product
import com.example.neveranother.viewModel.NAViewmodel
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.postgrest.from
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


@Composable
fun SupabaseScreen(navController: NavHostController, vm: NAViewmodel){
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
        Text("Supabase")
    }
}
val supabase = createSupabaseClient(
    supabaseUrl = "https://ofmzqiwzioamrjhbgvhi.supabase.co",
    supabaseKey = "sb_publishable_8Y6VX4LpCWuv2T5Tt04nmw_rb6pCmqK"
) {
    install(Postgrest)
}
/*
val products = supabase.from("Product")
val customer = supabase.from("Customer")
val orders = supabase.from("Orders")
@Composable
fun InsertDataIntoDatabase() {
    val insertedCustomer = supabase.from("Customer")
        .insert(Customer(
            firstName = firstName,
            lastName = lastName,
            streetName = streetName,
            city = city,
            postalCode = postalCode.toIntOrNull() ?: 0,
            phoneNumber = phoneNumber.toIntOrNull() ?: 0
        )) { select() }
        .decodeSingle<Customer>()


 */