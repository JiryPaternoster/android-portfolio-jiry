package com.studioscrossbar.mordhaumercs.ui.screens.faq

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FAQScreen() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Welcome to FAQ!")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewFAQScreen() {
    FAQScreen()
}