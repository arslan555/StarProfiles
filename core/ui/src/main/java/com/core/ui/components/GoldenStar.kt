package com.core.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun GoldenStar() {
    Canvas(modifier = Modifier.size(10.dp)) {
        val center = size / 2f
        val outerRadius = size.minDimension / 2f
        val innerRadius = outerRadius * 0.382f // Golden ratio (0.382 = 1 - 1 / φ)

        val path = Path()

        repeat(5) { i ->
            val angle = Math.PI * 2 * i / 5 - Math.PI / 2
            val xOuter = center.width + outerRadius * cos(angle).toFloat()
            val yOuter = center.height + outerRadius * sin(angle).toFloat()

            val angleInner = angle + Math.PI / 5
            val xInner = center.width + innerRadius * cos(angleInner).toFloat()
            val yInner = center.height + innerRadius * sin(angleInner).toFloat()

            if (i == 0) {
                path.moveTo(xOuter, yOuter)
            } else {
                path.lineTo(xOuter, yOuter)
            }
            path.lineTo(xInner, yInner)
        }

        path.close()

        val gradientColors = listOf(
            Color(0xFFFFD700), // Gold
            Color(0xFFFFFF00), // Yellow
            Color(0xFFFFD700) // Gold
        )


        val gradientBrush = Brush.linearGradient(
            colors = gradientColors,
            start = Offset(center.width - outerRadius, center.height),
            end = Offset(center.width + outerRadius, center.height),
        )

        drawPath(
            path = path,
            brush = gradientBrush,
        )
    }
}
@Preview
@Composable
fun PreviewGoldenStar() {
 GoldenStar()
}
