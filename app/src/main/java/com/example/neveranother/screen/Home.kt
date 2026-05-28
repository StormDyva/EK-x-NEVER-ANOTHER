package com.example.neveranother.screen


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.TextButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.style.TextAlign


@Composable
fun Home(navController: NavHostController, vm: NAViewmodel) {
    val verticalScroll = rememberScrollState()
    val screenHeight = LocalConfiguration.current.screenHeightDp.dp
    val backgroundColor = Color(0xFFF8F5F2)

    val braPictures = listOf(
        R.drawable.whitebrahbackground,
        R.drawable.blackbranobackground
    )

    val carrouselState = rememberPagerState(pageCount = { braPictures.size })

    Column(
        modifier = Modifier
            .verticalScroll(verticalScroll)
            .background(backgroundColor)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(screenHeight)
        )
        {

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
                    fontSize = 25.sp,
                    color = (Color(0xFFF8F5F2))
                )

            }
            CreateBraBTN(navController, vm)
        }
        Column(modifier = Modifier.background(backgroundColor)) {
            Box(modifier = Modifier.padding(20.dp)) {
                HorizontalPager(
                    state = carrouselState,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(20.dp))
                ) { page ->
                    Image(
                        painter = painterResource(id = braPictures[page]),
                        contentDescription = null,
                        modifier = Modifier.fillMaxWidth(),
                        contentScale = ContentScale.Crop
                    )
                }
                Row(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    braPictures.indices.forEach { index ->
                        Box(
                            modifier = Modifier
                                .size(8.dp)
                                .clip(CircleShape)
                                .background(
                                    if (carrouselState.currentPage == index) Color.Black else Color.White
                                )
                        )
                    }
                }
            }
            Row {
                Button(
                    onClick = { navController.navigate("GetStarted-screen") },
                    modifier = Modifier.padding(horizontal = 2.dp),
                    colors = ButtonDefaults.buttonColors(

                        containerColor = Color.Transparent

                    )
                ) {
                    Text(
                        "Læg i kurv",
                        color = Color.Black
                    )
                }
                Text(
                    text = "799 kr",
                    fontFamily = FontFamily(Font(R.font.nohemi_regular)),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = 60.dp)
                )
            }
            Image(
                painter = painterResource(id = R.drawable.skillelinje),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp)
            )
            Row(modifier = Modifier.fillMaxWidth()) {
                Spacer(modifier = Modifier.weight(1f))
                Image(
                    painter = painterResource(id = R.drawable.trustpilot),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(end = 20.dp)
                        .size(50.dp)
                )
            }
            Row {
                Text(
                    text = "KUNDEANMELDELSER",
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    modifier = Modifier.padding(horizontal = 25.dp)
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "Se alle", modifier = Modifier.padding(horizontal = 25.dp))

            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.reviewstars),
                    contentDescription = null,
                    modifier = Modifier.padding(10.dp)
                )
            }
            Box() {
                Image(
                    painter = painterResource(id = R.drawable.kundeanmeldelser),
                    contentDescription = null,
                    modifier = Modifier.padding(20.dp)
                )
            }
            Column(
            ) {
                Text(
                    text = "HVAD VORES KUNDER SIGER",
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    modifier = Modifier.padding(horizontal = 25.dp)
                )
                Box() {
                    Image(
                        painter = painterResource(id = R.drawable.review3),
                        contentDescription = null,
                        modifier = Modifier.padding(20.dp)
                    )
                }
                Box() {
                    Image(
                        painter = painterResource(id = R.drawable.review2),
                        contentDescription = null,
                        modifier = Modifier.padding(20.dp)
                    )
                }
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier
                            .background(Color.White, RoundedCornerShape(50.dp))
                            .padding(horizontal = 24.dp, vertical = 12.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("Vis flere")
                    }
                }
                Image(
                    painter = painterResource(id = R.drawable.skillelinje),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp)
                )
                Box() {
                    Image(
                        painter = painterResource(id = R.drawable.voresmission),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp)
                    )
                    Column(
                        modifier = Modifier
                            .padding(top = 30.dp)
                            .align(Alignment.TopCenter)

                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(
                                text = "Vores mission",
                                fontFamily = FontFamily(Font(R.font.inter_extrabold)),
                                color = Color.White,
                                fontSize = 40.sp
                            )
                        }
                    }
                    Column(
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                            .padding(28.dp)
                    ) {
                        Text(
                            text = "Vi designer BH'er til rigtige kroppe, lange dage og almindelige øjeblikke.",
                            fontFamily = FontFamily(Font(R.font.inter_extrabold)),
                            color = Color.White,
                            fontSize = 26.sp,
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        )
                        {
                            TextButton(
                                onClick = {
                                    navController.navigate("OurMission-screen")
                                }
                            ) {
                                Text(
                                    text = "Læs mere om os →",
                                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                                    color = Color(0xFFF8F5F2),
                                    fontSize = 12.sp,
                                )
                            }
                        }
                    }
                }

                Image(
                    painter = painterResource(id = R.drawable.skillelinje),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp)
                )

                Box() {
                    Image(
                        painter = painterResource(id = R.drawable.bookfitting),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp)
                    )
                    Column(
                        modifier = Modifier
                            .padding(top = 30.dp)
                            .align(Alignment.TopCenter)

                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(
                                text = "Book en gratis \ncustom BH \nfitting",
                                fontFamily = FontFamily(Font(R.font.inter_extrabold)),
                                color = Color.White,
                                fontSize = 40.sp
                            )
                        }
                    }
                    Column(
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                            .padding(28.dp)
                    ) {
                        Text(
                            text = "Har du problemer med at måle dig selv? Vi er her for at hjælpe",
                            fontFamily = FontFamily(Font(R.font.inter_extrabold)),
                            color = Color.White,
                            fontSize = 26.sp,
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {
                            TextButton(
                                onClick = {
                                    navController.navigate("BookFitting-screen")
                                }
                            ) {
                                Text(
                                    text = "Book en tid til fitting →",
                                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                                    color = Color(0xFFF8F5F2),
                                    fontSize = 12.sp,
                                )
                            }
                        }
                    }
                }

                Image(
                    painter = painterResource(id = R.drawable.skillelinje),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp)
                )

                Box() {
                    Image(
                        painter = painterResource(id = R.drawable.designogprodukt),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp)
                    )
                    Column(
                        modifier = Modifier
                            .padding(top = 30.dp)
                            .align(Alignment.TopCenter)

                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(
                                text = "Design & produkt",
                                fontFamily = FontFamily(Font(R.font.inter_extrabold)),
                                color = Color.White,
                                fontSize = 40.sp,
                            )
                        }
                    }
                    Column(
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                            .padding(28.dp)
                    ) {
                        Text(
                            text = "Designet i Danmark. \n3D-strikket i Holland med fokus på komfort, " +
                                    "kvalitet og ansvarlig produktion.",
                            fontFamily = FontFamily(Font(R.font.inter_extrabold)),
                            color = Color.White,
                            fontSize = 26.sp,
                            lineHeight = 40.sp
                        )
                        Spacer(modifier = Modifier.height(30.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {
                            TextButton(
                                onClick = {
                                    navController.navigate("DesignAndProduct-screen")
                                }
                            ) {
                                Text(
                                    text = "Mere om design & produkt →",
                                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                                    color = Color(0xFFF8F5F2),
                                    fontSize = 12.sp,
                                )
                            }
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(32.dp))
        }
    }
    Header(navController = navController)
}
