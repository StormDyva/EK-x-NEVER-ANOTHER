package com.example.neveranother.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withLink
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.neveranother.R
import com.example.neveranother.components.BackBTN
import com.example.neveranother.components.Header
import com.example.neveranother.viewModel.NAViewmodel

 @Composable
 fun BookFitting(navController: NavHostController, vm: NAViewmodel) {
     Box(
         modifier = Modifier
             .fillMaxSize()
             .background(Color(0xFFF8F5F2))
     ) {

         Column(
             modifier = Modifier
                 .fillMaxSize()
                 .verticalScroll(rememberScrollState())
         ) {
             Box(
                 modifier = Modifier
                     .fillMaxWidth()
                     .height(400.dp)
             ) {
                 Image(
                     painter = painterResource(id = R.drawable.book_fitting_billede),
                     contentDescription = null,
                     contentScale = ContentScale.Crop,
                     modifier = Modifier.fillMaxSize()
                 )
                 Column(
                     modifier = Modifier
                         .fillMaxWidth()
                         .align(Alignment.TopStart)
                         .padding(start = 55.dp, top = 125.dp),
                     horizontalAlignment = Alignment.Start
                 ) {
                     Text(
                         text = "Book en fitting",
                         fontFamily = FontFamily(Font(R.font.inter_semibold)),
                         color = Color.White,
                         fontSize = 40.sp
                     )
                     HorizontalDivider(
                         modifier = Modifier
                             .fillMaxWidth(0.33f)
                             .padding(top = 1.dp, start = 15.dp),
                         color = Color.White,
                         thickness = 2.dp
                     )

                 }
             }
             Spacer(modifier = Modifier.height(20.dp))

             Image(
                 painter = painterResource(id = R.drawable.icon_fitting),
                 contentDescription = "Ikoner for fitting information",
                 contentScale = ContentScale.FillWidth,
                 modifier = Modifier
                     .fillMaxWidth()
                     .padding(horizontal = 16.dp)
             )

             Spacer(modifier = Modifier.height(30.dp))

             Column(
                 modifier = Modifier
                     .fillMaxWidth()
                     .padding(horizontal = 30.dp)
             ) {
                 Text(
                     text = "Book en online fitting, hvor vi guider dig til at " +
                             "tage dine mål korrekt. Fittings foregår på dansk " +
                             "eller engelsk, og du skal blot bruge et blødt " +
                             "målebånd og din yndlings-bh.",
                     fontFamily = FontFamily(Font(R.font.inter_medium)),
                     fontSize = 20.sp,
                     lineHeight = 29.sp,
                     color = Color.Black
                 )

                 Spacer(modifier = Modifier.height(25.dp))

                 val annotatedLinkString = buildAnnotatedString {
                     append("Send os en besked ")

                     withLink(
                         LinkAnnotation.Url(
                             url = "mailto:info@neveranother.com?subject=Book%20en%20fitting",
                             styles = TextLinkStyles(
                                 style = SpanStyle(
                                     textDecoration = TextDecoration.Underline
                                 )
                             )
                         )
                     ) {
                         append("her.")
                     }
                 }

                 Text(
                     text = annotatedLinkString,
                     fontFamily = FontFamily(Font(R.font.inter_medium)), // Sat her, så hele teksten bruger den
                     fontSize = 20.sp,
                     lineHeight = 29.sp,
                     color = Color.Black
                 )
             }

             Spacer(modifier = Modifier.height(40.dp))
         }
         Header()

         BackBTN(
             { navController.popBackStack() },
             color = Color.White
         )
     }
 }