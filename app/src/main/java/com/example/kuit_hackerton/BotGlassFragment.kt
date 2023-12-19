package com.example.kuit_hackerton

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kuit_hackerton.databinding.FragmentBotGlassBinding

class BotGlassFragment:Fragment() {
    lateinit var binding : FragmentBotGlassBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBotGlassBinding.inflate(layoutInflater)
        return binding.root
    }
}