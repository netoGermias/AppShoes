package com.example.appshoes.dataClasses.daoInterfaces

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.appshoes.dataClasses.entity.Cart


@Dao
interface CartDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addingToCart(cart: Cart)

    @Query("Select * From tab_cart Order By cartID ASC")
    fun showCartProduct(): Cart

}