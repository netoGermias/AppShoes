package com.example.appshoes.dataClasses.entity

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.appshoes.registration.RegistrationViewParamsProducts
import java.sql.*


@Entity(tableName = "tab_Products")
data class Products (

    @PrimaryKey(autoGenerate = true)
    val productID: Int = 0,
    val nameProducts: String,
    val marcaProducts: String,
    val sizeShoes: String,
    val colorShoes: Int,
    val priceProducts: Float,
//    val productImage: Bitmap,
    val stateOn: Boolean,

    )

fun RegistrationViewParamsProducts.toProducts(): Products{
    return with(this){
        Products(
            nameProducts = this.nameProducts,
            marcaProducts = this.marcaProducts,
            sizeShoes = this.sizeShoes,
            colorShoes = this.colorShoes,
            priceProducts = this.priceProducts,
  //          productImage = this.productImage,
            stateOn = this.stateOn
        )
    }
}



fun Products.toProducts(): Products {
    return Products(
        productID = this.productID,
        nameProducts = this.nameProducts,
        marcaProducts = this.marcaProducts,
        sizeShoes = this.sizeShoes,
        colorShoes = this.colorShoes,
        priceProducts = this.priceProducts,
    //    productImage = this.productImage,
        stateOn = this.stateOn
    )
}