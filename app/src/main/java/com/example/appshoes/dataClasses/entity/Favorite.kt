package com.example.appshoes.dataClasses.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation
import com.example.appshoes.registration.RegistrationViewParamsFavorite


@Entity(tableName = "tab_favorite")
data class Favorite (

    @PrimaryKey(autoGenerate = true)
    val favoriteID: Int = 0,
    val productID: Int,
    val userID: Int
)

data class RelationOneByManyUserAndFavorite(
    @Embedded val user: User,
    @Relation(
        parentColumn = "userID",
        entityColumn = "favoriteID"
    )
    val favorite : List<Favorite>

)



fun RegistrationViewParamsFavorite.toFavorite(): Favorite{
    return with(this){
        Favorite(
        productID = this.productID,
        userID = this.userID
        )
    }
}

fun Favorite.toFavorite():Favorite{
    return Favorite(
        favoriteID = this.favoriteID,
        productID = this.productID,
        userID = this.userID
    )
}