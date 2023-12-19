package com.example.kuit_hackerton

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.kuit_hackerton.databinding.FragmentSerchBinding

class SearchFragment : Fragment() {


    private lateinit var adapter: ImageSliderVP
    private lateinit var binding : FragmentSerchBinding
    private var pagerHandler = Handler(Looper.getMainLooper())


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSerchBinding.inflate(layoutInflater)
        binding.rvPlaceChoice.setOnClickListener{
            val intent = Intent(requireContext(),StuffInfoActivity::class.java) //리스트 액티비티랑 바인딩하기
            startActivity(intent)
        }
        return binding.root

    }

    private fun initDummyData(){
        binding = FragmentSerchBinding.inflate(layoutInflater)
        val placeList = arrayListOf(
            PlaceProduct(R.drawable._706yeouido),
            PlaceProduct(R.drawable.busan_),
            PlaceProduct(R.drawable.busan_),
            PlaceProduct(R.drawable._706yeouido),
            PlaceProduct(R.drawable.busan_),
            PlaceProduct(R.drawable._706yeouido),
            PlaceProduct(R.drawable._706yeouido),
            PlaceProduct(R.drawable._706yeouido)

        )
    }

}