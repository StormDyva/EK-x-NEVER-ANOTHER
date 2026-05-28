package com.example.neveranother.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.neveranother.components.BackBTN
import com.example.neveranother.components.Header
import com.example.neveranother.viewModel.NAViewmodel

@Composable

fun OrderInformation(navController: NavHostController, vm: NAViewmodel) {

    var email by remember { mutableStateOf("") }
    var country by remember { mutableStateOf("") }
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var streetName by remember { mutableStateOf("") }
    var postalCode by remember { mutableStateOf("") }
    var city by remember { mutableStateOf("") }
    var phoneNumber by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF8F5F2))
            .padding(all = 30.dp)
    ) {

        Spacer(modifier = Modifier.height(160.dp))

        Text("Kontakt", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.Black)

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            placeholder = { Text("Email", color = Color.Gray) },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(4.dp)
        )

        Spacer(modifier = Modifier.height(40.dp))

        Text("Levering", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.Black)

        Spacer(modifier = Modifier.height(12.dp))


        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            OutlinedTextField(
                value = firstName,
                onValueChange = {firstName = it},
                placeholder = { Text("Fornavn", color = Color.Gray) },
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(4.dp)
            )
            OutlinedTextField(
                value = lastName,
                onValueChange = {lastName = it},
                placeholder = { Text("Efternavn", color = Color.Gray) },
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(4.dp)
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = country,
            onValueChange = {country = it},
            placeholder = { Text("Land", color = Color.Gray) },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(4.dp)
        )

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = streetName,
            onValueChange = {streetName = it},
            placeholder = { Text("Addresse", color = Color.Gray) },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(4.dp)
        )


        Spacer(modifier = Modifier.height(12.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {


            OutlinedTextField(
                value = postalCode,
                onValueChange = {postalCode = it},
                placeholder = { Text("Post nr.", color = Color.Gray) },
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(4.dp)
            )
            OutlinedTextField(
                value = city,
                onValueChange = {city = it},
                placeholder = { Text("By", color = Color.Gray) },
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(4.dp)
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = phoneNumber,
            onValueChange = {phoneNumber = it},
            placeholder = { Text("Telefon", color = Color.Gray) },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(4.dp)
        )

        Spacer(modifier = Modifier.height(130.dp))

        Button(
            onClick = {

                vm.saveCustomer(
                    firstName = firstName,
                    lastName = lastName,
                    streetName = streetName,
                    email = email,
                    city = city,
                    postalCode = postalCode.toIntOrNull() ?: 0,
                    phoneNumber = phoneNumber.toIntOrNull() ?: 0
                )
                vm.saveProduct(
                    upperCircumference = vm.upperMeasure.value.toIntOrNull()?: 0,
                    lowerCircumference = vm.lowerMeasure.value.toIntOrNull()?:0,
                    breastWidth = vm.breastWidth.value.toIntOrNull()?:0,
                    breastHeight = vm.breastHeight.value.toIntOrNull()?:0,
                    color = vm.selectedColor.value,
                    quantity = vm.quantity.value
                )

                println("Navn: $firstName $lastName")
                println("Email: $email")
                println("Street name: $streetName")
                println("City: $city")
                println("post nr: $postalCode")
                println("Telefon: $phoneNumber")


            },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Text("Gå til betaling", color = Color.White, fontSize = 16.sp)
        }

    }
    Header(navController = navController)

    BackBTN(
        { navController.popBackStack() },
        color = Color.Black
    )
}



