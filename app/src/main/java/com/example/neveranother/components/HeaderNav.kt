package com.example.neveranother.components

import android.R.attr.icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import com.example.neveranother.R

@Composable
fun Header(navController: NavController) {
    var menuExpanded by remember { mutableStateOf(false) }

    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .background(Color(0xFFF8F5F2))
        ) {
            Image(
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp)
                    .align(Alignment.Center)
                    .clickable { navController.navigate("home") },
                painter = painterResource(id = R.drawable.nalogoblack700),
                contentDescription = "Logo",
                contentScale = ContentScale.Fit
            )

            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 9.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { menuExpanded = true }) {
                    Icon(
                        imageVector = Icons.Filled.Menu,
                        contentDescription = "Menu"
                    )
                }
            }
        }
        HorizontalDivider(
            color = Color.LightGray,
            thickness = 1.dp
        )
    }

    if (menuExpanded) {
        Dialog(onDismissRequest = { }) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFF8F5F2))
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    TextButton(
                        onClick = {
                            navController.navigate("Home")
                        },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Image(modifier = Modifier
                            .width(200.dp)
                            .height(50.dp),
                            painter = painterResource(id = R.drawable.nalogoblack700),
                            contentDescription = "Logo",
                            contentScale = ContentScale.Fit)
                    }

                    HorizontalDivider(color = Color.White, thickness = 1.dp)
                    TextButton(
                        onClick = {
                            navController.navigate("OurMission-screen")
                        },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Vores Mission", fontFamily = FontFamily(Font(R.font.inter_regular)), fontSize = 25.sp, color = Color.Black)
                    }

                    HorizontalDivider(color = Color.White, thickness = 1.dp)

                    TextButton(
                        onClick = {
                            navController.navigate("BookFitting-screen")
                        },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Bestil Fitting", fontFamily = FontFamily(Font(R.font.inter_regular)), fontSize = 25.sp, color = Color.Black)
                    }

                    HorizontalDivider(color = Color.White, thickness = 1.dp)
                    TextButton(
                        onClick = {
                            navController.navigate("DesignAndProduct-screen")
                        },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Design & Produkt", fontFamily = FontFamily(Font(R.font.inter_regular)), fontSize = 25.sp, color = Color.Black)
                    }
                    HorizontalDivider(color = Color.White, thickness = 1.dp)
                    TextButton(onClick = {menuExpanded = false }) {
                        Text("Luk", fontFamily = FontFamily(Font(R.font.inter_regular)), fontSize = 20.sp, color = Color.Black)
                    }
                }
            }
        }
    }
}