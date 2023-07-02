package com.core.ui.components

import ErrorScreen
import androidx.activity.ComponentActivity
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.core.ui.R
import org.junit.Assert
import org.junit.Rule
import org.junit.Test

class ErrorScreenTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun testErrorScreen() {
        composeTestRule.setContent {
            ErrorScreen(onRetry = {})
        }

        // Assert the presence of UI elements using the composeTestRule
        composeTestRule.onNodeWithText(composeTestRule.activity.getString(R.string.something_went_wrong)).assertIsDisplayed()
        composeTestRule.onNodeWithText(composeTestRule.activity.getString(R.string.blocking_signal)).assertIsDisplayed()
        composeTestRule.onNodeWithText(composeTestRule.activity.getString(R.string.retry)).assertIsDisplayed()
    }
    @Test
    fun testErrorScreenRetryButton() {
        var retryClicked = false

        composeTestRule.setContent {
            EmptyScreen(onRetry = { retryClicked = true })
        }

        // Perform a click on the Retry button
        composeTestRule.onNodeWithText(composeTestRule.activity.getString(R.string.retry))
            .performClick()

        // Assert that the retryClicked flag is set to true
        Assert.assertTrue(retryClicked)
    }
}