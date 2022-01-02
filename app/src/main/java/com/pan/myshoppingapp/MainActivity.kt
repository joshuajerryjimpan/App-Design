package com.pan.myshoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_grocery = findViewById<Button>(R.id.btn_grocery)
        btn_grocery.setOnClickListener{

        }

        val btn_electricity = findViewById<Button>(R.id.btn_choice_two)
        btn_electricity.setOnClickListener {

        }

        val btn_food = findViewById<Button>(R.id.btn_choice_three)
        btn_food.setOnClickListener {

        }

        val btn_cloth = findViewById<Button>(R.id.btn_choice_four)
        btn_cloth.setOnClickListener {
            startActivity(Intent(this,SecondActivity_Cloth::class.java))
        }

        val btn_sign = findViewById<Button>(R.id.btn_sign)
        btn_sign.setOnClickListener {
            startActivity(Intent(this,SignActivity::class.java))
        }

        val btn_login = findViewById<Button>(R.id.btn_login)
        btn_login.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}