package com.core.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.core.ui.R


@Composable
fun EmptyScreen(onRetry: () -> Unit) {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.no_data))
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        item { LottieAnimation(composition, iterations = LottieConstants.IterateForever) }
        item { Spacer(modifier = Modifier.height(10.dp)) }
        item { Text(text = stringResource(id = R.string.no_data_available), style = MaterialTheme.typography.h5) }
        item { Spacer(modifier = Modifier.height(60.dp)) }
        item {
            OutlinedButton(
                onClick = onRetry,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .padding(20.dp, 0.dp),
                border = BorderStroke(1.dp, MaterialTheme.colors.primary)
            ) {
                Text(
                    text = stringResource(id = R.string.retry),
                    style = MaterialTheme.typography.button
                )
            }
        }

    }
}

@Composable
@Preview
fun PreviewEmptyScreen() {
    EmptyScreen {}
}
