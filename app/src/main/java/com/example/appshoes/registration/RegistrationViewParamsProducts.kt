package com.example.appshoes.registration

import android.graphics.Bitmap
import java.sql.*

data class RegistrationViewParamsProducts(
    val nameProducts: String = "",
    val marcaProducts: String = "",
    val sizeShoes: String = "",
    val colorShoes: Int = 0,
    val priceProducts: Float = 0f,
    val productImage: Bitmap,
    val stateOn: Boolean = true,
    val createdAt: Date,
)
