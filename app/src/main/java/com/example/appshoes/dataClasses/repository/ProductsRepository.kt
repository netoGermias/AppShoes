package com.example.appshoes.dataClasses.repository

import com.example.appshoes.registration.RegistrationViewParamsUser
import com.example.appshoes.dataClasses.model.ProductsModel



interface ProductsRepository {
    fun createProduct(registrationViewParamsUser: RegistrationViewParamsUser)

    fun getProducts(marca: String): ProductsModel

}