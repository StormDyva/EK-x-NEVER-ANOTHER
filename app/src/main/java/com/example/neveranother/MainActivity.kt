package com.example.neveranother

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.neveranother.screen.SupabaseScreen
import com.example.neveranother.screen.Basket
import com.example.neveranother.screen.BookFitting
import com.example.neveranother.screen.DesignAndProduct
import com.example.neveranother.screen.GetStarted
import com.example.neveranother.screen.Home
import com.example.neveranother.screen.LoadingFrame
import com.example.neveranother.screen.Measures1
import com.example.neveranother.screen.Measures2
import com.example.neveranother.screen.OrderInformation
import com.example.neveranother.screen.OurMission
import com.example.neveranother.screen.Payment
import com.example.neveranother.screen.Purchased
import com.example.neveranother.screen.ResultsOfMeasure
import com.example.neveranother.viewModel.NAViewmodel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val vm = viewModel<NAViewmodel>()
            val navController = rememberNavController()

            Surface(

            ) {
                Column {
                    NavHost(navController = navController, startDestination = "Supabase-Screen") {

                        composable("Basket-screen") {
                            Basket(navController, vm)
                        }

                        composable("BookFitting-screen") {
                            BookFitting(navController, vm)
                        }

                        composable("DesignAndProduct-screen") {
                            DesignAndProduct(navController, vm)
                        }

                        composable("GetStarted-screen") {
                            GetStarted(navController, vm)
                        }

                        composable("Home") {
                            Home(navController, vm)
                        }

                        composable("LoadingFrame-screen") {
                            LoadingFrame(navController, vm)
                        }

                        composable("Measures1-screen") {
                            Measures1(navController, vm)
                        }

                        composable("Measures2-screen") {
                            Measures2(navController, vm)
                        }

                        composable("ResultsOfMeasure-screen") {
                            ResultsOfMeasure(navController, vm)
                        }

                        composable("OrderInformation-screen") {
                            OrderInformation(navController, vm)
                        }

                        composable("OurMission-screen") {
                            OurMission(navController, vm)
                        }

                        composable("Payment-screen") {
                            Payment(navController, vm)
                        }

                        composable("Purchased-screen") {
                            Purchased(navController, vm)
                        }
                        composable  ("Basket-screen"){
                            Basket(navController, vm)
                        }
                        composable ("Supabase-screen") {
                            SupabaseScreen(navController, vm)
                        }
                    }
                }
            }
        }

    }
}
