package com.arslan.repo.trending.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

object TrendingDestination {
    val route = "trending_route"
}

fun NavGraphBuilder.TrendingNavigation() {
    composable(route = TrendingDestination.route) {

    }
}