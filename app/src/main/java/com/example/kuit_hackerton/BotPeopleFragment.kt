package com.example.kuit_hackerton

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kuit_hackerton.databinding.FragmentBotPeopleBinding

class BotPeopleFragment:Fragment() {
    lateinit var binding : FragmentBotPeopleBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBotPeopleBinding.inflate(layoutInflater)
        return binding.root
    }
}