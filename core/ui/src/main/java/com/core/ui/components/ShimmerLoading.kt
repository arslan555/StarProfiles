package com.core.ui.components

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LoadingShimmerEffect(): Brush {

    //These colors will be used on the brush. The lightest color should be in the middle

    val gradient = listOf(
        Color.LightGray.copy(alpha = 0.9f), //darker grey (90% opacity)
        Color.LightGray.copy(alpha = 0.3f), //lighter grey (30% opacity)
        Color.LightGray.copy(alpha = 0.9f)
    )

    val transition = rememberInfiniteTransition() // animate infinite times

    val translateAnimation = transition.animateFloat( //animate the transition
        initialValue = 0f,
        targetValue = 1000f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 1000, // duration for the animation
                easing = FastOutLinearInEasing
            )
        )
    )
    return linearGradient(
        colors = gradient,
        start = Offset(200f, 200f),
        end = Offset(
            x = translateAnimation.value,
            y = translateAnimation.value
        )
    )
}

@Composable
fun ShimmerGridItem(brush: Brush = LoadingShimmerEffect()) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(all = 10.dp), verticalAlignment = Alignment.Top) {

        Spacer(modifier = Modifier
            .size(50.dp)
            .clip(RoundedCornerShape(50.dp))
            .background(brush)
        )
        Spacer(modifier = Modifier.width(10.dp))
        Column(verticalArrangement = Arrangement.Center) {
            Spacer(modifier = Modifier
                .height(15.dp)
                .clip(RoundedCornerShape(10.dp))
                .fillMaxWidth(fraction = 0.5f)
                .background(brush)
            )

            Spacer(modifier = Modifier.height(15.dp)) //creates an empty space between
            Spacer(modifier = Modifier
                .height(15.dp)
                .clip(RoundedCornerShape(10.dp))
                .fillMaxWidth(fraction = 0.7f)
                .background(brush)
            )
        }
    }
}

@Composable
fun ShimmerLayout(times: Int = 15) {
    Column( modifier = Modifier.fillMaxSize()) {
        repeat(times) {
            ShimmerGridItem()
        }
    }

}

@Preview
@Composable
fun previewShimmerGridItem() {
    ShimmerGridItem()
}

@Preview
@Composable
fun previewShimmerLayout() {
    ShimmerLayout()
}

