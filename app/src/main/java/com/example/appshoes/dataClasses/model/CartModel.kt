package com.example.appshoes.dataClasses.model

data class CartModel(
    val cartID: Int,
    val productsID: Int,
    val userID: Int,
    val quantidade: Int,
    val totalDeCompras: Float,

)
