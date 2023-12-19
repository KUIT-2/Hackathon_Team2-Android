package com.example.kuit_hackerton

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kuit_hackerton.databinding.FragmentReservationEndBinding
import com.example.kuit_hackerton.databinding.FragmentReservationInfoCheckBinding
import com.example.kuit_hackerton.restaurant.RestaurantActivity
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ReservationEndFragment : BottomSheetDialogFragment() {

    lateinit var binding: FragmentReservationEndBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentReservationEndBinding.inflate(inflater, container, false)
        binding.ivDecline.setOnClickListener{
            val myIntent = Intent(requireContext(), MainActivity::class.java)
            // startActivity를 해야 화면이동
            startActivity(myIntent)


        }
        return binding.root
    }
}
