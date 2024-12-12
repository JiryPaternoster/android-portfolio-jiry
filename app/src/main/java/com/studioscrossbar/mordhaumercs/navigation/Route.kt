package com.studioscrossbar.mordhaumercs.navigation

// Root screens for Bottom Navigation
sealed class RootScreen(val route: String) {
    data object Home : RootScreen("home_root")
    data object Builds : RootScreen("builds_root")
    data object Ideas : RootScreen("ideas_root")
    data object Faq : RootScreen("faq_root")
}

// Leaf screens for each tab's navigation
sealed class LeafScreen(val route: String) {
    data object Home : LeafScreen("home")
    data object Builds : LeafScreen("builds")
    data object BuildDetail : LeafScreen("build_detail/{buildId}") {
        fun createRoute(buildId: Int) = "build_detail/$buildId"
    }
    data object Ideas : LeafScreen("ideas")
    data object Faq : LeafScreen("faq")
}
