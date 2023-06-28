package com.arslan.repo.trending

import com.core.model.data.StarRepos

sealed interface TrendingUiState {
    data class Success(val starRepos: List<StarRepos>) : TrendingUiState
    object Error : TrendingUiState
    object Loading : TrendingUiState
}