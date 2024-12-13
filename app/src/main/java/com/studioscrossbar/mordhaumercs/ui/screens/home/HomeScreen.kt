package com.studioscrossbar.mordhaumercs.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.studioscrossbar.mordhaumercs.R
import com.studioscrossbar.mordhaumercs.ui.components.common.BannerSlider
import com.studioscrossbar.mordhaumercs.ui.components.common.PhotoComment
import com.studioscrossbar.mordhaumercs.ui.theme.CoolYellow

@Composable
fun HomeScreen(onGotoBuildsClick : () -> Unit, modifier: Modifier = Modifier) {

    val scrollState = rememberScrollState()

    val gradient = Brush.linearGradient(
        colors = listOf(
            Color(34, 52, 174),
            Color(36, 36, 36)
        ),
        start = Offset.Zero,
        end = Offset.Infinite
    )


    Column(modifier = modifier.padding(16.dp).verticalScroll(scrollState)) {
        Text(text = "Welcome to the mordhau mercs library", fontSize = 32.sp, fontWeight = FontWeight.Bold)
        BannerSlider()
        Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
            PhotoComment(painterResource(R.drawable.mordhaubanner0), "Share Your Battle-Ready Mercenaries","Got a mercenary configuration that’s been leading you to victory? Share it with the Mordhau community and let others benefit from your battle-tested setups.")
            PhotoComment(painterResource(R.drawable.mordhaubanner1), "Discover New Configurations","Explore a wide range of mercenary configurations shared by fellow players. Find new strategies and tactics to enhance your gameplay.", false)
            PhotoComment(painterResource(R.drawable.mordhaubanner2), "Clone and Conquer","Found a mercenary configuration you like? Simply copy the config line and use it in your game. It’s never been easier to try out new setups.", )
            PhotoComment(painterResource(R.drawable.mordhaubanner3), "Contribute to the Mordhau Community","By sharing your configurations and using others’, you’re contributing to a vibrant, collaborative Mordhau community.", false)
            PhotoComment(painterResource(R.drawable.mordhaubanner4), "Always Stay Updated","With new configurations being added regularly, there’s always something new to discover. Stay updated and keep your gameplay fresh and exciting.", )
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(320.dp)
                .background(
                   gradient
                ),
                contentAlignment = Alignment.Center
            ){
                Column {
                    Button(onClick = { onGotoBuildsClick() }, colors = ButtonDefaults.buttonColors(
                        containerColor = CoolYellow
                    )) {
                        Text(text = "Check out some builds!")
                    }
                }

            }

        }


    }

}
