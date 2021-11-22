package com.example.loginapp.ui.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import com.example.loginapp.R
import com.example.loginapp.network.RemoteDataSource
import com.example.loginapp.repository.BaseRepository


abstract class BaseFragment<VM:ViewModel,B:ViewBinding,R:BaseRepository> : Fragment() {
    protected var remoteDataSource=RemoteDataSource()
    protected lateinit var binding: B
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding=getFragmentBinding(inflater,container)
        return binding.root
    }
    abstract fun getViewModel():Class<VM>
    abstract fun getFragmentBinding(inflater: LayoutInflater,container: ViewGroup?):B
    abstract fun getFragmentRepository():R


}