package com.example.kuit_hackerton.remote

import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

data class StoreRequest(

)
data class StoreResponse(
    @SerializedName("storeImage") val storeImage: String,
    @SerializedName("storeName") val storeName: String,
    @SerializedName("storeDesc") val storeDesc: String,
    @SerializedName("avgScore") val avgScore: Int,
    @SerializedName("countScore") val countScore: Int

)
interface Apiservice{
    @POST("/your/store/endpoint")
    fun getStoreData(@Body request: StoreRequest): Call<List<StoreResponse>>

}
