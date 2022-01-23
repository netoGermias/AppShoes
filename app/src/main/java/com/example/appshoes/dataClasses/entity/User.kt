package com.example.appshoes.dataClasses.entity

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.appshoes.registration.RegistrationViewParamsUser


@Entity(tableName = "tab_User")
data class User(

    @PrimaryKey(autoGenerate = true)
    val userID: Int = 0,
    val name: String,
    val endereco: String,
    val username: String,
    val telefone: String,
    val email: String,
    val password: String,
   // val userPhoto: Bitmap
)

fun RegistrationViewParamsUser.toUser(): User {
    return with(this){
       User(
        name = this.username,
        endereco = this.endereco,
        username = this.username,
        telefone = this.telefone,
        email = this.email,
        password =this.password,
     //      userPhoto = this.userPhoto
       )
    }

}

fun User.toUser(): User {
    return User(
        userID = this.userID,
        name = this.name,
        endereco = this.endereco,
        username = this.username,
        telefone = this.telefone,
        email = this.email,
        password = this.password,
       // userPhoto = this.userPhoto
        )
}
