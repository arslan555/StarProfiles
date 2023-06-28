package com.arslan.repo.trending

import com.arslan.repo.trending.repository.TestStarReposRepository
import com.core.model.data.StarRepos
import com.core.testing.util.MainDispatcherRule
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*

import org.junit.Before
import org.junit.Rule
import org.junit.Test

class TrendingViewModelTest {
    @get:Rule
    val dispatcherRule = MainDispatcherRule()

    private lateinit var starReposRepository: TestStarReposRepository
    private lateinit var viewModel: TrendingViewModel

    @Before
    fun setUp() {
        starReposRepository = TestStarReposRepository()
        viewModel = TrendingViewModel(starReposRepository)
    }

    @Test
    fun uiStateTrendingRepos_WhenInitialized_ThenShowLoading() = runTest {
        assertEquals(TrendingUiState.Loading, viewModel.trendingUiState.value)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun uiStateTrendingRepos_WhenUpdatingSuccessFromRepository_ThenShowTrendingSuccess() = runTest {
        val collectJob = launch(UnconfinedTestDispatcher()) {viewModel.trendingUiState.collect()  }
        starReposRepository.sendStarRepos(testInputStarRepos)
        val state = viewModel.trendingUiState.value
        assertTrue(state is TrendingUiState.Success)
        val successState: TrendingUiState.Success = viewModel.trendingUiState.value as TrendingUiState.Success
        assertNotNull(successState.starRepos)
        assertEquals(successState.starRepos.size, 2)
        assertEquals(successState.starRepos[0].name, "Kotlin")
        assertEquals(successState.starRepos[1].owner?.avatarUrl,"https://avatars.githubusercontent.com/u/878437?v=4")
        collectJob.cancel()
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun uiStateTrendingRepos_WhenUpdatingFromRepository_ThenShowTrendingEmpty() = runTest {
        val collectJob = launch(UnconfinedTestDispatcher()) {viewModel.trendingUiState.collect() }
        starReposRepository.sendStarRepos(listOf())
        val state = viewModel.trendingUiState.value
        assertTrue(state is TrendingUiState.Empty)
        collectJob.cancel()
    }




    private val testInputStarRepos = listOf(
        StarRepos(
            id = 0,
            name = "Kotlin",
            fullName = "Kotlin/jetbrains",
            description = "Kotlin official repo",
            starsCount = 45016,
            language = "kotlin",
            owner = StarRepos.Owner(
                id = 2,
                avatarUrl = "https://avatars.githubusercontent.com/u/878437?v=4",
                htmlUrl = "https://github.com/JetBrains"
            )
        ),
        StarRepos(
            id = 1,
            name = "Bandhook-Kotlin",
            fullName = "antoniolg/Bandhook-Kotlin",
            description = "The Kotlin Programming Language.",
            starsCount = 1233,
            language = "kotlin",
            owner = StarRepos.Owner(
                id = 2,
                avatarUrl = "https://avatars.githubusercontent.com/u/878437?v=4",
                htmlUrl = "https://github.com/JetBrains"
            )
        )
    )


}