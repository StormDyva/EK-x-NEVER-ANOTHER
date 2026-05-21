package com.example.neveranother.screen


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.navigation.NavHostController
import com.example.neveranother.components.CreateBraBTN
import com.example.neveranother.components.Header
import com.example.neveranother.viewModel.NAViewmodel
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.neveranother.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
@Composable
fun Home(navController: NavHostController, vm: NAViewmodel) {
    val verticalScroll = rememberScrollState()
    Column (
        modifier = Modifier.verticalScroll(verticalScroll)
    ){
        Box(modifier = Modifier
            .fillMaxSize()) {

            // Baggrundsbillede
            Image(
                painter = painterResource(id = R.drawable.forsidebillede),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 70.dp)

            ) {

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 24.dp, bottom = 32.dp, top = 100.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Din nye",
                        fontFamily = FontFamily(Font(R.font.nohemi_bold)),
                        color = (Color(0xFFF8F5F2)),
                        fontSize = 60.sp
                    )
                    Text(
                        text = "skræddersyet hverdags BH",
                        fontFamily = FontFamily(Font(R.font.nohemi_regular)),
                        color = (Color(0xFFF8F5F2)),
                        fontSize = 50.sp,
                        lineHeight = 55.sp
                    )
                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(bottom = 70.dp, end = 10.dp),
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.End
                ) {
                    Text(
                        text = "799 kr",
                        fontFamily = FontFamily(Font(R.font.nohemi_regular)),
                        fontSize = 25.sp

                    )

                }
                CreateBraBTN(navController, vm)
            }
        }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFFF8F5F2))
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.whitebra),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                    )

                    Spacer(modifier = Modifier.height(32.dp))
                }
    }
    Header()
}