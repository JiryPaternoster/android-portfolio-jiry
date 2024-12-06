package com.studioscrossbar.mordhaumercs.ui.screens.mercbuild.detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.studioscrossbar.mordhaumercs.ui.theme.GreyBackground
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.parameter.parametersOf


@Composable
fun MercBuildDetailScreen(buildId: Int, modifier: Modifier = Modifier, viewModel : MercBuildDetailViewModel = koinViewModel(parameters = { parametersOf(buildId) })) {
        val build by viewModel.build

        val configuration = LocalConfiguration.current
        val screenHeightDp: Dp = configuration.screenHeightDp.dp
        val screenWidthDp : Dp = configuration.screenWidthDp.dp;
        val fiftyVh = screenHeightDp * 0.5f
        val seventyVw = screenWidthDp * 0.8f

        if(build != null){
                Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier.fillMaxSize()) {
                        Text(text = build!!.title,fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
                        AsyncImage(
                                modifier = Modifier.height(fiftyVh),
                                model = build!!.imageLocation,
                                contentDescription = build!!.title,
                                contentScale = ContentScale.Fit
                        )
                        Spacer(modifier = Modifier.size(50.dp))
                        Box(modifier = Modifier.width(seventyVw).background(color = GreyBackground, shape = RoundedCornerShape(16.dp))){
                                Text(text = build!!.configlines)
                        }

                }
        }

}
