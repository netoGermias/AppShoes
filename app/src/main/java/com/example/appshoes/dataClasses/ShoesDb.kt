package com.example.shoesstarted_app.dataClasses

import android.content.Context
import androidx.databinding.adapters.Converters
import androidx.room.*
import com.example.appshoes.dataClasses.daoInterfaces.CartDao
import com.example.appshoes.dataClasses.daoInterfaces.FavoriteDao
import com.example.appshoes.dataClasses.daoInterfaces.ProductsDao
import com.example.appshoes.dataClasses.daoInterfaces.UserDao
import com.example.appshoes.dataClasses.entity.Products
import com.example.appshoes.dataClasses.entity.User
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized

@Database(entities = [User::class, Products::class], version = 1, exportSchema = false)
/** @TypeConverters(Converters::class) **/
abstract class ShoesDb: RoomDatabase() {

    abstract fun userDao(): UserDao
    abstract fun productsDao(): ProductsDao
    abstract fun cartDao(): CartDao
    abstract fun favoriteDao(): FavoriteDao


    companion object{
        @Volatile
        private var INSTANCE: ShoesDb? = null

        @OptIn(InternalCoroutinesApi::class)
        fun getDatabase(context : Context) : ShoesDb {
            val tempInstance = INSTANCE

            if(tempInstance != null){
                return tempInstance
            }

            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ShoesDb::class.java,
                    "user_db",
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}