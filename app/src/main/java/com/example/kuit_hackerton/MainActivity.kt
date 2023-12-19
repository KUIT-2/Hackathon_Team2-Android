package com.example.kuit_hackerton

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.kuit_hackerton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("isit", "Start RestaurantActivity")

        // 프래그먼트 트랜잭션 시작
        val transaction = supportFragmentManager.beginTransaction()
        // 프래그먼트를 FrameLayout에 추가
        transaction.add(R.id.mainframe, CalanderFragment())
        // 트랜잭션을 커밋하여 변경사항을 적용
        transaction.commitAllowingStateLoss()
    }
}
