package com.example.kuit_hackerton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kuit_hackerton.databinding.ActivityRestaurantListBinding
//import com.example.kuit_hackerton.remote.BaseResponse
//import com.example.kuit_hackerton.remote.RetrofitInterface
import com.example.kuit_hackerton.remote.StoreResponse
import com.example.kuit_hackerton.restaurant.RestaurantActivity
import com.example.kuit_hackerton.server.ApplicationClass
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RestaurantListActivity : AppCompatActivity() {
    //activity
    private var resadapter: RestaurantListAdapter? = null

    lateinit var binding: ActivityRestaurantListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRestaurantListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        usingAdapter()
    }

    private fun usingAdapter() {
        val reslist = arrayListOf(
            RestaurantListData("맛집1"),
            RestaurantListData("맛집2"),
            RestaurantListData("맛집3"),
            RestaurantListData("맛집4"),
            RestaurantListData("맛집5"),
            RestaurantListData("맛집6")
        )
        resadapter = RestaurantListAdapter(reslist)

        binding.rvList.adapter = resadapter
        binding.rvList.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        resadapter!!.setOnItemClickListener(object : RestaurantListAdapter.OnItemClickListener {
            override fun onItemClick(reslist: RestaurantListData) {
                val myIntent = Intent(applicationContext, RestaurantActivity::class.java)
                // startActivity를 해야 화면이동
                startActivity(myIntent)
            }
        })
/*
        val authService = ApplicationClass.retrofit.create(RetrofitInterface::class.java)
        authService.category(1).enqueue()
        authService.category(1).enqueue(object : Callback<BaseResponse<List<StoreResponse>>> {
            override fun onResponse(
                call: Call<BaseResponse<List<StoreResponse>>>,
                response: Response<BaseResponse<List<StoreResponse>>>
            ) {

                val resp = response.body()
                Log.d("Signup response",resp.toString())
            }

            override fun onFailure(call: Call<BaseResponse<List<StoreResponse>>>, t: Throwable) {
                Log.d("Singup Faliure",t.toString())
            }

        })*/




    }
}