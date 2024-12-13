package com.studioscrossbar.mordhaumercs.ui.screens.home

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.studioscrossbar.mordhaumercs.testhelpers.scrollToNodeWithTextIfNeeded
import com.studioscrossbar.mordhaumercs.ui.theme.MordhauMercsTheme
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HomeScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun homeScreen_displaysWelcomeText() {
        composeTestRule.setContent {
            MordhauMercsTheme {
                HomeScreen(onGotoBuildsClick = {})
            }
        }

        composeTestRule.onNodeWithText("Welcome to the mordhau mercs library")
            .assertIsDisplayed()
    }

    @Test
    fun homeScreen_displaysBannerSlider() {
        composeTestRule.setContent {
            MordhauMercsTheme {
                HomeScreen(onGotoBuildsClick = {})
            }
        }

        composeTestRule.onNodeWithTag("BannerSlider")
            .assertIsDisplayed()
    }

    @Test
    fun homeScreen_displaysPhotoComments() {
        composeTestRule.setContent {
            MordhauMercsTheme {
                HomeScreen(onGotoBuildsClick = {})
            }
        }

        composeTestRule.scrollToNodeWithTextIfNeeded("Share Your Battle-Ready Mercenaries")
            .assertIsDisplayed()

        composeTestRule.scrollToNodeWithTextIfNeeded("Got a mercenary configuration that’s been leading you to victory? Share it with the Mordhau community and let others benefit from your battle-tested setups.")
            .assertIsDisplayed()

        composeTestRule.scrollToNodeWithTextIfNeeded("Discover New Configurations")
            .assertIsDisplayed()

        composeTestRule.scrollToNodeWithTextIfNeeded("Explore a wide range of mercenary configurations shared by fellow players. Find new strategies and tactics to enhance your gameplay.")
            .assertIsDisplayed()

        composeTestRule.scrollToNodeWithTextIfNeeded("Clone and Conquer")
            .assertIsDisplayed()

        composeTestRule.scrollToNodeWithTextIfNeeded("Found a mercenary configuration you like? Simply copy the config line and use it in your game. It’s never been easier to try out new setups.")
            .assertIsDisplayed()

        composeTestRule.scrollToNodeWithTextIfNeeded("Contribute to the Mordhau Community")
            .assertIsDisplayed()

        composeTestRule.scrollToNodeWithTextIfNeeded("By sharing your configurations and using others’, you’re contributing to a vibrant, collaborative Mordhau community.")
            .assertIsDisplayed()

        composeTestRule.scrollToNodeWithTextIfNeeded("Always Stay Updated")
            .assertIsDisplayed()

        composeTestRule.scrollToNodeWithTextIfNeeded("With new configurations being added regularly, there’s always something new to discover. Stay updated and keep your gameplay fresh and exciting.")
            .assertIsDisplayed()
    }

    @Test
    fun homeScreen_buttonNavigatesToBuilds() {
        var buttonClicked = false

        composeTestRule.setContent {
            MordhauMercsTheme {
                HomeScreen(onGotoBuildsClick = { buttonClicked = true })
            }
        }

        composeTestRule.onNodeWithText("Check out some builds!")
            .performScrollTo()
            .assertIsDisplayed()
            .performClick()

        assert(buttonClicked)
    }

    @Test
    fun homeScreen_displaysGradientBox() {
        composeTestRule.setContent {
            MordhauMercsTheme {
                HomeScreen(onGotoBuildsClick = {})
            }
        }

        composeTestRule.onNodeWithTag("GradientBox")
            .performScrollTo()
            .assertExists()
            .assertIsDisplayed()
    }
}


