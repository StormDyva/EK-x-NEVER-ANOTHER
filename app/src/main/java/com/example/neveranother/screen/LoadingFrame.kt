package com.example.neveranother.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.neveranother.R
import com.example.neveranother.components.Header
import com.example.neveranother.viewModel.NAViewmodel
import kotlinx.coroutines.delay

@Composable
fun LoadingFrame(
    navController: NavHostController,
    vm: NAViewmodel
) {
    var counter by remember { mutableIntStateOf(0) }
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        LaunchedEffect(Unit) {

            delay(5100)

            navController.navigate("ResultsOfMeasure-screen")

        }

        Image(
            painter = painterResource(id = R.drawable.loading),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Header()


        Text(

            modifier = Modifier
                .padding(start = 32.dp, top = 200.dp),

            color = Color.White,

            fontSize = 34.sp,

            lineHeight = 44.sp,

            fontFamily = FontFamily(
                Font(R.font.inter_regular)
            ),

            text = buildAnnotatedString {

                append("Vidste du at\n\n")
                withStyle(
                    style = SpanStyle(
                        fontFamily = FontFamily(
                            Font(R.font.inter_bold)
                        )
                    )
                ) {
                    append("80%")
                }
                append(" bruger en BH\n")
                append("der ikke passer")

            }
        )

        // optææling af loadingscreen
        LaunchedEffect(Unit) {

            for (i in 1..100) {

                delay(50)

                counter += 1
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp)
                .padding(top = 480.dp)
                .height(10.dp)
                .background(Color.White.copy(alpha = 0.35f))
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(counter / 100f)
                    .height(10.dp)
                    .background(Color.White)
            )
        }

    }
}