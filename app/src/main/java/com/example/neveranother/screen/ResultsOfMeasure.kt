package com.example.neveranother.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
    var selectedIndex by remember { mutableStateOf(0) }

    val images = listOf(
        R.drawable.white_bra_model,
        R.drawable.model_bra_black
    )
    val colorLabels = listOf("Hvid", "Sort")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF8F5F2))
    ) {

        Header(navController = navController)

        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(top = 50.dp)
                .padding(horizontal = 20.dp)
        ) {


            Text(
                text = buildAnnotatedString {
                    append("Du er Never Another's\nunikke ")
                    withStyle(SpanStyle(color = Color(0xFFE8957A))) {
                        append("Bra no. 167")
                    }
                },
                modifier = Modifier.fillMaxWidth(),
                fontFamily = FontFamily(Font(R.font.nohemi_bold)),
                fontSize = 22.sp,
                lineHeight = 28.sp,
                color = Color.Black,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(54.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Transparent)
            ) {
                MeasureRow("Øvre omkreds", "${vm.upperMeasure.value} cm")
                HorizontalDivider()
                MeasureRow("Nedre omkreds", "${vm.lowerMeasure.value} cm")
                HorizontalDivider()
                MeasureRow("Brystbredde", "${vm.breastWidth.value} cm")
                HorizontalDivider()
                MeasureRow("Brysthøjde", "${vm.breastHeight.value} cm")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(320.dp)
                        .clip(RoundedCornerShape(16.dp))
                ) {
                    Image(
                        painter = painterResource(id = images[selectedIndex]),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                    Text(
                        text = "799,00 kr",
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(10.dp)
                            .background(Color.White, RoundedCornerShape(8.dp))
                            .padding(horizontal = 10.dp, vertical = 4.dp),
                        fontFamily = FontFamily(Font(R.font.inter_regular)),
                        fontSize = 14.sp,
                        color = Color.Black
                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .border(1.dp, Color.DarkGray, RoundedCornerShape(15.dp))
                ) {
                    colorLabels.forEachIndexed { index, label ->
                        Box(
                            modifier = Modifier
                                .clickable { selectedIndex = index }
                                .background(
                                    if (selectedIndex == index) Color.DarkGray else Color.Transparent
                                )
                                .padding(horizontal = 24.dp, vertical = 8.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = label,
                                color = if (selectedIndex == index) Color.White else Color.Black,
                                fontFamily = FontFamily(Font(R.font.inter_regular)),
                                fontSize = 14.sp
                            )
                        }
                    }
                }
            }
        }
        AddToBasketBTN(navController, vm)
    }
}

@Composable
fun MeasureRow(
    title: String,
    value: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 14.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Spacer(modifier = Modifier.width(12.dp))

        Text(
            text = title,
            modifier = Modifier.weight(1f),
            fontFamily = FontFamily(Font(R.font.inter_semibold)),
            fontSize = 15.sp
        )

        Text(
            text = value,
            fontFamily = FontFamily(Font(R.font.inter_semibold)),
            fontSize = 15.sp
        )
    }
}