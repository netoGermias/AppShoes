package com.example.appshoes.dataClasses.daoInterfaces

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.appshoes.dataClasses.entity.Favorite
import com.example.appshoes.dataClasses.entity.Products

@Dao
interface FavoriteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addingToFavorite(favorite: Favorite)

    @Query("Select * From tab_favorite Order By favoriteID ASC")
    fun showFavoriteProduct(): LiveData<List<Favorite>>


}