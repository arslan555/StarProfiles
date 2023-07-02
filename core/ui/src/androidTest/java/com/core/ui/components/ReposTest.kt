package com.core.ui.components

import androidx.activity.ComponentActivity
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.core.model.data.StarRepos
import org.junit.Rule

import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ReposTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun testRepos_Displayed() {
        val repos = listOf(
            StarRepos(
                name = "Repo Name 1",
                fullName = "Repo Full Name 1",
                description = "Repo Description 1",
                owner = StarRepos.Owner(avatarUrl = "https://example.com/avatar1"),
                language = "Kotlin",
                starsCount = 100
            ),
            StarRepos(
                name = "Repo Name 2",
                fullName = "Repo Full Name 2",
                description = "Repo Description 2",
                owner = StarRepos.Owner(avatarUrl = "https://example.com/avatar2"),
                language = "Java",
                starsCount = 200
            )
        )

        composeTestRule.setContent {
            Repos(modifier = Modifier, repos = repos)
        }

        // Assert the presence of UI elements for each repository item
        for (repo in repos) {
            repo.name?.let { composeTestRule.onNodeWithText(it).assertIsDisplayed() }
            repo.fullName?.let { composeTestRule.onNodeWithText(it).assertIsDisplayed() }
            // Add additional assertions specific to each repository item
        }
    }
}
