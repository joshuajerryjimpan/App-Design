package com.pan.mywebapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity_two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_two)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            startActivity(Intent(this,SecondActivity::class.java))
        }
    }
}