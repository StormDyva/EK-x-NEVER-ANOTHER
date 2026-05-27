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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.neveranother.model.Customer
import com.example.neveranother.model.SupabaseDatabase
import com.example.neveranother.model.SupabaseScreen
import com.example.neveranother.model.supabase
import com.example.neveranother.screen.Basket
import com.example.neveranother.screen.BookFitting
import com.example.neveranother.screen.DesignAndProduct
import com.example.neveranother.screen.GetStarted
import com.example.neveranother.screen.Home
import com.example.neveranother.screen.InfoVideoNR1
import com.example.neveranother.screen.InfoVideoNR2
import com.example.neveranother.screen.InfoVideoNR3
import com.example.neveranother.screen.InfoVideoNR4
import com.example.neveranother.screen.LoadingFrame
import com.example.neveranother.screen.Measures1
import com.example.neveranother.screen.Measures2
import com.example.neveranother.screen.OrderInformation
import com.example.neveranother.screen.OurMission
import com.example.neveranother.screen.Payment
import com.example.neveranother.screen.Purchased
import com.example.neveranother.screen.ResultsOfMeasure
import com.example.neveranother.ui.theme.NEVERANOTHERTheme
import com.example.neveranother.viewModel.NAViewmodel
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.postgrest.from

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
                    NavHost(
                        navController = navController,
                        startDestination = "Measures1-screen"
                    ) {

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
                        composable("Basket-screen") {
                            Basket(navController, vm)
                        }
                        composable("Supabase-screen") {
                            SupabaseScreen(navController, vm)
                        }
                        composable("LoadingFrame") {
                            LoadingFrame(navController, vm)
                        }
                        composable("infoVideoNR1") {
                            InfoVideoNR1(navController, vm)
                        }
                        composable("infoVideoNR2") {
                            InfoVideoNR2(navController, vm)
                        }
                        composable("infoVideoNR3") {
                            InfoVideoNR3(navController, vm)
                        }
                        composable("infoVideoNR4") {
                            InfoVideoNR4(navController, vm)
                        }
                    }
                }
            }
        }

    }
}
