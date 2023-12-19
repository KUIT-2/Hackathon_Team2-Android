package com.example.kuit_hackerton.time

import android.app.Activity
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kuit_hackerton.R
import com.example.kuit_hackerton.ReservationInfoCheckFragment
import com.example.kuit_hackerton.TodayDecorator
import com.example.kuit_hackerton.databinding.FragmentCalanderBinding
import com.example.kuit_hackerton.restaurant.RestaurantActivity
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.prolificinteractive.materialcalendarview.CalendarDay
import com.prolificinteractive.materialcalendarview.MaterialCalendarView

class CalanderFragment : BottomSheetDialogFragment() {


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.setOnShowListener { dialogInterface ->
            val bottomSheetDialog = dialogInterface as BottomSheetDialog
            setupRatio(bottomSheetDialog)
        }
        return dialog
    }

    private fun setupRatio(bottomSheetDialog: BottomSheetDialog) {
        val bottomSheet =
            bottomSheetDialog.findViewById<View>(com.google.android.material.R.id.design_bottom_sheet) as View
        val behavior = BottomSheetBehavior.from(bottomSheet)
        val layoutParams = bottomSheet!!.layoutParams
        layoutParams.height = getBottomSheetDialogDefaultHeight()
        bottomSheet.layoutParams = layoutParams
        behavior.state = BottomSheetBehavior.STATE_EXPANDED
    }

    private fun getBottomSheetDialogDefaultHeight(): Int {
        return getWindowHeight() * 80 / 100
        // 기기 높이 대비 비율 설정 부분!!
        // 위 수치는 기기 높이 대비 80%로 다이얼로그 높이를 설정
    }

    private fun getWindowHeight(): Int {
        // Calculate window height for fullscreen use
        val displayMetrics = DisplayMetrics()
        (context as Activity?)!!.windowManager.defaultDisplay.getMetrics(displayMetrics)
        return displayMetrics.heightPixels
    }


    private var timeadapter: TimeAdapter? = null
    lateinit var binding: FragmentCalanderBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCalanderBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.cvOne.setOnClickListener{
            val drawable = GradientDrawable()
            drawable.shape = GradientDrawable.OVAL
            drawable.setColor(Color.parseColor("#F95001"))

            binding.cvOne.background = drawable
        }

        binding.cvTwo.setOnClickListener{
            val drawable = GradientDrawable()
            drawable.shape = GradientDrawable.OVAL
            drawable.setColor(Color.parseColor("#F95001"))
            binding.cvTwo.background = drawable

        }

        binding.cvThree.setOnClickListener{

            val drawable = GradientDrawable()
            drawable.shape = GradientDrawable.OVAL
            drawable.setColor(Color.parseColor("#F95001"))
            binding.cvThree.background = drawable

        }

        binding.cvFour.setOnClickListener{

            val drawable = GradientDrawable()
            drawable.shape = GradientDrawable.OVAL
            drawable.setColor(Color.parseColor("#F95001"))
            binding.cvFour.background = drawable

        }

        binding.cvFive.setOnClickListener{

            val drawable = GradientDrawable()
            drawable.shape = GradientDrawable.OVAL
            drawable.setColor(Color.parseColor("#F95001"))
            binding.cvFive.background = drawable

        }

        binding.cvSix.setOnClickListener{

            val drawable = GradientDrawable()
            drawable.shape = GradientDrawable.OVAL
            drawable.setColor(Color.parseColor("#F95001"))
            binding.cvSix.background = drawable

        }


        binding.cvSeven.setOnClickListener{
            val drawable = GradientDrawable()
            drawable.shape = GradientDrawable.OVAL
            drawable.setColor(Color.parseColor("#F95001"))
            binding.cvSeven.background = drawable

        }

        val calendar: MaterialCalendarView = view.findViewById(R.id.calendar)
        usingAdapter()
        // MaterialCalendarView 설정
        calendar.setSelectedDate(CalendarDay.today())
        calendar.addDecorator(TodayDecorator())

        return view
    }

    private fun usingAdapter() {
        val timeList = arrayListOf(
            TImeInfo("오후 6:30"),
            TImeInfo("오후 7:30"),
            TImeInfo("오후 8:30")
        )
        Log.d("isit", "hell")
        timeadapter = TimeAdapter(timeList)
        binding.rvTime.adapter = timeadapter

        binding.rvTime.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        timeadapter!!.setOnItemClickListener(object : TimeAdapter.OnItemClickListener {
            override fun onItemClick(timeinfo: TImeInfo) {

                val reserve02Fragment = ReservationInfoCheckFragment()
                val args = Bundle().apply {
                    putString("key", timeinfo.toString())
                }
                reserve02Fragment.arguments = args
                dismiss()
                (requireActivity() as RestaurantActivity).showReservationInfoCheckFragment()//여기 다시 해보기
            }
        })


    }
}