package com.example.recyclerview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.contact_row.view.*

class MyAddaptor(val LisT : ArrayList<ContactModel>) : RecyclerView.Adapter<MyAddaptor.MyViewHolder>(){

    class MyViewHolder( myView : View) : RecyclerView.ViewHolder(myView){

    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        val v = LayoutInflater.from(p0.context).inflate(R.layout.contact_row, p0, false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(p0: MyViewHolder, p1: Int) {
        p0.itemView.img.setImageResource(LisT[p1].img)
        p0.itemView.cap.text = LisT[p1].name
    }

    override fun getItemCount(): Int = LisT.size
}