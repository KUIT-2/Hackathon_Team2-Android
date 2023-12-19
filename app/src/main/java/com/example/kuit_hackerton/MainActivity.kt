package com.example.kuit_hackerton

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kuit_hackerton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.navigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_home -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, SearchFragment()).commit()
                    return@setOnItemSelectedListener true
                }

                R.id.menu_townlife -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_frm, BotGlassFragment())
                        .commit()
                    return@setOnItemSelectedListener true
                }

                R.id.menu_nearby -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, BotBubbleFragment()).commit()
                    return@setOnItemSelectedListener true
                }

                R.id.menu_chatting -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, BotCalendarFragment()).commit()
                    return@setOnItemSelectedListener true
                }

                R.id.menu_my -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, BotPeopleFragment()).commit()
                    return@setOnItemSelectedListener true
                }

                else -> {
                    return@setOnItemSelectedListener true
                }
            }
        }
        binding.navigation.selectedItemId = R.id.menu_home
    }
}
