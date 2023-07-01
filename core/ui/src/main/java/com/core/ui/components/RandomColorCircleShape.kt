package com.core.ui.components
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlin.random.Random


@Composable
fun RandomColorCircle(size: Dp = 10.dp) {
    val currentColor by remember { mutableStateOf(generateRandomColor()) }

    Box(
        modifier = Modifier
            .size(size)
            .background(currentColor, shape = CircleShape)
    )
}

private fun generateRandomColor(): Color {
    val random = Random.Default
    val red = random.nextInt(256)
    val green = random.nextInt(256)
    val blue = random.nextInt(256)
    return Color(red, green, blue)
}
@Preview
@Composable
fun PreviewRandomColorCircle() {
    RandomColorCircle()
}