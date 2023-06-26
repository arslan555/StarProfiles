package com.core.data.repository

import com.core.model.data.StarRepos
import com.core.network.ReposNetworkDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * implementation of the [StarReposRepository].
 * Reads are from network storage to get updated data.
 */
class StarReposRepositoryImpl @Inject constructor(
    private val network: ReposNetworkDataSource
): StarReposRepository {
    override fun getStarReposStream(): Flow<List<StarRepos>> {
        TODO()
    }
}