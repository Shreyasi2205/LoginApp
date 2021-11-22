package com.example.loginapp.network

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
//class to get our Retrofit client
class RemoteDataSource {
    companion object{
        private const val BASE_URL="https://kotlintestapp-wise-wolverine-ue.eu1.phsdp.com/novartis/mock/login"
    }
    fun <Api> buildApi(
        api: Class<Api>
    ):Api{
        //build our retrofit client or API interface
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(api)
    }
}
// in MVVM we create repository that communicates with either the backend API or local storage
// data class -> to map our login response