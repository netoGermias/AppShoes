package com.example.appshoes.registration.dbSources

import com.example.appshoes.dataClasses.daoInterfaces.UserDao
import com.example.appshoes.dataClasses.entity.User
import com.example.appshoes.dataClasses.entity.toUser
import com.example.appshoes.dataClasses.repository.UserRepository
import com.example.appshoes.registration.RegistrationViewParamsUser


class UserdDbDataSource(
    private val userDao: UserDao
) : UserRepository {
    override fun createUser(registrationViewParamsUser: RegistrationViewParamsUser) {
        val user = registrationViewParamsUser.toUser()
        userDao.addUser(user)
    }

    override fun getUser(id: Int): User {
        return userDao.getUSer(id).toUser()
    }


    override fun login(username: String, password: String): Int {
        TODO("Not yet implemented")
    }

}