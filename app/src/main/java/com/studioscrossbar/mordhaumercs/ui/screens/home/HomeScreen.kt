package com.studioscrossbar.mordhaumercs.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.studioscrossbar.mordhaumercs.ui.components.common.BannerSlider

@Composable
fun HomeScreen() {
    Column {
        BannerSlider()
        Text(text = "Welcome to the mordhau mercs library", fontSize = 32.sp, fontWeight = FontWeight.Bold)
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}