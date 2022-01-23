package com.example.appshoes.dataClasses.daoInterfaces

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.appshoes.dataClasses.entity.Products
import com.example.appshoes.dataClasses.entity.User


@Dao
interface ProductsDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addProducts(products: Products)

    @Query("Select * From tab_user")
    fun readAllProducts(): LiveData<List<User>>

    @Query("Select * From tab_Products Where marcaProducts = :marca")
    fun readMarca(marca:String): Products

    @Delete()
    fun deleteUser(products: Products)

    @Query("Select * From tab_Products Where nameProducts like :name Limit 1")
    fun findByName(name: String): Products

    @Query("Select * From tab_Products Where marcaProducts like :marc Limit 1")
    fun findByMarc(marc: String): Products


}