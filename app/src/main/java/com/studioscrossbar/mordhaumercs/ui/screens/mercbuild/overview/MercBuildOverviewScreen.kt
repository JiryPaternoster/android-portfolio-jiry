package com.studioscrossbar.mordhaumercs.ui.screens.mercbuild.overview

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.studioscrossbar.mordhaumercs.ui.components.MercBuildComponent
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun MercBuildOverviewScreen(modifier: Modifier = Modifier, viewModel: MercBuildOverviewViewModel = koinViewModel()) {

    val builds by viewModel.builds

    Column(modifier = Modifier.padding(16.dp)) {
        Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.padding(32.dp).fillMaxWidth()) {
            Text(text = "Discover", fontWeight = FontWeight.Bold, fontSize = 32.sp)
            Box { Icon(imageVector = Icons.Default.Search, contentDescription = "Search builds") }
        }
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = modifier
        ) {
            items(builds) { build ->
                MercBuildComponent(buildItem = build)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMercBuildOverviewScreen() {
    MercBuildOverviewScreen(modifier = Modifier.fillMaxSize())
}