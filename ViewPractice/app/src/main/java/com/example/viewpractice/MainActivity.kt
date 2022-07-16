package com.example.viewpractice

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Linear.setOnClickListener{
            intent = Intent(this,LinearLayout::class.java)
            startActivity(intent)
        }
    }
}