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
import com.example.neveranother.components.ContinueBTN2
import com.example.neveranother.components.Header
import com.example.neveranother.viewModel.NAViewmodel

@Composable
fun Measures2(navController: NavHostController, vm: NAViewmodel) {

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
                    text = "Brystbredde",
                    fontFamily = FontFamily(Font(R.font.nohemi_bold)),
                    fontSize = 34.sp,
                    lineHeight = 38.sp,
                    maxLines = 1
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = "Mål din brystbredde i en vandret linje over det fyldigste punkt på brystet. Klik på info-knappen for en instruksionsvideo",
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
                    contentDescription = "Brystbredde",
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
            value = vm.breastWidth.value,
            onValueChange = { vm.updateBreastWidth(it) },
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

        Spacer(modifier = Modifier.height(70.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top
        ) {

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "Brysthøjde",
                    fontFamily = FontFamily(Font(R.font.nohemi_bold)),
                    fontSize = 34.sp,
                    lineHeight = 38.sp,
                    maxLines = 1
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = "Mål din skålhøjde i en lodret linje, hen over brystets runding. Klik på info-knappen for en instruksionvideo",
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
            value = vm.breastHeight.value,
            onValueChange = { vm.updateBreastHeight(it) },
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

        ContinueBTN2(navController, vm)

        Spacer(modifier = Modifier.height(28.dp))
    }
    ContinueBTN2(navController, vm)
    BackBTN({ navController.popBackStack() }, color = Color.Black)
    Header()
}