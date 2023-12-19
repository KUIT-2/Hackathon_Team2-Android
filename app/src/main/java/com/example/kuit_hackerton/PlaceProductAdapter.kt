package com.example.kuit_hackerton

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class PlaceProductAdapter(val placeList: ArrayList<ItemPlaceProduct>):RecyclerView.Adapter<PlaceProductAdapter.CustomViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceProductAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_place_product,parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlaceProductAdapter.CustomViewHolder, position: Int) {
        holder.place.setImageResource(placeList.get(position).place)
    }

    override fun getItemCount(): Int {
        return placeList.size
    }
    class CustomViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val place = itemView.findViewById<ImageView>(R.id.iv_place_list)
    }


}