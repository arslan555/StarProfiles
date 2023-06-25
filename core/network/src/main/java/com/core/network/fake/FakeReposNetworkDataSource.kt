package com.core.network.fake

import com.core.common.Dispatcher
import com.core.common.SpDispatchers
import com.core.network.ReposNetworkDataSource
import com.core.network.model.NetworkStarRepo
import kotlinx.coroutines.CoroutineDispatcher

import kotlinx.serialization.json.Json
import javax.inject.Inject

class FakeReposNetworkDataSource @Inject constructor(
    @Dispatcher(SpDispatchers.IO) private val ioDispatcher: CoroutineDispatcher,
    private val networkJson: Json
): ReposNetworkDataSource {
    override suspend fun getStarRepos(language: String?): NetworkStarRepo {
        TODO("Not yet implemented")
    }
}