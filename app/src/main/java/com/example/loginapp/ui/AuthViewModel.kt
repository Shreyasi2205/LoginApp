package com.example.loginapp.ui

import androidx.lifecycle.ViewModel
import com.example.loginapp.repository.AuthRepository

class AuthViewModel(
    //Repository to hit our backend API
    private val Repository:AuthRepository
):ViewModel(){

}