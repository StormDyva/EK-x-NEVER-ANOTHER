package com.example.neveranother.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.neveranother.components.AddToBasketBTN
import com.example.neveranother.viewModel.NAViewmodel

@Composable

fun ResultsOfMeasure(navController: NavHostController, vm: NAViewmodel){
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
        Text("ResultsOfMeasure")
    }
    AddToBasketBTN(navController, vm)
}