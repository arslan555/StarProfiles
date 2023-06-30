package com.core.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Green200,
    primaryVariant = Green700,
    secondary = Teal200,
    background = Black,
    surface = Black,
    onSecondary = White,
    onBackground = White,
    onSurface = White,
)

private val LightColorPalette = lightColors(
    primary = Green500,
    primaryVariant = Green700,
    onPrimary = White,
    secondary = Teal200,
    background = White,
    surface = White,
    onSecondary = Black,
    onBackground = Black,
    onSurface = Black,
)

@Composable
fun StarProfileComposeAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}