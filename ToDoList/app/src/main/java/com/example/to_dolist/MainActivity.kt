package com.example.to_dolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.task_view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var data_Array = ArrayList<data>()


        var myAddapter  = todoapapter(data_Array)
        taskList.layoutManager = LinearLayoutManager(this)
        taskList.adapter = myAddapter
        taskAdd.setOnClickListener(){
            var VAR : String = taskInput.text.toString();
            var dataA = data(VAR)
            data_Array.add(dataA)
            myAddapter.notifyDataSetChanged()
            val es = ""
            taskInput.setText(es)
            taskInput.hint = "Enter Task"

        }
    }
}