package com.example.neveranother.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.neveranother.R
import com.example.neveranother.components.AddToBasketBTN
import com.example.neveranother.components.BackBTN
import com.example.neveranother.components.Header
import com.example.neveranother.viewModel.NAViewmodel

@Composable
fun ResultsOfMeasure(
    navController: NavHostController,
    vm: NAViewmodel
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF8F5F2))
    ) {

        // HEADER
        Header()

        BackBTN(
            { navController.popBackStack() },
            color = Color.White
        )

        // MAIN CONTENT
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {

            // RESULT CARD
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(48.dp)
                            .background(Color(0xFFF7E6E0), CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "✓",
                            fontSize = 26.sp,
                            color = Color.Black
                        )
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    Column {
                        Text(
                            text = "Resultatet af dine mål",
                            fontFamily = FontFamily(Font(R.font.nohemi_bold)),
                            fontSize = 22.sp,
                            color = Color.Black
                        )

                        Text(
                            text = "Vi har regnet på målene og kan nu lave din perfekte BH",
                            fontFamily = FontFamily(Font(R.font.inter_regular)),
                            fontSize = 14.sp,
                            lineHeight = 18.sp,
                            color = Color.Black
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(18.dp))

            // BRA NUMBER TEXT
            Text(
                text = buildAnnotatedString {
                    append("Du er Never Another's\nunikke ")

                    withStyle(
                        SpanStyle(color = Color(0xFFE8957A))
                    ) {
                        append("Bra n. 102")
                    }
                },
                modifier = Modifier.fillMaxWidth(),
                fontFamily = FontFamily(Font(R.font.nohemi_bold)),
                fontSize = 22.sp,
                lineHeight = 28.sp,
                color = Color.Black,
                textAlign = TextAlign.Center
            )

            Text(
                text = "♥",
                modifier = Modifier.fillMaxWidth(),
                fontSize = 16.sp,
                color = Color(0xFFE8957A),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(12.dp))

            // MEASUREMENTS CARD
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                MeasureRow(
                    R.drawable.upper_measure,
                    "Øvre omkreds",
                    "101 cm"
                )

                HorizontalDivider()

                MeasureRow(
                    R.drawable.lower_measure,
                    "Nedre omkreds",
                    "82 cm"
                )

                HorizontalDivider()

                MeasureRow(
                    R.drawable.upper_measure,
                    "Brystbredde",
                    "32 cm"
                )

                HorizontalDivider()

                MeasureRow(
                    R.drawable.lower_measure,
                    "Brysthøjde",
                    "33 cm"
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // PRODUCT IMAGE
            Image(
                painter = painterResource(id = R.drawable.model_bra),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp)
                    .clip(RoundedCornerShape(16.dp)),
                contentScale = ContentScale.Crop
            )
        }


        Row(

            modifier = Modifier

                .fillMaxWidth()

                .padding(horizontal = 20.dp)

                .padding(bottom = 16.dp)

        ) {

            // VENSTRE SIDE

            Card(

                modifier = Modifier

                    .weight(1f)

                    .height(56.dp),

                shape = RoundedCornerShape(

                    topStart = 16.dp,

                    bottomStart = 16.dp

                ),

                colors = CardDefaults.cardColors(

                    containerColor = Color.Black

                )

            ) {

                Box(

                    modifier = Modifier.fillMaxSize(),

                    contentAlignment = Alignment.Center

                ) {

                    Text(

                        text = "799,00 kr",

                        color = Color.White,

                        fontSize = 18.sp

                    )

                }

            }
            Card(

                modifier = Modifier

                    .weight(1f)

                    .height(56.dp),

                shape = RoundedCornerShape(

                    topEnd = 16.dp,

                    bottomEnd = 16.dp

                ),

                colors = CardDefaults.cardColors(

                    containerColor = Color(0xFFE8957A)

                )

            ){AddToBasketBTN(navController, vm)}

            // ADD TO BASKET BUTTON

        }
    }
}

@Composable
fun MeasureRow(
    icon: Int,
    title: String,
    value: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 14.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = null,
            modifier = Modifier.size(24.dp)
        )

        Spacer(modifier = Modifier.width(12.dp))

        Text(
            text = title,
            modifier = Modifier.weight(1f),
            fontFamily = FontFamily(Font(R.font.inter_regular)),
            fontSize = 14.sp
        )

        Text(
            text = value,
            fontFamily = FontFamily(Font(R.font.inter_regular)),
            fontSize = 14.sp
        )
    }
}