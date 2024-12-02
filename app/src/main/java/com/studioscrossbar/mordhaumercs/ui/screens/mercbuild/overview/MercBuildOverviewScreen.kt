package com.studioscrossbar.mordhaumercs.ui.screens.mercbuild.overview

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil3.compose.AsyncImage
import com.studioscrossbar.mordhaumercs.network.api.ApiClient

@Composable
fun MercBuildOverviewScreen(modifier: Modifier = Modifier, viewModel: MercBuildOverviewViewModel = viewModel()) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "This is inside the column")
        Box(modifier = Modifier.size(180.dp).background(Color.Red)){
            Column{
                AsyncImage(
                    modifier = Modifier.height(140.dp),
                    model = "https://i.imgur.com/wqy6lVV.png",
                    contentDescription = null,
                )
                HorizontalDivider()
                Text(text = "Shrek")
            }


        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMercBuildOverviewScreen() {
    MercBuildOverviewScreen(modifier = Modifier.fillMaxSize())
}