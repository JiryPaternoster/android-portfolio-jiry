package com.studioscrossbar.mordhaumercs.ui.components.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState


@Composable
fun TopContextBar(navController: NavController, modifier: Modifier = Modifier) {
    val configuration = LocalConfiguration.current
    val screenHeightDp: Dp = configuration.screenHeightDp.dp

    val fiveVh = screenHeightDp * 0.05f

    val currentBackStackEntry by navController.currentBackStackEntryAsState()
    val hasBackStackEntry = currentBackStackEntry?.destination?.route != null &&
            navController.previousBackStackEntry != null


    Column {
        Row(modifier = Modifier.fillMaxWidth().padding(16.dp).height(fiveVh), verticalAlignment = Alignment.CenterVertically){

//        Image(
//            painter = painterResource(id = R.drawable.logo),
//            contentDescription = "MordhauMercs Logo"
//        )
            if(hasBackStackEntry){
                IconButton(onClick = {navController.popBackStack()}) {
                    Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                }
            }

            Text(text = "MordhauMercs", fontWeight = FontWeight.Bold, fontSize = 29.sp, textAlign = TextAlign.Center, modifier = Modifier.weight(1f))
        }
        HorizontalDivider(modifier = Modifier.fillMaxWidth())
    }


}
