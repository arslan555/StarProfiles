package com.core.network

import com.core.network.model.NetworkStarRepo

/**
 * Interface representing network calls to the Github Api backend
 */
interface ReposNetworkDataSource {
    suspend fun getStarRepos(language: String? = null) : NetworkStarRepo
}