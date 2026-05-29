package com.example.neveranother.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
//Storm
@Composable
fun OurMission(navController: NavHostController, vm: NAViewmodel) {

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
                painter = painterResource(id = R.drawable.om_os_billede),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.6f)
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 55.dp, top = 110.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "Om os",
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
                    text = "Vores mission",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 25.dp, bottom = 6.dp),

                    textAlign = TextAlign.Left,
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    color = Color.Black,
                    fontSize = 30.sp
                )

                Text(
                    text = "Vores mission er at skabe digitalt skræddersyede bh’er, " +
                            "der passer til hver enkelt persons unikke krop. " +
                            "Vi arbejder for, at alle skal kunne finde en bh, " +
                            "der både føles behagelig og passer perfekt." +
                            "\n\nMangfoldighed er fundamentet i alt, \nvi gør, " +
                            "for vi tror på, at ægte inklusion handler om at " +
                            "kunne imødekomme individuelle behov.",
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



                Text(
                    text = "Hvorfor skræddersyet",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 25.dp, bottom = 6.dp),

                    textAlign = TextAlign.Left,
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    color = Color.Black,
                    fontSize = 30.sp
                )

                Text(
                    text = "På grund af kapitalismens og fast fashions virkninger " +
                            "er størrelsesvalgene blevet reduceret \ntil et par " +
                            "standardiserede felter. Selvom branchen gør fremskridt med " +
                            "at vise mangfoldighed, har kun 12 % af befolkningen den " +
                            "kropstype, som standardstørrelsessystemer designer til.\n" +
                            "\nDe fleste standard-bh'er masseproduceres tankeløst til " +
                            "et snævert udvalg af kropstyper. Størrelser i butikkerne er " +
                            "baseret på kun to mål, og som følge heraf ender mange kvinder " +
                            "med at vælge bh'er i den forkerte størrelse og pasform, hvilket " +
                            "ærligt talt føles forfærdeligt at have på. Det får mange af os til " +
                            "at føle os som de mærkelige, fordi der tilsyneladende ikke er " +
                            "noget lavet til os. \n \nDerfor bringer NEVER ANOTHER " +
                            "skræddersyede produkter tilbage ved hjælp af innovative teknologier, " +
                            "der er tilgængelige i dag. Dette sikrer, at du bliver imødekommet," +
                            " og at du kan få produkter, som du vil elske og bruge konsekvent.\n",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 30.dp, end = 40.dp, bottom = 40.dp),

                    textAlign = TextAlign.Left,
                    fontFamily = FontFamily(Font(R.font.inter_medium)),
                    color = Color.Black,
                    fontSize = 18.sp
                )
            }
            Header(navController = navController)

            BackBTN(
                { navController.popBackStack() },
                color = Color.White
            )
        }
    }
}
