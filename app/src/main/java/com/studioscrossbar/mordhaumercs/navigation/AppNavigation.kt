package com.studioscrossbar.mordhaumercs.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.studioscrossbar.mordhaumercs.ui.screens.faq.FAQScreen
import com.studioscrossbar.mordhaumercs.ui.screens.home.HomeScreen
import com.studioscrossbar.mordhaumercs.ui.screens.ideas.IdeasScreen
import com.studioscrossbar.mordhaumercs.ui.screens.mercbuild.overview.MercBuildOverviewScreen


@Composable
fun AppNavGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = RootScreen.Home.route
    ) {
        addHomeRoute(navController)
        addBuildsRoute(navController)
        addIdeasRoute(navController)
        addFaqRoute(navController)
    }
}

// Home navigation
private fun NavGraphBuilder.addHomeRoute(navController: NavController) {
    navigation(
        route = RootScreen.Home.route,
        startDestination = LeafScreen.Home.route
    ) {
        composable(route = LeafScreen.Home.route) {
             HomeScreen()
        }
    }
}

// Builds navigation
private fun NavGraphBuilder.addBuildsRoute(navController: NavController) {
    navigation(
        route = RootScreen.Builds.route,
        startDestination = LeafScreen.Builds.route
    ) {
        composable(route = LeafScreen.Builds.route) {
            MercBuildOverviewScreen()
        }
    }
}

// Ideas navigation
private fun NavGraphBuilder.addIdeasRoute(navController: NavController) {
    navigation(
        route = RootScreen.Ideas.route,
        startDestination = LeafScreen.Ideas.route
    ) {
        composable(route = LeafScreen.Ideas.route) {
            IdeasScreen()
        }
    }
}

// FAQ navigation
private fun NavGraphBuilder.addFaqRoute(navController: NavController) {
    navigation(
        route = RootScreen.Faq.route,
        startDestination = LeafScreen.Faq.route
    ) {
        composable(route = LeafScreen.Faq.route) {
            FAQScreen()
        }
    }
}