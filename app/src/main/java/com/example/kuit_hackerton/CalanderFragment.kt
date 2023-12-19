package com.example.kuit_hackerton

import android.app.Activity
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kuit_hackerton.databinding.FragmentCalanderBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.prolificinteractive.materialcalendarview.CalendarDay
import com.prolificinteractive.materialcalendarview.MaterialCalendarView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CalanderFragment : BottomSheetDialogFragment()  {


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.setOnShowListener { dialogInterface ->
            val bottomSheetDialog = dialogInterface as BottomSheetDialog
            setupRatio(bottomSheetDialog)
        }
        return dialog
    }

    private fun setupRatio(bottomSheetDialog: BottomSheetDialog){
    val bottomSheet = bottomSheetDialog.findViewById<View>(com.google.android.material.R.id.design_bottom_sheet) as View
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






lateinit var binding: FragmentCalanderBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCalanderBinding.inflate(inflater, container, false)
        val view = binding.root



        // 프래그먼트의 레이아웃을 먼저 inflate
        // 레이아웃에서 MaterialCalendarView 찾아옴
        val calendar: MaterialCalendarView = view.findViewById(R.id.calendar)
        usingAdapter()
        // MaterialCalendarView 설정
        calendar.setSelectedDate(CalendarDay.today())
        calendar.addDecorator(TodayDecorator())

        return view
    }

    private fun usingAdapter() {
        val timeList= arrayListOf(
            TImeInfo("오후 6:30"),
            TImeInfo("오후 7:30"),
            TImeInfo("오후 8:30")
        )
        Log.d("isit","hell")
        binding.rvTime.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        binding.rvTime.adapter=TimeAdapter(timeList)
    }
}