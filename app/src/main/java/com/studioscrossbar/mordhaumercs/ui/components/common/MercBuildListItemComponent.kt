package com.studioscrossbar.mordhaumercs.ui.components.common

import androidx.compose.foundation.background
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.studioscrossbar.mordhaumercs.data.BuildListItem
import com.studioscrossbar.mordhaumercs.ui.theme.GreyBackground

@Composable
fun MercBuildListItemComponent(buildItem: BuildListItem, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.size(180.dp)
            .background(
                color = GreyBackground,
                shape = RoundedCornerShape(16.dp)
            )
    ){
        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
            AsyncImage(
                modifier = Modifier.height(140.dp),
                model = buildItem.imageLocation,
                contentDescription = buildItem.title,
                contentScale = ContentScale.Fit
            )
            HorizontalDivider()
            Text(text = buildItem.title)
            Text(text = "By ${buildItem.username}")
        }


    }
}