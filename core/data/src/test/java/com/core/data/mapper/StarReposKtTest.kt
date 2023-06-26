package com.core.data.mapper

import com.core.network.model.NetworkStarRepo
import org.junit.Assert.*

import org.junit.Test

class StarReposKtTest {

    @Test
    fun networkStarRepos_can_be_mapped_StarRepo() {
        val networkModel = NetworkStarRepo.Item(
            id = 0,
            name = "Kotlin",
            full_name = "Kotlin/jetbrains",
            description = "Kotlin official repo",
            stargazers_count = 100,
            language = "kotlin",
            owner = NetworkStarRepo.Item.Owner(
                id = 2,
                avatar_url = "https://avatars.githubusercontent.com/u/878437?v=4",
                html_url = "https://github.com/JetBrains"
            )
        )
        val entity = networkModel.asEntity()

        assertEquals(0, entity.id)
        assertEquals("Kotlin", entity.name)
        assertEquals("Kotlin/jetbrains", entity.fullName)
        assertEquals("Kotlin official repo", entity.description)
        assertEquals(100, entity.starsCount)
        assertEquals("kotlin", entity.language)
        assertEquals(2, entity.owner?.id)
        assertEquals("https://avatars.githubusercontent.com/u/878437?v=4", entity.owner?.avatarUrl)
        assertEquals("https://github.com/JetBrains", entity.owner?.htmlUrl)

    }
}