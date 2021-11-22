package com.example.loginapp.repository

import com.example.loginapp.network.AuthApi

// for signup and login calls
class AuthRepository(
    private val api:AuthApi

):BaseRepository(){
   suspend fun login(
        username:String,
        password:String
    ) = safeApiCall {
        api.login(username,password)
    }
}