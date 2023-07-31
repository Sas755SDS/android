package com.example.saumiyaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class ui : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ui)

        val btnDark = findViewById<Button>(R.id.btnDark)
        val btnLight = findViewById<Button>(R.id.btnLight)
        val layout = findViewById<ConstraintLayout>(R.id.layout)

        btnLight.setOnClickListener {
            layout.setBackgroundResource(R.color.white)
        }
        btnDark.setOnClickListener {
            layout.setBackgroundResource(R.color.black)
        }
    }
}