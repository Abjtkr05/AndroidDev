package com.example.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todo.Models.Todo
import com.example.todo.adapters.ToDoadapters
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val Todo : ArrayList<Todo> = ArrayList( )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        task.layoutManager = LinearLayoutManager(this)
        val toDoadapters : ToDoadapters = ToDoadapters()
        task.adapter = toDoadapters

    }
}