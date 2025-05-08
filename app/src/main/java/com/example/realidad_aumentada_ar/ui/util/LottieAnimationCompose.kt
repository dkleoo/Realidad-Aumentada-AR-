package com.example.realidad_aumentada_ar.ui.util

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.realidad_aumentada_ar.R

@Composable
fun LottieAnimationCompose(
    resId: Int = R.raw.augmented_reality,
    isPlaying: Boolean = true,
    @SuppressLint("ModifierParameter") modifierLottie: Modifier = Modifier
) {

    val composition by rememberLottieComposition(
        spec = LottieCompositionSpec.RawRes(resId)
    )

    val progress by animateLottieCompositionAsState(
        composition = composition,
        iterations = LottieConstants.IterateForever,
        isPlaying = isPlaying
    )

    LottieAnimation(
        composition = composition,
        progress = {
            progress
        },
        modifier = modifierLottie
    )
}