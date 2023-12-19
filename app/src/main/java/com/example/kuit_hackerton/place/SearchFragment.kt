package com.example.kuit_hackerton.place

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.kuit_hackerton.R
import com.example.kuit_hackerton.databinding.FragmentSerchBinding

class SearchFragment : Fragment() {
    private val imageSwiper=ImageSwiper()//swiper구현
    private lateinit var banner_viewpager: ViewPager2
    private lateinit var adapter: ImageSliderVP
    private lateinit var binding : FragmentSerchBinding
    private var pagerHandler = Handler(Looper.getMainLooper())
    private val imgList= mutableListOf<Int>()///그냥 binding 하는 부분에서 넘겨주는것만 대체하기


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSerchBinding.inflate(inflater, container, false)
        Log.d("whynot2","whynot2")

        //눌릴수있ㄴㄴ데 setonClick이 안받네


        binding.root.setOnClickListener{
            val myintent = Intent(requireContext(),ListActivity::class.java) //리스트 액티비티랑 바인딩하기
            startActivity(myintent)

        }
        binding.rvPlaceChoice.requestFocus()
        binding.rvPlaceChoice.setOnClickListener{
            val myintent = Intent(requireContext(),ListActivity::class.java) //리스트 액티비티랑 바인딩하기
            startActivity(myintent)
        }
        binding.ivSuish.setOnClickListener{
            Log.d("whynot","whynot")
            val intent = Intent(requireContext(),ListActivity::class.java) //리스트 액티비티랑 바인딩하기
            startActivity(intent)
        }

        binding.clListGuide.requestFocus()

        binding.clListGuide.setOnClickListener{
            Log.d("whynot1","whynot1")
            val intent = Intent(requireContext(),ListActivity::class.java) //리스트 액티비티랑 바인딩하기
            startActivity(intent)
        }
        imageSwiper.start()

        initDummyData()
        initVP()
        return binding.root
    }
    override fun onDestroy() {
        super.onDestroy()
        imageSwiper.interrupt()
    }
    private fun initVP() {
            binding.vpHomeImage.adapter= ImageSliderVP(imgList,binding.vpHomeImage)//어댑터 적용+
            binding.vpHomeImage.orientation= ViewPager2.ORIENTATION_HORIZONTAL//orientation
            imgList.add(R.drawable._7f66c0f_3809_484f_92d2_96f4371397e2)
            imgList.add(R.drawable._65db003_b24c_4a3e_b80f_2d68ab0f5c51)
            imgList.add(R.drawable._189869a_2632_43dd_8b63_782de3d446cd)
    }

    private fun initDummyData(){//여긴 리싸이클러
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

        binding.rvPlaceChoice.layoutManager=
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL,false)
        binding.rvPlaceChoice.adapter= PlaceProductAdapter(placeList)
    }

    inner class ImageSwiper:Thread(){
        override fun run() {//스레드의 역할로 이거 실행한다 여기에 넣어서 실행
            try {
                while(true){
                    sleep(2000)
                    pagerHandler.post{//Post를 통해서 전달된 runnable객체는 핸들러를 통해 해당 스레드에서 실행된다!
                        var position=binding.vpHomeImage.currentItem//위치전달이요
                        position++;//실습과 다르게 여기는 postion을 내가 무한대로 설정해놨으니, 그냥 증가 시키면 자연스럽게 넘어가짐!
                        binding.vpHomeImage.currentItem=position
                    }//이벤트등록
                }
            }catch (e:InterruptedException){
                Log.d("interupt","스레드종료")
                interrupt()
            }//exctpion나면 종료
        }
    }


}