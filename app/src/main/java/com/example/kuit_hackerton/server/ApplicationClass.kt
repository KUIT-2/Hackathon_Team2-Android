package com.example.kuit_hackerton.server

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class ApplicationClass: Application() {
    companion object{
        const val ACCESS_TOKEN: String = "access_token"
        const val DEV_URL : String ="http://localhost:8080"
        const val PROD_URL : String = "http://hackathon_prod_url"

        const val BASE_URL: String = DEV_URL

        lateinit var retrofit : Retrofit
        lateinit var mSharedPreferences: SharedPreferences
    }

    override fun onCreate() {
        super.onCreate()
        retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        mSharedPreferences = applicationContext.getSharedPreferences("My_App_Sdp", Context.MODE_PRIVATE)
    }

}