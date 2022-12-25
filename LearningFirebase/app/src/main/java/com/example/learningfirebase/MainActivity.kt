package com.example.learningfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            database = FirebaseDatabase.getInstance("https://learningfirebase-f9c60-default-rtdb.asia-southeast1.firebasedatabase.app").reference
            database.push().setValue(Edit.text.toString()).addOnSuccessListener {
                Edit.text.clear()
            }.addOnCanceledListener {
                Toast.makeText(this,"ss",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
