package com.core.ui.components

import androidx.activity.ComponentActivity
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.core.model.data.StarRepos
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExpandableRepoTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()


    @Test
    fun expandableRepo_Expanded() {
        val starRepo = StarRepos(
            name = "Repo Name",
            fullName = "Repo Full Name",
            description = "Repo Description",
            owner = StarRepos.Owner(avatarUrl = "https://example.com/avatar"),
            language = "Kotlin",
            starsCount = 100
        )

        composeTestRule.setContent {
            ExpandableRepo(modifier = Modifier, starRepo = starRepo)
        }

        // Assert the presence of UI elements when collapsed
        composeTestRule.onNodeWithText("Repo Name").assertIsDisplayed()
        composeTestRule.onNodeWithText("Repo Full Name").assertIsDisplayed()

        // Perform actions to toggle the expanded state by clicking on the main node
        composeTestRule.onNodeWithTag("repo").performClick()

        // Verify the expected behavior after toggling the expanded state
        // For example, assert the absence of certain UI elements when collapsed
        composeTestRule.onNodeWithText("Repo Description").assertIsDisplayed()
        composeTestRule.onNodeWithText("Kotlin").assertIsDisplayed()
        composeTestRule.onNodeWithText("100").assertIsDisplayed()
    }

    @Test
    fun expandableRepo_Collapsed() {
        val starRepo = StarRepos(
            name = "Repo Name",
            fullName = "Repo Full Name",
            description = "Repo Description",
            owner = StarRepos.Owner(avatarUrl = "https://example.com/avatar"),
            language = "Kotlin",
            starsCount = 100
        )

        composeTestRule.setContent {
            ExpandableRepo(modifier = Modifier, starRepo = starRepo)
        }

        // Assert the presence of UI elements when collapsed
        composeTestRule.onNodeWithText("Repo Name").assertIsDisplayed()
        composeTestRule.onNodeWithText("Repo Full Name").assertIsDisplayed()
    }

}