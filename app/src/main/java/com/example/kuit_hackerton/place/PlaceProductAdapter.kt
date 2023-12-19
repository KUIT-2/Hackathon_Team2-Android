package com.example.kuit_hackerton.place

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.kuit_hackerton.ItemPlaceProduct
import com.example.kuit_hackerton.R

class PlaceProductAdapter(val placeList: ArrayList<PlaceProduct>):RecyclerView.Adapter<PlaceProductAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val place = itemView.findViewById<ImageView>(R.id.iv_place_list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_place_product,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.place.setImageResource(placeList.get(position).place)
    }

    override fun getItemCount(): Int {
        return placeList.size
    }

}