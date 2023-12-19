package com.example.kuit_hackerton.remote

import retrofit2.http.GET
import retrofit2.http.POST

interface RetrofitInterface {
    @GET("/store/category/1")
    @GET("/store/detail/2")
    @GET("/store/hotplace")
    @GET("/store/menu/2")
    @GET("/store/review/2")
}