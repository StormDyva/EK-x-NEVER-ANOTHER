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
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
        Column() {
            Box() {
                Image(
                    painter = painterResource(id = R.drawable.whitebra),
                    contentDescription = null,
                    modifier = Modifier.padding(20.dp)
                )
            }
            Row {
                Text(
                    text = "Læg i kurv",
                    modifier = Modifier.padding(horizontal = 25.dp)
                )
                Text(
                    text = "799 kr",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = 60.dp)
                )
            }
            Image(
                painter = painterResource(id = R.drawable.skillelinje),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp)
            )
            Row {
                Text(
                    text = "KUNDEANMELDELSER",
                    modifier = Modifier.padding(horizontal = 25.dp)
                )
                Text(text = "Se alle")

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
                    modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp)
                )
                Box() {
                    Image(
                        painter = painterResource(id = R.drawable.voresmission),
                        contentDescription = null,
                        modifier = Modifier.fillMaxWidth().padding(20.dp)
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 40.dp)

                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(
                                text = "Vores mission",
                                fontFamily = FontFamily(Font(R.font.nohemi_bold)),
                                color = (Color(0xFFF8F5F2)),
                                fontSize = 40.sp,
                            )
                        }
                    }
                }
                Box() {
                    Image(
                        painter = painterResource(id = R.drawable.voresmission),
                        contentDescription = null,
                        modifier = Modifier.fillMaxWidth().padding(20.dp)
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 40.dp)

                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(
                                text = "Vores mission",
                                fontFamily = FontFamily(Font(R.font.nohemi_bold)),
                                color = (Color(0xFFF8F5F2)),
                                fontSize = 40.sp,
                            )
                        }
                    }
                }
                Box() {
                    Image(
                        painter = painterResource(id = R.drawable.voresmission),
                        contentDescription = null,
                        modifier = Modifier.fillMaxWidth().padding(20.dp)
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 40.dp)

                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(
                                text = "Vores mission",
                                fontFamily = FontFamily(Font(R.font.nohemi_bold)),
                                color = (Color(0xFFF8F5F2)),
                                fontSize = 40.sp,
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(32.dp))
        }
    }
    Header()
}