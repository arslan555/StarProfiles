package com.arslan.repo.trending.repository

import com.core.data.repository.StarReposRepository
import com.core.model.data.StarRepos
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow

class TestStarReposRepository: StarReposRepository {
    private val starReposFlow: MutableSharedFlow<List<StarRepos>> =
        MutableSharedFlow(replay = 1, onBufferOverflow = BufferOverflow.DROP_OLDEST)
    override fun getStarReposStream(): Flow<List<StarRepos>> = starReposFlow

    /**
     * A test-only API to allow controlling the list of authors from tests.
     */
    fun sendStarRepos(starRepos: List<StarRepos>) {
        starReposFlow.tryEmit(starRepos)
    }
}