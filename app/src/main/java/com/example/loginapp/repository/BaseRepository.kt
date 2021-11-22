package com.example.loginapp.repository
import com.example.loginapp.network.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.HttpException

//Base Repo for all the Repository classes
// abstract class-> wont be creating instance of this base repository directly but will inherit this class to the actual concrete
// repository classes
abstract class BaseRepository {
    // function to safely call the API
    // we are making this function suspend because we are using coroutines for the asynchronous calls and this function generic
     suspend fun <T> safeApiCall(
        apiCall: suspend()->T
    ):Resource<T>{
        // to execute all the API calls
        return withContext(Dispatchers.IO){
            try{
               Resource.Success(apiCall.invoke())
            } catch (throwable:Throwable){
                when(throwable){
                    is HttpException ->{
                        Resource.Failure(false,throwable.code(),throwable.response()?.errorBody())
                    }
                    else->{
                        Resource.Failure(true, null, null)
                    }
                }

            }
        }
    }
}