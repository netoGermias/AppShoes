package com.example.shoesstarted_app.ui.registration.dbSources

import com.example.appshoes.dataClasses.daoInterfaces.FavoriteDao
import com.example.appshoes.dataClasses.entity.Favorite
import com.example.appshoes.dataClasses.repository.FavoriteRepository
import com.example.appshoes.registration.RegistrationViewParamsFavorite

class FavoriteDbDataSource(
    private val favoriteDao: FavoriteDao
): FavoriteRepository {
    override fun addToFavorite(registrationViewParamsFavorite: RegistrationViewParamsFavorite) {
        TODO("Not yet implemented")
    }

    override fun showFavorites(id: Int): Favorite {
        TODO("Not yet implemented")
    }

}