package com.example.neveranother.screen

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.neveranother.R
import com.example.neveranother.components.BackBTN
import com.example.neveranother.components.Header
import com.example.neveranother.viewModel.NAViewmodel
//Simon
@Composable
fun Purchased(navController: NavHostController, vm: NAViewmodel){
    val backgroundImage = Image(
        painter = painterResource(id = R.drawable.takforditkoeb),
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Header(navController = navController)

        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                Spacer(modifier = Modifier.height(60.dp))
                Text(
                    text = "Tak for dit køb!",
                    fontFamily = FontFamily(Font(R.font.nohemi_bold)),
                    color = Color(0xFFF8F5F2),
                    fontSize = 45.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(20.dp))

                Text (text = "Din ordre er modtaget",
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    color = (Color(0xFFF8F5F2)),
                    fontSize = 35.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth())
                Spacer(modifier = Modifier.height(200.dp))
                Image(
                    painter = painterResource(id = R.drawable.fluemaerke),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(120.dp)
                )
            }
        }
    }
}