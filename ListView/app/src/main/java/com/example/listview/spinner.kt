package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.listview.spinner
import kotlinx.android.synthetic.main.activity_spinner.*

class spinner : AppCompatActivity() {
    var list = ArrayList<String>()
    var list1 = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)
        list.add("Aadhar")
        list.add("Xth MarksSheet")
        list.add("XII MarksSheet")
        list.add("Driving License")
        list.add("Pan Card")
        list.add("Voter ID Card")
        list.add("PassPort")



        var spinnerAdapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,list)
        spinner.adapter = spinnerAdapter



        list1.add("Aadhar")
        list1.add("Xth MarksSheet")
        list1.add("XII MarksSheet")
        list1.add("Driving License")
        list1.add("Pan Card")
        list1.add("Voter ID Card")
        list1.add("PassPort")
        var spinnerAdapter1 = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list1)
        autoC.setAdapter(spinnerAdapter1)
        autoC.threshold = 1



    }
}