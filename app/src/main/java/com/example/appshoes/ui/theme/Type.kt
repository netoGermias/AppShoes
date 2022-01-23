package com.example.appshoes.ui.theme

import android.hardware.lights.Light
import androidx.compose.material.Typography
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.appshoes.R

private val Poppins = FontFamily(
    Font(R.font.poppins_black),
    Font(R.font.poppins_light),
    Font(R.font.poppins_bold),
    Font(R.font.poppins_thin),
    Font(R.font.poppins_medium),
    Font(R.font.poppins_regular),
    Font(R.font.poppins_semiBold),
    Font(R.font.poppins_extraLight)

)

// Set of Material typography styles to start with
val Typography = Typography(
    defaultFontFamily = Poppins,
    h1 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 40.sp,
        color = Color(0xFF808080)
    ),
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)