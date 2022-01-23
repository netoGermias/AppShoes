package com.example.appshoes.dataClasses.repository


import androidx.lifecycle.LiveData
import com.example.appshoes.dataClasses.entity.Cart
import com.example.appshoes.registration.RegistrationViewParamsCart


interface CartRepository {


    fun addToCart(registrationViewParamsCart: RegistrationViewParamsCart)

    fun getProductFromCart(id:Int): Cart
    val getProducts: LiveData<List<Cart>>
}
