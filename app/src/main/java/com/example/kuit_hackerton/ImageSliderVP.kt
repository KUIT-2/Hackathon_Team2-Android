package com.example.kuit_hackerton

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kuit_hackerton.databinding.ItemBannerImageBinding

class ImageSliderVP(val context: Context, private val imgList: List<Int>): RecyclerView.Adapter<ImageSliderVP.ViewHolder>() {
        inner class ViewHolder(val binding: ItemBannerImageBinding): RecyclerView.ViewHolder(binding.root) {
            val imageView: ImageView = itemView.findViewById(R.id.rv_place_choice)
            fun bind(drawableResId: Int){
                Glide.with(context)
                    .load(drawableResId)
                    .into(binding.bannerImageViewpager)
            }
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