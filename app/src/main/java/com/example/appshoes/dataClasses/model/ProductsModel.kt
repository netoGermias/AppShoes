package com.example.appshoes.dataClasses.model

import android.graphics.Bitmap

data class ProductsModel(
    val product_id: Int,
    val nameProducts: String,
    val marcaProducts: String,
    val sizeShoes: String,
    val colorShoes: Int,
    val priceProducts: Float,
    val productImage: Bitmap,
    val stateOn: Boolean
)
