package com.example.kuit_hackerton.restaurant

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.kuit_hackerton.MainActivity
import com.example.kuit_hackerton.databinding.ActivitySplashBinding

class SplashActivity : ComponentActivity() {
    lateinit var binding : ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()

            val myIntent = Intent(this, MainActivity::class.java)
            // startActivity를 해야 화면이동
            startActivity(myIntent)
            //intent flag제거해서 백스택 안 오게

    }

}