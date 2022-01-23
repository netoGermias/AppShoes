package com.example.appshoes.dataClasses.repository


import com.example.appshoes.dataClasses.entity.User
import com.example.appshoes.registration.RegistrationViewParamsUser


interface UserRepository {
    fun createUser(registrationViewParamsUser: RegistrationViewParamsUser)

    fun getUser(id: Int): User
    
    fun login(username: String, password: String): Int
}