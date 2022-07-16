package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var list = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list.add("Abhi")
        list.add("is")
        list.add("learning")
        list.add("android")
        list.add("devlopment")
        list.add("in")
        list.add("kotlin")
        list.add("Abhi")
        list.add("is")
        list.add("learning")
        list.add("android")
        list.add("devlopment")
        list.add("in")
        list.add("kotlin")
        list.add("Abhi")
        list.add("is")
        list.add("learning")
        list.add("android")
        list.add("devlopment")
        list.add("in")
        list.add("kotlin")
        list.add("Abhi")
        list.add("is")
        list.add("learning")
        list.add("android")
        list.add("devlopment")
        list.add("in")
        list.add("kotlin")

        var adaptor = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list)
        listview.adapter = adaptor
        listview.setOnItemClickListener { adapterView, view, i, l ->
            intent = Intent(this,spinner::class.java)
            startActivity(intent)
        }

    }
}