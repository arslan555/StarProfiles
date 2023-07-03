package com.arslan.repo.trending

import ErrorScreen
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.core.ui.R
import com.core.ui.components.EmptyScreen
import com.core.ui.components.Repos
import com.core.ui.components.SPTopAppBar
import com.core.ui.components.ShimmerLayout

@Composable
fun TrendingRoute(
    defaultTheme: Boolean,
    modifier: Modifier = Modifier,
    viewModel: TrendingViewModel = hiltViewModel(),
    isDarkThemeEnabled: (Boolean) -> Unit = {}
) {

    val trendingUiState: TrendingUiState by viewModel.trendingUiState.collectAsStateWithLifecycle()
    TrendingScreen(defaultTheme,trendingUiState ,modifier, isDarkThemeEnable = isDarkThemeEnabled)
}

@Composable
fun TrendingScreen(
    defaultTheme: Boolean,
    trendingUiState: TrendingUiState,
    modifier: Modifier,
    isDarkThemeEnable: (Boolean) -> Unit= {},
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.windowInsetsTopHeight(WindowInsets.safeDrawing))
        SPTopAppBar(defaultTheme,R.string.trending,isDarkThemeEnabled =isDarkThemeEnable)
        when (trendingUiState) {
            TrendingUiState.Loading -> {
                ShimmerLayout()
            }
            TrendingUiState.Error -> {
                ErrorScreen {}
            }
            TrendingUiState.Empty -> {
                EmptyScreen {}
            }
            is TrendingUiState.Success -> {
                Repos(modifier = modifier, repos = trendingUiState.starRepos)
            }
        }
    }
    Spacer(Modifier.windowInsetsBottomHeight(WindowInsets.safeDrawing))
}
