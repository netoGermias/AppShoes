package com.example.appshoes.dataClasses.daoInterfaces

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.appshoes.dataClasses.entity.User


@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addUser(user : User)

    @Query("Select userID From tab_User Where username = :username and password = :password")
    fun login(username: String, password: String): Int

    @Query("Select * From tab_User Where userID = :id")
    fun getUSer(id:Int): User

}