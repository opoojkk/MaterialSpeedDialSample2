package com.joykeepsflowin.materialspeeddialsample.speedDial.extensions

import android.graphics.Color
import androidx.annotation.FloatRange
import kotlin.math.roundToInt

fun Int.makeupWithAlpha(
    @FloatRange(from = 0.0, to = 1.0) expectedAlpha: Float
): Int {
    val alpha = (Color.alpha(this) * expectedAlpha).roundToInt()
    return ((alpha shl 24) or (this and 0x00FFFFFF))
}