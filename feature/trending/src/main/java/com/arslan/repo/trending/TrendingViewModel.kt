package com.arslan.repo.trending

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.core.common.result.Result
import com.core.common.result.asResult
import com.core.data.repository.StarReposRepository
import com.core.model.data.StarRepos
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import javax.inject.Inject

@HiltViewModel
class TrendingViewModel @Inject constructor(
    private val starReposRepositoryImpl: StarReposRepository
): ViewModel() {

    val trendingUiState: StateFlow<TrendingUiState> = trendingUiStateStream()
        .stateIn(scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5_000),
            initialValue = TrendingUiState.Loading)
    private fun trendingUiStateStream(
    ): Flow<TrendingUiState> {
        val starReposStream: Flow<List<StarRepos>> = starReposRepositoryImpl.getStarReposStream()
        return starReposStream
            .asResult()
            .map { starReposResult ->
                when (starReposResult) {
                    is Result.Success -> {
                        TrendingUiState.Success(starRepos = starReposResult.data)
                    }
                    is Result.Loading -> {
                        TrendingUiState.Loading
                    }
                    is Result.Error -> {
                        TrendingUiState.Error
                    }
                }
            }
    }
}