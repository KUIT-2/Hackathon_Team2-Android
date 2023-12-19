package com.example.kuit_hackerton.restaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kuit_hackerton.ReservationEndFragment
import com.example.kuit_hackerton.ReservationInfoCheckFragment

import com.example.kuit_hackerton.databinding.ActivityRestaurantBinding
import com.example.kuit_hackerton.time.CalanderFragment


class RestaurantActivity : AppCompatActivity() {
    lateinit var binding: ActivityRestaurantBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRestaurantBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bottomsheet = CalanderFragment()

        //이거 resume에 적게?
        binding.clMakeReservation.setOnClickListener {//눌리면 프래그먼트 under이 보이게
            //눌리면 이제 bottomsheet이 나오게 해야함
            bottomsheet.show(supportFragmentManager, bottomsheet.tag)

        }

    }

    fun showReservationInfoCheckFragment(){//cal 다음 2번째
        val reserveFragment=ReservationInfoCheckFragment()//다음 프래그먼트 이름
        reserveFragment.show(supportFragmentManager,reserveFragment.tag)//위에꺼 ㅇㅋ 이러고 복붙해서 화면 다 여러개
    }

    fun showReservationEndFragment(){//3번쨰(마지막)
        val reserveFragment=ReservationEndFragment()//다음 프래그먼트 이름
        reserveFragment.show(supportFragmentManager,reserveFragment.tag)//위에꺼 ㅇㅋ 이러고 복붙해서 화면 다 여러개
    }


}