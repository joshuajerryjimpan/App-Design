package com.pan.myshoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity_Cloth_one : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_cloth_one)

        val btn_choice_one = findViewById<Button>(R.id.btn_choice_one)
        btn_choice_one.setOnClickListener{
            startActivity(Intent(this,FourthActivity_Cloth_one::class.java))
        }

        val btn_choice_two = findViewById<Button>(R.id.btn_choice_two)
        btn_choice_two.setOnClickListener {

        }

        val btn_choice_three = findViewById<Button>(R.id.btn_choice_three)
        btn_choice_three.setOnClickListener {

        }

        val btn_choice_four = findViewById<Button>(R.id.btn_choice_four)
        btn_choice_four.setOnClickListener {

        }
    }
}