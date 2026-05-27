package com.example.neveranother.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
            value = "",
            onValueChange = {},
            placeholder = { Text("Email", color = Color.Gray) },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(4.dp)
        )

        Spacer(modifier = Modifier.height(40.dp))

        Text("Levering", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.Black)

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            placeholder = { Text("Land", color = Color.Gray) },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(4.dp),
        )

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                placeholder = { Text("Fornavn", color = Color.Gray) },
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(4.dp)
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                placeholder = { Text("Efternavn", color = Color.Gray) },
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(4.dp)
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
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
                value = "",
                onValueChange = {},
                placeholder = { Text("Post nr.", color = Color.Gray) },
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(4.dp)
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                placeholder = { Text("By", color = Color.Gray) },
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(4.dp)
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            placeholder = { Text("Telefon", color = Color.Gray) },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(4.dp)
        )

        Spacer(modifier = Modifier.height(130.dp))

        Button(
            onClick = { navController.navigate("Purchased-screen")},
            modifier = Modifier
                .fillMaxWidth()
                .width(370.dp)
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

