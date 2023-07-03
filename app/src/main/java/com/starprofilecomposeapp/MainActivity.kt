package com.starprofilecomposeapp

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.lifecycleScope
import com.arslan.repo.trending.TrendingRoute
import com.core.datastore.DataStoreUtil
import com.core.ui.theme.StarProfileComposeAppTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var dataStoreUtil: DataStoreUtil
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataStoreUtil = DataStoreUtil(applicationContext)
        val systemTheme =
            when (resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) {
                Configuration.UI_MODE_NIGHT_YES -> {
                    true
                }
                Configuration.UI_MODE_NIGHT_NO -> {
                    false
                }
                else -> {
                    false
                }
            }
        setContent {
            val theme = dataStoreUtil.getTheme(systemTheme).collectAsState(initial = null)
            theme.value?.let { isDarkTheme ->
                StarProfileComposeAppTheme(darkTheme = isDarkTheme) {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colors.background
                    ) {
                        TrendingRoute(isDarkTheme, isDarkThemeEnabled = { isDarkThemeEnabled ->
                            lifecycleScope.launch {
                                dataStoreUtil.saveTheme(isDarkThemeEnabled)
                            }
                        })
                    }
                }
            }
        }
    }
}