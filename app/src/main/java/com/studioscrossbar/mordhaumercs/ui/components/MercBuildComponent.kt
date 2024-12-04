package com.studioscrossbar.mordhaumercs.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.studioscrossbar.mordhaumercs.data.BuildListItem

@Composable
fun MercBuildComponent(buildItem: BuildListItem, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier.size(180.dp)
            .border(
                width = 2.dp,
                color = Color.Red,
                shape = RoundedCornerShape(16.dp)
            )
    ){
        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
            AsyncImage(
                modifier = Modifier.height(140.dp),
                model = buildItem.imageLocation,
                contentDescription = buildItem.title,
            )
            HorizontalDivider()
            Text(text = buildItem.title)
        }


    }
}