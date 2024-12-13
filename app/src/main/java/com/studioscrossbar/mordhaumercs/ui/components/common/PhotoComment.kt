package com.studioscrossbar.mordhaumercs.ui.components.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.studioscrossbar.mordhaumercs.ui.theme.GreyBackground

@Composable
fun PhotoComment(painterResource : Painter, title : String, comment : String, imagePositionLeft : Boolean = true, modifier: Modifier = Modifier) {

    val configuration = LocalConfiguration
    val screenWidth = configuration.current.screenWidthDp

    val fortyVw = screenWidth * 0.4f
    val sixtyVw = screenWidth * 0.5f
    val tenVw = screenWidth * 0.1f


    Row(modifier = modifier.background(if(imagePositionLeft) GreyBackground else MaterialTheme.colorScheme.background).fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {

        if(imagePositionLeft){
            Image(
                painter = painterResource,
                contentDescription = comment,
                modifier = Modifier.width(fortyVw.dp),
            )
            Spacer(Modifier.width(tenVw.dp))
            Column(modifier = Modifier.width(sixtyVw.dp)) {
                Text(text = title, fontSize = 24.sp, fontWeight = FontWeight.Bold)
                Spacer(Modifier.height(10.dp))
                Text(text = comment, fontSize = 16.sp)
            }
        }
        else{
            Column(modifier = Modifier.width(sixtyVw.dp)) {
                Text(text = title, fontSize = 24.sp, fontWeight = FontWeight.Bold)
                Spacer(Modifier.height(10.dp))
                Text(text = comment, fontSize = 16.sp)
            }
            Spacer(Modifier.width(tenVw.dp))
            Image(
                painter = painterResource,
                contentDescription = comment,
                modifier = Modifier.width(fortyVw.dp),
            )
        }



    }
}