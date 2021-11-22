package com.example.loginapp.network

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body

//A sealed class is an abstract class with a restricted class hierarchy.
// Classes that inherit from it have to be in the same file as the sealed class.
// This provides more control over the inheritance. They are restricted but also allow freedom in state representation
sealed class Resource<out T>{
    // data class to wrap the success response inside our response class
    data class Success<out T>(val value: T):Resource<T>()
    // it will not return T, it will return values required to handle failure
    data class Failure(
        val isNetworkError: Boolean,
        // to get the actual API error code in case we we don't have any Network error
        // of type Int and all the fields are Nullable ?
        val errorCode: Int?,
        // after error code we will get the error response body
        val errorBody: ResponseBody?
    ): Resource<Nothing>()
}