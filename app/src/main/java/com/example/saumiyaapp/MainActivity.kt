package com.example.saumiyaapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        val btn2 = findViewById<Button>(R.id.button3)
        val btn3 = findViewById<Button>(R.id.button4)


        btn.setOnClickListener {
            val intent = Intent(this, diceRoller::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent = Intent(this, ui::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener {
            val intent = Intent(this, layout::class.java)
            startActivity(intent)
        }
    }
}