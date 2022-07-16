package com.example.firstkotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add.setOnClickListener {
            val result = num1.text.toString().toInt() + num2.text.toString().toInt()
            ans.text = result.toString();
        }
    }
}