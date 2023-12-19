package com.example.kuit_hackerton.place

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.kuit_hackerton.R

class ImageSliderVP(
    private val sliderItems: MutableList<Int>,
    private val viewPager2: ViewPager2
): RecyclerView.Adapter<ImageSliderVP.ViewHolder>() {

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private val imageView = view.findViewById<ImageView>(R.id.banner_image_viewpager)

        fun onBind(image: Int) {
            imageView.setImageResource(image)
        }
    }  override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_banner_image, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(sliderItems[position%sliderItems.size])

    }

    override fun getItemCount(): Int = Int.MAX_VALUE

    private val runnable = Runnable { sliderItems.addAll(sliderItems) }
}