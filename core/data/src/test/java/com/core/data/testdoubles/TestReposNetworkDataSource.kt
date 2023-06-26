package com.core.data.testdoubles

import com.core.network.ReposNetworkDataSource
import com.core.network.fake.FakeDataSource
import com.core.network.model.NetworkStarRepo
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json


/**
 * Test double for [ReposNetworkDataSource]
 */
class TestReposNetworkDataSource : ReposNetworkDataSource {

    private val networkJson = Json
    override suspend fun getStarRepos(language: String?): NetworkStarRepo =
        networkJson.decodeFromString(FakeDataSource.repos)
}