package com.example.neveranother.screen

import android.widget.VideoView
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavHostController
import com.example.neveranother.viewModel.NAViewmodel
import com.example.neveranother.R
import androidx.compose.ui.platform.LocalContext
import androidx.core.net.toUri
import com.example.neveranother.components.BackBTN

@Composable
fun InfoVideoNR4(
    navController: NavHostController,
    vm: NAViewmodel
) {
    val context = LocalContext.current

    val videoUri = "android.resource://${context.packageName}/${R.raw.measure_video_4}".toUri()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        AndroidView(
            modifier = Modifier.fillMaxSize(),
            factory = { context ->
                VideoView(context).apply {
                    setVideoURI(videoUri)
                    start()
                }
            }
        )
    }
    BackBTN(
        { navController.popBackStack() },
        color = Color.White
    )
}