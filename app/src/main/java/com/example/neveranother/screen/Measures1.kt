package com.example.neveranother.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.neveranother.R
import com.example.neveranother.components.BackBTN
import com.example.neveranother.components.ContinueBTN1
import com.example.neveranother.components.Header
import com.example.neveranother.viewModel.NAViewmodel

@Composable
fun Measures1(navController: NavHostController, vm: NAViewmodel) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF8F5F2))
            .padding(horizontal = 32.dp)
            .padding(top = 200.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top
        ) {

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "Øvre omkreds",
                    fontFamily = FontFamily(Font(R.font.nohemi_bold)),
                    fontSize = 34.sp,
                    lineHeight = 38.sp,
                    maxLines = 1
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = "Mål din omkreds over den fyldigste del af brystet, og indtast dine mål nedenfor. Klik på info-knappen for en instruktionsvideo.",
                    fontFamily = FontFamily(Font(R.font.inter_regular)),
                    fontSize = 20.sp,
                    lineHeight = 24.sp
                )
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.upper_measure),
                    contentDescription = "Øvre omkreds",
                    modifier = Modifier
                        .size(80.dp)
                        .padding(start = 6.dp),
                    contentScale = ContentScale.Fit
                )

                Spacer(modifier = Modifier.height(42.dp))

                Button(
                    onClick = {},
                    modifier = Modifier.size(26.dp),
                    shape = CircleShape,
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFF9800)
                    )
                ) {
                    Text(
                        text = "i",
                        color = Color.Black,
                        fontSize = 18.sp
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = vm.upperMeasure.value,
            onValueChange = { vm.updateUpperMeasure(it) },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            trailingIcon = {
                Text(
                    text = "CM",
                    fontFamily = FontFamily(Font(R.font.inter_regular)),
                    fontSize = 14.sp
                )
            },
            singleLine = true,
            shape = RoundedCornerShape(8.dp)
        )

        Spacer(modifier = Modifier.height(80.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top
        ) {

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "Nedre omkreds",
                    fontFamily = FontFamily(Font(R.font.nohemi_bold)),
                    fontSize = 34.sp,
                    lineHeight = 38.sp,
                    maxLines = 1
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = "Mål din omkreds lige under brystet, og indtast dine mål nedenfor. Klik på info-knappen for en instruktionsvideo.",
                    fontFamily = FontFamily(Font(R.font.inter_regular)),
                    fontSize = 20.sp,
                    lineHeight = 24.sp
                )
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.lower_measure),
                    contentDescription = "Nedre omkreds",
                    modifier = Modifier
                        .size(70.dp)
                        .padding(start = 6.dp),
                    contentScale = ContentScale.Fit
                )

                Spacer(modifier = Modifier.height(42.dp))

                Button(
                    onClick = {},
                    modifier = Modifier.size(26.dp),
                    shape = CircleShape,
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFF9800)
                    )
                ) {
                    Text(
                        text = "i",
                        color = Color.Black,
                        fontSize = 18.sp
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = vm.lowerMeasure.value,
            onValueChange = { vm.updateLowerMeasure(it) },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            trailingIcon = {
                Text(
                    text = "CM",
                    fontFamily = FontFamily(Font(R.font.inter_regular)),
                    fontSize = 14.sp
                )
            },
            singleLine = true,
            shape = RoundedCornerShape(8.dp)
        )

        Spacer(modifier = Modifier.weight(1f))

        ContinueBTN1(navController, vm)

        Spacer(modifier = Modifier.height(28.dp))
    }
    ContinueBTN1(navController, vm)
    BackBTN({ navController.popBackStack() }, color = Color.Black)
    Header()

}