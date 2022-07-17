package com.example.to_dolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.task_view.view.*

class todoapapter(var data_Array : ArrayList<data>): RecyclerView.Adapter<todoapapter.MyViewHolder>(){
    class MyViewHolder(itemView : View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.task_view,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.taskInfo.text = data_Array[position].task.toString()
    }

    override fun getItemCount(): Int {
        return data_Array.size
    }
}