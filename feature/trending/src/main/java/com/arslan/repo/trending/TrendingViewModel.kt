package com.arslan.repo.trending

import androidx.lifecycle.ViewModel
import com.core.data.repository.StarReposRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class TrendingViewModel @Inject constructor(
    starReposRepositoryImpl: StarReposRepository
): ViewModel() {

    val trendingUiState: StateFlow<TrendingUiState> = TODO()
}