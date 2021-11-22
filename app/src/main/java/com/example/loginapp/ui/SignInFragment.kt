package com.example.loginapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.loginapp.R
import com.example.loginapp.databinding.FragmentSignInBinding
import com.example.loginapp.repository.AuthRepository
import com.example.loginapp.ui.base.BaseFragment


class SignInFragment : BaseFragment<AuthViewModel, FragmentSignInBinding, AuthRepository>() {
    override fun getViewModel()=AuthViewModel::class.java
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    )= FragmentSignInBinding.inflate(inflater,container,false)

    override fun getFragmentRepository(): AuthRepository {
        TODO("Not yet implemented")
    }

}