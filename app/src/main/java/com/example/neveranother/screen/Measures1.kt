package com.example.neveranother.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.example.neveranother.components.BackBTN
import com.example.neveranother.components.BeginMeasureBTN
import com.example.neveranother.components.ContinueBTN1
import com.example.neveranother.components.ContinueBTN2
import com.example.neveranother.components.Header
import com.example.neveranother.viewModel.NAViewmodel

@Composable

fun Measures1(navController: NavHostController, vm: NAViewmodel){
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
        Text("Measures1")
    }
    ContinueBTN1(navController, vm)
    BackBTN({ navController.popBackStack() }, color = Color.Black)
    Header()
}