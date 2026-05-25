package com.example.neveranother.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.neveranother.viewModel.NAViewmodel

@Composable
fun AddToBasketBTN(navController: NavHostController, vm: NAViewmodel) {
    Button(
        onClick = {
            navController.navigate("Basket-screen")
        }, modifier = Modifier
            .height(56.dp),
        shape = RoundedCornerShape(
            topEnd = 16.dp,
            bottomEnd = 16.dp
        ),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFE8957A)
        )
    )
    {
        Text(
            text = "Læg i kurv",
            modifier = Modifier.fillMaxWidth(),
            color = Color.Black,
            fontSize = 16.sp,
            textAlign = TextAlign.Center
        )
    }
}