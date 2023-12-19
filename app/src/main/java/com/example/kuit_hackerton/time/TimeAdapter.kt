package com.example.kuit_hackerton.time

import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kuit_hackerton.R
import com.example.kuit_hackerton.databinding.ItemTimeSelectBinding

class TimeAdapter(val gettime: ArrayList<TImeInfo>) :
    RecyclerView.Adapter<TimeAdapter.ViewHolder>() {

    private lateinit var itemClickListener: OnItemClickListener

    interface OnItemClickListener {
        fun onItemClick(timeinfo: TImeInfo)
    }

    inner class ViewHolder(val binding: ItemTimeSelectBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(timeinfo: TImeInfo) {
            binding.tvTime.text = timeinfo.Time
            binding.clItem.setOnClickListener {
                itemClickListener.onItemClick(timeinfo)
            }
        }
    }
    fun setOnItemClickListener(onItemClickListener: OnItemClickListener){
        itemClickListener=onItemClickListener
    }


override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val binding =
        ItemTimeSelectBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    return ViewHolder(binding)
}

override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.bind(gettime[position])
}

override fun getItemCount(): Int {
    return gettime.size
}

}
