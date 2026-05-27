package com.example.neveranother.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.neveranother.R
import com.example.neveranother.viewModel.NAViewmodel

@Composable
fun CreateBraBTN(navController: NavHostController, vm: NAViewmodel) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 140.dp), verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            modifier = Modifier.width(175.dp).height(50.dp),
            onClick = { navController.navigate("GetStarted-screen") },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xCCF8F5F2)
            ),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(
                text = "Skab din BH",
                fontFamily = FontFamily(Font(R.font.inter_semibold)),
                fontSize = 20.sp,
                color = Color.Black
            )
        }
    }
}