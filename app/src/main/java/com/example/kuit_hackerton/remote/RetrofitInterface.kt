package com.example.kuit_hackerton.remote

import okhttp3.Request
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import java.io.Serializable

interface RetrofitInterface {
    @GET("/store/category/{categoryId}")
    fun category(@Path("categoryId") categoryId: Int): Call<BaseResponse<StoreResponse>>

    @GET("/store/detail/2")
    @GET("/store/hotplace")
    @GET("/store/menu/2")
    @GET("/store/review/2")
}