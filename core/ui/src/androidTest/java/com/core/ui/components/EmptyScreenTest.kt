package com.core.ui.components

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import com.core.ui.R
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class EmptyScreenTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun emptyScreenTest() {
        composeTestRule.setContent {
            EmptyScreen(onRetry = {})
        }

       ///  Assert the presence of LottieAnimation
        composeTestRule.onNodeWithTag("lottie_animation").assertIsDisplayed()

        // Assert the presence of Text with the given string resource
        composeTestRule.onNodeWithText(composeTestRule.activity.getString(R.string.no_data_available))
            .assertIsDisplayed()

        // Assert the presence of OutlinedButton
        composeTestRule.onNodeWithText(composeTestRule.activity.getString(R.string.retry))
            .assertIsDisplayed()
    }

    @Test
    fun emptyScreenRetryButtonTest() {
        var retryClicked = false

        composeTestRule.setContent {
            EmptyScreen(onRetry = { retryClicked = true })
        }

        // Perform a click on the Retry button
        composeTestRule.onNodeWithText(composeTestRule.activity.getString(R.string.retry))
            .performClick()

        // Assert that the retryClicked flag is set to true
        assertTrue(retryClicked)
    }
}

