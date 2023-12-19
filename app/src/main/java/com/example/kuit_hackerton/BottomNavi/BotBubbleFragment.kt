package com.example.kuit_hackerton.BottomNavi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kuit_hackerton.databinding.FragmentBotBubbleBinding

class BotBubbleFragment: Fragment() {
    lateinit var binding : FragmentBotBubbleBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBotBubbleBinding.inflate(layoutInflater)
        return binding.root
    }
}