package com.studioscrossbar.mordhaumercs.navigation

// Root screens for Bottom Navigation
sealed class RootScreen(val route: String) {
    object Home : RootScreen("home_root")
    object Builds : RootScreen("builds_root")
    object Ideas : RootScreen("ideas_root")
    object Faq : RootScreen("faq_root")
}

// Leaf screens for each tab's navigation
sealed class LeafScreen(val route: String) {
    object Home : LeafScreen("home")
    object Builds : LeafScreen("builds")
    object BuildDetail : LeafScreen("build_detail/{buildId}") {
        fun createRoute(buildId: Int) = "build_detail/$buildId"
    }
    object Ideas : LeafScreen("ideas")
    object Faq : LeafScreen("faq")
}
