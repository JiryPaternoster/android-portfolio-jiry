package com.studioscrossbar.mordhaumercs.ui.components.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import com.studioscrossbar.mordhaumercs.R
import com.studioscrossbar.mordhaumercs.navigation.RootScreen

@Composable
fun BottomNavBar(
    navController: NavController,
    currentSelectedScreen: RootScreen
) {
    NavigationBar {
        NavigationBarItem(
            selected = currentSelectedScreen == RootScreen.Home,
            onClick = { navController.navigateToRootScreen(RootScreen.Home) },
            alwaysShowLabel = true,
            label = { Text(text = stringResource(id = R.string.home_label)) },
            icon = { Icon(imageVector = Icons.Default.Home, contentDescription = "Home") }
        )
        NavigationBarItem(
            selected = currentSelectedScreen == RootScreen.Builds,
            onClick = { navController.navigateToRootScreen(RootScreen.Builds) },
            alwaysShowLabel = true,
            label = { Text(text = stringResource(id = R.string.builds_label)) },
            icon = { Icon(imageVector = Icons.Default.Build, contentDescription = "Builds") }
        )
//        NavigationBarItem(
//            selected = currentSelectedScreen == RootScreen.Ideas,
//            onClick = { navController.navigateToRootScreen(RootScreen.Ideas) },
//            alwaysShowLabel = true,
//            label = { Text(text = stringResource(id = R.string.ideas_label)) },
//            icon = { Icon(imageVector = Icons.Default.Create, contentDescription = "Ideas") }
//        )
//        NavigationBarItem(
//            selected = currentSelectedScreen == RootScreen.Faq,
//            onClick = { navController.navigateToRootScreen(RootScreen.Faq) },
//            alwaysShowLabel = true,
//            label = { Text(text = stringResource(id = R.string.faq_label)) },
//            icon = { Icon(imageVector = Icons.Default.Call, contentDescription = "FAQ") }
//        )
    }
}

// Helper extension to handle navigation for root screens
private fun NavController.navigateToRootScreen(rootScreen: RootScreen) {
    navigate(rootScreen.route) {
        launchSingleTop = true
        restoreState = true
        popUpTo(graph.findStartDestination().id) {
            saveState = true
        }
    }
}