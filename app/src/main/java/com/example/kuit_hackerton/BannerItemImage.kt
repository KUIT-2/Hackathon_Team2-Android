package com.example.kuit_hackerton

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kuit_hackerton.databinding.ItemBannerImageBinding

class BannerItemImage:Fragment() {
    private lateinit var binding: ItemBannerImageBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ItemBannerImageBinding.inflate(inflater,container,false)
        return binding.root
    }

}