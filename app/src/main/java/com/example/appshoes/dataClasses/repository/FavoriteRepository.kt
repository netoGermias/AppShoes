package com.example.appshoes.dataClasses.repository


import com.example.appshoes.dataClasses.entity.Favorite
import com.example.appshoes.registration.RegistrationViewParamsFavorite


interface FavoriteRepository {
    fun addToFavorite(registrationViewParamsFavorite: RegistrationViewParamsFavorite)

    fun showFavorites(id:Int): Favorite
}