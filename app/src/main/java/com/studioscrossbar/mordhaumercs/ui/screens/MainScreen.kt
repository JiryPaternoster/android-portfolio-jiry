package com.studioscrossbar.mordhaumercs.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph
import androidx.navigation.compose.rememberNavController
import com.studioscrossbar.mordhaumercs.navigation.AppNavGraph
import com.studioscrossbar.mordhaumercs.navigation.RootScreen
import com.studioscrossbar.mordhaumercs.ui.components.navigation.BottomNavBar
import com.studioscrossbar.mordhaumercs.ui.components.navigation.TopContextBar

@Composable
fun MainScreen() {
    val navController = rememberNavController() // Create NavController
    val currentSelectedScreen by navController.currentScreenAsState() // Observe current screen

    Scaffold(
        topBar = {
            TopContextBar(navController = navController)
        },
        bottomBar = {
            BottomNavBar(navController = navController, currentSelectedScreen = currentSelectedScreen)
        },
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(it) // To ensure content doesn't overlap with the bottom bar
        ) {
            AppNavGraph(navController = navController)
        }
    }
}



// Observe the current screen state
@Stable
@Composable
fun NavController.currentScreenAsState(): State<RootScreen> {
    val selectedItem = remember { mutableStateOf<RootScreen>(RootScreen.Home) }
    DisposableEffect(key1 = this) {
        val listener = NavController.OnDestinationChangedListener { _, destination, _ ->
            when {
                destination.hierarchy.any { it.route == RootScreen.Home.route } -> {
                    selectedItem.value = RootScreen.Home
                }
                destination.hierarchy.any { it.route == RootScreen.Builds.route } -> {
                    selectedItem.value = RootScreen.Builds
                }
                destination.hierarchy.any { it.route == RootScreen.Ideas.route } -> {
                    selectedItem.value = RootScreen.Ideas
                }
                destination.hierarchy.any { it.route == RootScreen.Faq.route } -> {
                    selectedItem.value = RootScreen.Faq
                }
            }
        }
        addOnDestinationChangedListener(listener)
        onDispose {
            removeOnDestinationChangedListener(listener)
        }
    }
    return selectedItem
}

