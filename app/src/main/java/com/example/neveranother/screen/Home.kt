package com.example.neveranother.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.neveranother.components.GetStartedBTN
import com.example.neveranother.viewModel.NAViewmodel

@Composable

fun Home(navController: NavHostController, vm: NAViewmodel){
GetStartedBTN(navController, vm)
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
        Text("Home")
    }
}