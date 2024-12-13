package com.studioscrossbar.mordhaumercs.testhelpers

import androidx.compose.ui.test.SemanticsNodeInteraction
import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performScrollTo

fun ComposeTestRule.scrollToNodeWithTagIfNeeded(tag: String) : SemanticsNodeInteraction {
    return onNodeWithTag(tag)
        .performScrollTo()
}

fun ComposeTestRule.scrollToNodeWithTextIfNeeded(text: String) : SemanticsNodeInteraction {
    return onNodeWithText(text)
        .performScrollTo()
}
