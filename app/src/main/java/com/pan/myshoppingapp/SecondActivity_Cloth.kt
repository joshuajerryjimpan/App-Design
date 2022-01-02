package com.pan.myshoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity_Cloth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_cloth)

        val btn_tshirt = findViewById<Button>(R.id.btn_tshirt)
        btn_tshirt.setOnClickListener {
            startActivity(Intent(this,ThirdActivity_Cloth_one::class.java))
        }

        val btn_shirt = findViewById<Button>(R.id.btn_shirt)
        btn_shirt.setOnClickListener {

        }

        val btn_shorts = findViewById<Button>(R.id.btn_shorts)
        btn_shorts.setOnClickListener {

        }

        val btn_pants = findViewById<Button>(R.id.btn_pants)
        btn_pants.setOnClickListener {

        }
    }
}