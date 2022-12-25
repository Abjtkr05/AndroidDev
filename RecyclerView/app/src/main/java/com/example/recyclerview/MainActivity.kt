package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var List = ArrayList<ContactModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recView.layoutManager =
            LinearLayoutManager(this)

        var model = ContactModel(R.drawable.burger,"JUNK FOOD")
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)
        List.add(model)

        var adapter1  = MyAddaptor(List)
        recView.layoutManager =
            LinearLayoutManager(this)
        recView.adapter = adapter1
    }

}