package com.example.neveranother.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.neveranother.R
import com.example.neveranother.components.BackBTN
import com.example.neveranother.components.BeginMeasureBTN
import com.example.neveranother.components.CreateBraBTN
import com.example.neveranother.components.Header
import com.example.neveranother.viewModel.NAViewmodel
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import org.intellij.lang.annotations.JdkConstants

@Composable
fun GetStarted(navController: NavHostController, vm: NAViewmodel) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF8F5F2))
    ) {


        Image(
            painter = painterResource(id = R.drawable.measure_bra),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.54f)
        )

        Header(navController = navController)

        BackBTN(
            { navController.popBackStack() },
            color = Color.White
        )


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 24.dp, top = 130.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Find din \nperfekte pasform \nhjemmefra",
                fontFamily = FontFamily(Font(R.font.inter_semibold)),
                color = Color.White,
                fontSize = 40.sp
            )

            HorizontalDivider(modifier = Modifier
                .fillMaxWidth(0.28f)
                .padding(top = 10.dp, start = 15.dp)
                ,color = Color.White,
                thickness = 2.3.dp
            )

        }


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(bottom = 180.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .background(color = Color.White, shape = RoundedCornerShape(16.dp))
                    .padding(horizontal = 20.dp, vertical = 22.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(55.dp)
                            .background(Color(0xFFF5F0EB), shape = CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_measuring_tape),
                            contentDescription = null,
                            modifier = Modifier.size(26.dp)
                        )
                    }
                    Column {
                        Text(
                            text = "1.  Hav et målebånd klar",
                            fontFamily = FontFamily(Font(R.font.inter_extrabold)),
                            fontSize = 13.sp
                        )
                        Text(
                            text = "Vi guider dig hele vejen",
                            fontFamily = FontFamily(Font(R.font.inter_regular)),
                            fontSize = 13.sp,
                            color = Color(0xFF888888)
                        )
                    }
                }
            }


            Box(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .background(color = Color.White, shape = RoundedCornerShape(16.dp))
                    .padding(horizontal = 20.dp, vertical = 22.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(55.dp)
                            .background(Color(0xFFF5F0EB), shape = CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_bra),
                            contentDescription = null,
                            modifier = Modifier.size(26.dp)
                        )
                    }
                    Column {
                        Text(
                            text = "2.  Brug din yndlings BH uden padding",
                            fontFamily = FontFamily(Font(R.font.inter_extrabold)),
                            fontSize = 13.sp
                        )
                        Text(
                            text = "Så får du det mest præcise resultat",
                            fontFamily = FontFamily(Font(R.font.inter_regular)),
                            fontSize = 13.sp,
                            color = Color(0xFF888888)
                        )
                    }
                }
            }
        }
        BeginMeasureBTN(navController, vm)
    }
}