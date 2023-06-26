package com.core.data.repository

import com.core.model.data.StarRepos
import kotlinx.coroutines.flow.Flow

interface StarReposRepository {
    /**
     * Gets the available github star repos as a stream
     */
    fun getStarReposStream(): Flow<List<StarRepos>>

}