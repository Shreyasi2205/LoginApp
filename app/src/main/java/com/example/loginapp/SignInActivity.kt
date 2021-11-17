package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.loginapp.databinding.ActivitySignInBinding
import androidx.databinding.DataBindingUtil




class SignInActivity : AppCompatActivity() {
      lateinit var binding:ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_sign_in)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_sign_in)

        binding.lifecycleOwner=this
        binding.signInBtn.setOnClickListener{
           Intent(this,LoginActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}