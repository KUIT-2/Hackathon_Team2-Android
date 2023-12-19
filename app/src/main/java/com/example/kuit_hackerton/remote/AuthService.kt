package com.example.kuit_hackerton.remote

import android.util.Log
import com.example.kuit_hackerton.server.ApplicationClass
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class AuthService {
    private val authService = ApplicationClass.retrofit.create(RetrofitInterface::class.java)
    private lateinit var storeView: StoreView

    fun setStoreView(storeView: StoreView){
        this.storeView = storeView
    }

    fun category(categoryId : Int){
        authService.category(categoryId).enqueue(object : Callback<BaseResponse<StoreResponse>>{
            override fun onResponse(
                call: Call<BaseResponse<StoreResponse>>,
                response: Response<BaseResponse<StoreResponse>>
            ) {
                val resp = response.body()
                Log.d("Signup response",resp.toString())
                when(resp!!.code){
                    1000 -> storeView.StoreSuccess(resp)
                    else -> storeView.StoreFaliure(resp.code, resp.message)
                }
            }

            override fun onFailure(call: Call<BaseResponse<StoreResponse>>, t: Throwable) {
                Log.d("Singup Faliure",t.toString())
            }

        })
    }

}