package com.core.ui.components

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.core.ui.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SPTopAppBar(
    defaultTheme: Boolean,
    @StringRes titleRes: Int,
    navigationIcon: ImageVector? = null,
    navigationIconContentDescription: String = "",
    actionIconContentDescription: String = "",
    modifier: Modifier = Modifier,
    onNavigationClick: () -> Unit = {},
    isDarkThemeEnabled: (Boolean) -> Unit = {}
) {
    var darkThemeEnabled  by rememberSaveable { mutableStateOf(defaultTheme) }
    Surface(
        modifier = Modifier.fillMaxWidth(),
        elevation = 4.dp
    ) {
        CenterAlignedTopAppBar(
            title = {
                Text(
                    text = stringResource(id = titleRes),
                    style = MaterialTheme.typography.h5.copy(
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                )
            },
            navigationIcon = {
                if (navigationIcon != null) {
                    IconButton(onClick = onNavigationClick) {
                        Icon(
                            imageVector = navigationIcon,
                            contentDescription = navigationIconContentDescription,
                            tint = MaterialTheme.colors.onSurface
                        )
                    }
                }
            },
            actions = {
                IconButton(onClick = {
                    darkThemeEnabled = darkThemeEnabled.not()
                    isDarkThemeEnabled.invoke(darkThemeEnabled)

                }) {
                    Icon(
                        imageVector = if (darkThemeEnabled) ImageVector.vectorResource(R.drawable.ic_day) else ImageVector.vectorResource(R.drawable.ic_moon),
                        contentDescription = actionIconContentDescription,
                        tint = MaterialTheme.colors.onSurface
                    )
                }
            },
            modifier = modifier,
            colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colors.surface)
        )
    }
}


@Preview
@Composable
fun previewTopAppBar() {
    SPTopAppBar(
        false,
        titleRes = R.string.trending,
        navigationIcon = Icons.Default.MoreVert,
    )
}