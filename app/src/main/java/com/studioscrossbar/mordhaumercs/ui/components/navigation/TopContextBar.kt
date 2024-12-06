package com.studioscrossbar.mordhaumercs.ui.components.navigation

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun TopContextBar(navController: NavController, modifier: Modifier = Modifier) {
    val configuration = LocalConfiguration.current
    val screenHeightDp: Dp = configuration.screenHeightDp.dp

    val fiveVh = screenHeightDp * 0.05f

//    val hasPreviousBackStack by remember{ derivedStateOf {  (navController.previousBackStackEntry != null) } }

    Row(modifier = Modifier.padding(16.dp).height(fiveVh), verticalAlignment = Alignment.CenterVertically){
//        Image(
//            painter = painterResource(id = R.drawable.logo),
//            contentDescription = "MordhauMercs Logo"
//        )


//        if(hasPreviousBackStack){
//            IconButton(onClick = {navController.popBackStack()}) {
//                Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
//            }
//        }

        Text(text = "MordhauMercs", fontWeight = FontWeight.Bold, fontSize = 29.sp)
        HorizontalDivider(modifier = Modifier.align(Alignment.Bottom).fillMaxWidth())
    }
}
