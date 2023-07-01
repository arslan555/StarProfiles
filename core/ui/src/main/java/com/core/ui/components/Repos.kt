package com.core.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.core.model.data.StarRepos


@Composable
fun Repos(modifier: Modifier, repos: List<StarRepos>) {
    LazyColumn(modifier = modifier) {
        items(repos) {starRepo->
            ExpandableRepo(modifier = Modifier,starRepo)
        }
    }
}


@Composable
@Preview
fun previewRepos() {
        Repos(modifier = Modifier, repos = listOf(
            StarRepos(
                id = 0,
                name = null,
                fullName = null,
                description = "Kotlin official repo",
                starsCount = 45016,
                language = "kotlin",
                owner = StarRepos.Owner(
                    id = 2,
                    avatarUrl = null,
                    htmlUrl = "https://github.com/JetBrains"
                )
            ),
            StarRepos(
                id = 1,
                name = null,
                fullName = null,
                description = "The Kotlin Programming Language.",
                starsCount = 1233,
                language = "kotlin",
                owner = StarRepos.Owner(
                    id = 2,
                    avatarUrl = null,
                    htmlUrl = "https://github.com/JetBrains"
                )
            )
        ))
}