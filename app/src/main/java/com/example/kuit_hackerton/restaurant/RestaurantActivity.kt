package com.example.kuit_hackerton.restaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
<<<<<<< HEAD:app/src/main/java/com/example/kuit_hackerton/RestaurantActivity.kt
import com.example.kuit_hackerton.CalanderFragment
import com.example.kuit_hackerton.databinding.ActivityRestaurantBinding
=======
import com.example.kuit_hackerton.databinding.ActivityRestaurantBinding
import com.example.kuit_hackerton.time.CalanderFragment
>>>>>>> 880e1ed75a80a4cac92563a00814b68a441c9a02:app/src/main/java/com/example/kuit_hackerton/restaurant/RestaurantActivity.kt

class RestaurantActivity : AppCompatActivity() {
    lateinit var binding: ActivityRestaurantBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRestaurantBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bottomsheet= CalanderFragment()


        //이거 resume에 적게?
        binding.clMakeReservation.setOnClickListener {//눌리면 프래그먼트 under이 보이게
            //눌리면 이제 bottomsheet이 나오게 해야함
            //이건 fagment로 화면 바꾸는

            //val transaction = supportFragmentManager.beginTransaction()
            //transaction.add(R.id.frame_under, CalanderFragment())
            //transaction.commitAllowingStateLoss()
            bottomsheet.show(supportFragmentManager,bottomsheet.tag)

        }

    }

}