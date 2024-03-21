package com.example.shadowmsgandtracking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe: Button = findViewById(R.id.btnClickMe)
        //lambda expression
        btnClickMe.setOnClickListener {
            Log.i("MainActivity", "Button was clicked ")
            //log information it takes 2 parameters first main and msg
            Toast.makeText(this, "Button was clicked", Toast.LENGTH_SHORT).show()
            //Toast.makeText is to display msg
            //this refers to the mainActivity
            //LENGTH_SHORT is the duration
        }
    }
}
