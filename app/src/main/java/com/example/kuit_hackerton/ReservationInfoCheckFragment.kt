package com.example.kuit_hackerton

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kuit_hackerton.databinding.FragmentReservationInfoCheckBinding
import com.example.kuit_hackerton.restaurant.RestaurantActivity
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ReservationInfoCheckFragment : BottomSheetDialogFragment() {
    lateinit var binding: FragmentReservationInfoCheckBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentReservationInfoCheckBinding.inflate(inflater, container, false)
        binding.ivFinalChoice.setOnClickListener{
            //누르면 다음 end로 넘어가게 해야함
            val reserveendFragment = ReservationEndFragment()
            val args = Bundle().apply {
                putString("key", toString())
            }
            reserveendFragment.arguments = args
            dismiss()
            (requireActivity() as RestaurantActivity).showReservationEndFragment()
        }
        binding.ivDecline.setOnClickListener{
            dismiss()
        }
        return binding.root
    }
}