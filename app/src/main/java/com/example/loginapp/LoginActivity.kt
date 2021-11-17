package com.example.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginapp.databinding.ActivityLoginBinding
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    lateinit var viewModel: ViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_login)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_login)
        supportActionBar?.setTitle("Singup Form")
        //viewModel=ViewModelProvider(this).get(viewModel::class.java)
        //binding.lifecycleOwner=this
    }
}