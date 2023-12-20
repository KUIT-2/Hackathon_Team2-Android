package com.example.kuit_hackerton

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kuit_hackerton.databinding.ActivityRestListDiscreteBinding
import com.example.kuit_hackerton.databinding.ItemTimeSelectBinding
import com.example.kuit_hackerton.time.TimeAdapter

class RestaurantListAdapter(val reslist: ArrayList<RestaurantListData>) :
    RecyclerView.Adapter<RestaurantListAdapter.ViewHolder>() {

    private lateinit var itemClickListener: OnItemClickListener

    interface OnItemClickListener {
        fun onItemClick(reslist: RestaurantListData)

    }

    inner class ViewHolder(val binding: ActivityRestListDiscreteBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(reslist: RestaurantListData) {
            binding.storeName.text=reslist.store
            binding.itemEverything.setOnClickListener {
                itemClickListener.onItemClick(reslist)
            }
        }
    }
    fun setOnItemClickListener(onItemClickListener:OnItemClickListener){
        itemClickListener=onItemClickListener
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantListAdapter.ViewHolder {
        val binding =
            ActivityRestListDiscreteBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }
    override fun onBindViewHolder(holder: RestaurantListAdapter.ViewHolder, position: Int) {
        holder.bind(reslist[position])
    }
    override fun getItemCount(): Int {
        return reslist.size
    }
}