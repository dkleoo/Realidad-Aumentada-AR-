package com.example.realidad_aumentada_ar.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.realidad_aumentada_ar.R


val font = FontFamily(
    listOf(
        Font(R.font.dosis_bold,FontWeight.Bold),
        Font(R.font.dosis_light,FontWeight.Light),
        Font(R.font.dosis_medium,FontWeight.Medium),
        Font(R.font.dosis_regular,FontWeight.Normal),
        Font(R.font.dosis_semi_bold,FontWeight.SemiBold),
    )
)


val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = font,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)