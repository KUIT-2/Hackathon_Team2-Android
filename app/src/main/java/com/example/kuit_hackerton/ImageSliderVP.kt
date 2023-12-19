package com.example.kuit_hackerton

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kuit_hackerton.databinding.FragmentSerchBinding
import com.example.kuit_hackerton.databinding.ItemBannerImageBinding

class ImageSliderVP(private val imgList: List<Int>): RecyclerView.Adapter<ImageSliderVP.ViewHolder>() {
        inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
            val imageView: ImageView = itemView.findViewById(R.id
        }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val binding = ItemBannerImageBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            return ViewHolder(binding)

        }
        override fun getItemCount(): Int = imgList.size
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(imgList[position])
        }
}