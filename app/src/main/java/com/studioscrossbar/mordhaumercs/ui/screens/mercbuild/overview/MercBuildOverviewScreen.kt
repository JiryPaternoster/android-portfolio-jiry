package com.studioscrossbar.mordhaumercs.ui.screens.mercbuild.overview

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.studioscrossbar.mordhaumercs.ui.components.common.MercBuildListItemComponent
import com.studioscrossbar.mordhaumercs.ui.helpers.UiState
import com.studioscrossbar.mordhaumercs.ui.screens.common.LoadingScreen
import com.studioscrossbar.mordhaumercs.ui.screens.mercbuild.detail.MercBuildDetailScreen
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun MercBuildOverviewPage(onBuildClick : (Int) -> Unit, modifier: Modifier = Modifier, viewModel: MercBuildOverviewViewModel = koinViewModel()) {

    val uiState by viewModel.mercBuildOverviewUiState
    when(uiState){
        is UiState.Error -> TODO()
        UiState.Loading -> LoadingScreen("Loading builds...")
        is UiState.Success -> MercBuildOverviewScreen(onBuildClick, modifier, viewModel)
    }
}

@Composable
fun MercBuildOverviewScreen(onBuildClick : (Int) -> Unit, modifier: Modifier = Modifier, viewModel: MercBuildOverviewViewModel = koinViewModel()) {

    val builds by viewModel.builds

    Column(modifier = modifier.padding(16.dp)) {
        Row(horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
            .padding(bottom = 32.dp)
            .fillMaxWidth()
        ) {
            Text(text = "Discover", fontWeight = FontWeight.Bold, fontSize = 32.sp)
            Box { Icon(imageVector = Icons.Default.Search, contentDescription = "Search builds") }
        }

        LazyVerticalGrid(
            columns = GridCells.Adaptive(180.dp),
        ) {
            items(builds) { build ->
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(8.dp),
                ) {
                    MercBuildListItemComponent(buildItem = build, modifier = Modifier.clickable { println("You clicked me"); onBuildClick(build.id) })
                }
            }
        }
    }
}