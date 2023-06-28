package com.core.data.repository

import com.core.data.mapper.asEntity
import com.core.model.data.StarRepos
import com.core.network.ReposNetworkDataSource
import com.core.network.model.NetworkStarRepo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * implementation of the [StarReposRepository].
 * Reads are from network storage to get updated data.
 */
class StarReposRepositoryImpl @Inject constructor(
    private val network: ReposNetworkDataSource
): StarReposRepository {
    override fun getStarReposStream(): Flow<List<StarRepos>> =
        flow {
            val networkStarRepo: NetworkStarRepo = network.getStarRepos("kotlin=+sort:stars")
            val starRepose = arrayListOf<StarRepos>()
            networkStarRepo.items?.forEach { repos ->
                repos?.asEntity()?.let { starRepose.add(it) }
            }
            emit(starRepose)
        }
}