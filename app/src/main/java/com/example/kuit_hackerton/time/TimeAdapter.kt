package com.example.kuit_hackerton.time

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kuit_hackerton.R

class TimeAdapter(val gettime:ArrayList<TImeInfo>):RecyclerView.Adapter<TimeAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView){
            val time=itemView.findViewById<TextView>(R.id.tv_time)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_time_select,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.time.text=gettime.get(position).Time//타임 넣어줌
    }

    override fun getItemCount(): Int {
        return gettime.size
    }


}