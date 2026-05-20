package com.example.neveranother

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.neveranother.screen.Basket
import com.example.neveranother.screen.BookFitting
import com.example.neveranother.screen.DesignAndProduct
import com.example.neveranother.screen.GetStarted
import com.example.neveranother.screen.Home
import com.example.neveranother.screen.LoadingFrame
import com.example.neveranother.screen.Measures1
import com.example.neveranother.screen.Measures2
import com.example.neveranother.screen.OrderConfirmed
import com.example.neveranother.screen.OrderInformation
import com.example.neveranother.screen.OurMission
import com.example.neveranother.screen.Payment
import com.example.neveranother.screen.Results
import com.example.neveranother.ui.theme.NEVERANOTHERTheme
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
                    NavHost(navController = navController, startDestination = "Home") {

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

                        composable("OrderConfirmed-screen") {
                            OrderConfirmed(navController, vm)
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

                        composable("Results-screen") {
                            Results(navController, vm)
                        }
                    }
                }
            }
        }

    }
}
