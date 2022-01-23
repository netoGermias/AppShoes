package com.example.shoesstarted_app.ui.registration.dbSources

import com.example.appshoes.dataClasses.model.ProductsModel
import com.example.appshoes.dataClasses.repository.ProductsRepository
import com.example.appshoes.registration.RegistrationViewParamsUser

class ProductsDbDataSource() : ProductsRepository {
    override fun createProduct(registrationViewParamsUser: RegistrationViewParamsUser) {
        TODO("Not yet implemented")
    }

    override fun getProducts(marca: String): ProductsModel {
        TODO("Not yet implemented")
    }
}