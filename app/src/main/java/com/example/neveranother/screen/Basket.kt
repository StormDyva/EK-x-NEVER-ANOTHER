package com.example.neveranother.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.neveranother.R
import com.example.neveranother.components.BackBTN
import com.example.neveranother.components.Header
import com.example.neveranother.viewModel.NAViewmodel
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight


@Composable
fun Basket(navController: NavHostController, vm: NAViewmodel) {
    val backgroundColor = Color(0xFFF8F5F2)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(horizontal = 16.dp)
    ) {
        Header(navController = navController)
        BackBTN(
            { navController.popBackStack() },
            color = Color.White
        )

        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {
            item {
                Text("Din kurv", fontSize = 28.sp, fontWeight = FontWeight.Bold)
                Text("1 vare", color = Color.Gray, fontSize = 14.sp)
                Spacer(modifier = Modifier.height(16.dp))
            }

            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White, RoundedCornerShape(16.dp))
                        .padding(16.dp)
                ) {
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.blackbra),
                            contentDescription = null,
                            contentScale = ContentScale.Crop
                        )

                        Spacer(modifier = Modifier.width(16.dp))

                        Column {
                            Text("Bra no. 167", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                            Text("Farve:  Sort", color = Color.Gray)
                            Text("Størrelse:", color = Color.Gray)
                            Spacer(modifier = Modifier.height(8.dp))
                            Text("Øvre omkreds: ${vm.upperMeasure.value} cm", color = Color.Gray)
                            Text("Nedre omkreds: ${vm.lowerMeasure.value} cm", color = Color.Gray)
                            Text("Brystbredde:${vm.breastWidth.value} cm", color = Color.Gray)
                            Text("Brysthøjde: ${vm.breastHeight.value} cm", color = Color.Gray)
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    var amount by remember { mutableIntStateOf(1) }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        OutlinedButton(
                            onClick = { if (amount > 1) amount-- },
                            modifier = Modifier.size(36.dp),
                            contentPadding = PaddingValues(0.dp)
                        ) { Text("-") }
                        Text("$amount", modifier = Modifier.padding(horizontal = 16.dp))
                        OutlinedButton(
                            onClick = { amount++ },
                            modifier = Modifier.size(36.dp),
                            contentPadding = PaddingValues(0.dp)
                        ) { Text("+") }
                    }

                    Divider(modifier = Modifier.padding(vertical = 12.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text("Fjern", color = Color.Gray, fontSize = 14.sp)
                        Text("799 kr", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                    }
                }
            }

            item {
                Spacer(modifier = Modifier.height(155.dp))
                Text("ORDREOVERSIGT", fontFamily = FontFamily(Font(R.font.inter_black)), fontSize = 20.sp)
                Spacer(modifier = Modifier.height(12.dp))

                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Text("Subtotal", color = Color.Gray)
                    Text("799 kr", fontFamily = FontFamily(Font(R.font.inter_regular)))
                }
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Text("Fragt", color = Color.Gray)
                    Text("49 kr", fontWeight = FontWeight.Bold, color = Color.Red)
                }

                Divider(modifier = Modifier.padding(vertical = 8.dp))

                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Text("Total", fontWeight = FontWeight.Bold)
                    Text("848 kr", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
        ) {
            Text("Gå til betaling", color = Color.White, fontSize = 16.sp)
        }
        Spacer(modifier = Modifier.height(16.dp))
    }
    BackBTN({ navController.popBackStack() }, color = Color.Black)
}