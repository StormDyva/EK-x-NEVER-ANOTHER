package com.example.neveranother.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.neveranother.components.BackBTN
import com.example.neveranother.components.BeginMeasureBTN
import com.example.neveranother.components.CreateBraBTN
import com.example.neveranother.components.Header
import com.example.neveranother.viewModel.NAViewmodel

@Composable

fun GetStarted(navController: NavHostController, vm: NAViewmodel){
    Header()
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
        Text("GetStarted")
    }
    BeginMeasureBTN(navController, vm)
    BackBTN{navController.popBackStack()}

}