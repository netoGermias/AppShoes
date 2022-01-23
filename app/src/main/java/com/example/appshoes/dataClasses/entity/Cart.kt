package com.example.appshoes.dataClasses.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation
import com.example.appshoes.registration.RegistrationViewParamsCart



@Entity(tableName = "tab_cart")
data class Cart(

    @PrimaryKey(autoGenerate = true)
    val cartID: Int = 0,
    val productsID: Int,
    val userID: Int,
    val quantidade: Int,
    val totalDeCompras: Float,
)

data class RelationOneByManyUserAndCart(
    @Embedded val user: User,
    @Relation(
        parentColumn = "userID",
        entityColumn = "cartID"
    )
    val favorite : List<Cart>

)

fun RegistrationViewParamsCart.toCart(): Cart{
    return with(this){
        Cart(
        productsID = this.productsID,
        userID = this.userID,
        quantidade = this.quantidade,
        totalDeCompras = this.totalDeCompras
        )
    }
}

fun Cart.toCart():Cart{
    return Cart(
        cartID = this.userID,
    productsID =  this.productsID,
    userID = this.userID,
    quantidade = this.quantidade,
    totalDeCompras = this.totalDeCompras
    )
}