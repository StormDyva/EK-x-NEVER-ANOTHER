package com.example.neveranother.screen

import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import com.example.neveranother.components.Header
import com.example.neveranother.viewModel.NAViewmodel

@Composable

fun DesignAndProduct(navController: NavHostController, vm: NAViewmodel) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF8F5F2))
            .verticalScroll(rememberScrollState())
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF8F5F2))
        ) {

            Image(
                painter = painterResource(id = R.drawable.production),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.6f)
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 38.dp, top = 110.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "Design & produkt",
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    color = Color.White,
                    fontSize = 40.sp
                )

                HorizontalDivider(
                    modifier = Modifier
                        .fillMaxWidth(0.33f)
                        .padding(top = 1.dp, start = 15.dp), color = Color.White,
                    thickness = 2.dp
                )

            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 530.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "Design og produktion",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 27.dp, bottom = 6.dp),

                    textAlign = TextAlign.Left,
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    color = Color.Black,
                    fontSize = 30.sp
                )

                Text(
                    text = "NEVER ANOTHER BH'en blev designet i Danmark med " +
                            "hjælp fra utallige workshopdeltagere, respondenter " +
                            "i undersøgelser og testpiloter. Vores forsknings- " +
                            "og udviklingsfase har varet 2 år og produceret mere " +
                            "end 50 prototyper, hvilket har ført os til det rette " +
                            "design, tekstilsammensætning og funktionalitet. " +
                            "\n\nBh'en er strikket i ét stykke og fremstilles af " +
                            "vores dygtige produktionspartner i Holland, som " +
                            "har været en del af vores rejse og forsknings- og " +
                            "udviklingsproces fra starten. \n\nVores valg af " +
                            "produktionspartner afspejler vores engagement " +
                            "i produkter af høj kvalitet, ordentligt arbejde" +
                            " og ansvarlig produktion.",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 30.dp, end = 38.dp),

                    textAlign = TextAlign.Left,
                    fontFamily = FontFamily(Font(R.font.inter_medium)),
                    color = Color.Black,
                    fontSize = 18.sp
                )
                HorizontalDivider(
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                        .padding(top = 50.dp, bottom = 50.dp), color = (Color(0xFFD3D1D1)),
                    thickness = 1.5.dp
                )

                Column() {
                    Text(
                        text = "Materiale sammensætning",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 14.dp),
                        fontFamily = FontFamily(Font(R.font.inter_semibold)),
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(
                            modifier = Modifier,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "Blanding",
                                fontFamily = FontFamily(Font(R.font.inter_extrabold)),
                            )

                            Column(modifier = Modifier,
                                horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = "41% Filea cupro"
                                )
                                Text(
                                    text = "25% Elastane"
                                )
                            }
                        }


                        Column(
                            modifier = Modifier,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "Sort",
                                fontFamily = FontFamily(Font(R.font.inter_extrabold)),
                            )
                            Text(
                                text = "34% Otex Nylon"
                            )
                        }


                        Column(
                            modifier = Modifier,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "Hvid",
                                fontFamily = FontFamily(Font(R.font.inter_extrabold)),
                            )
                            Text(
                                text = "34% Sensil Nylon"
                            )

                        }
                    }
                }
                HorizontalDivider(
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                        .padding(top = 50.dp, bottom = 50.dp), color = (Color(0xFFD3D1D1)),
                    thickness = 1.5.dp
                )



                Text(
                    text = "Den digitale skrædder",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 28.dp, bottom = 6.dp),

                    textAlign = TextAlign.Left,
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    color = Color.Black,
                    fontSize = 30.sp
                )

                Text(
                    text = "Vores teknologi fungerer som en digital skrædder, " +
                            "der intelligent tilpasser bh'er uden bøjler, så " +
                            "de passer til hver enkelt person. \n\nVores" +
                            " videovejledninger guider dig gennem" +
                            " selvmålingsprocessen. Vores proprietære " +
                            "størrelsesalgoritme bruger disse mål til at " +
                            "ændre designets dimensioner og sikre, at du " +
                            "får den bedst mulige pasform. Bh'en produceres " +
                            "på en digital strikkemaskine, hvilket skaber vores " +
                            "sømløse, 3D-strikkede produkter.\n\nDenne " +
                            "teknologi giver os mulighed for at skabe " +
                            "en personlig pasform, samtidig med at vi reducerer " +
                            "spild og overproduktion.",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 30.dp, end = 40.dp, bottom = 75.dp),

                    textAlign = TextAlign.Left,
                    fontFamily = FontFamily(Font(R.font.inter_medium)),
                    color = Color.Black,
                    fontSize = 18.sp
                )
            }
            Header()

            BackBTN(
                { navController.popBackStack() },
                color = Color.White
            )
        }
    }
}