package com.example.kuit_hackerton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kuit_hackerton.databinding.ActivityRestListDiscreteBinding

class RestaurantList : AppCompatActivity() {
    lateinit var binding: ActivityRestListDiscreteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRestListDiscreteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.storeName.text = data.store
    }
}