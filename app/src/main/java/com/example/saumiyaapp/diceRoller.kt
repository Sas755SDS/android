package com.example.saumiyaapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class diceRoller : AppCompatActivity() {
    lateinit var btn:Button
    lateinit var image:ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_roller)
        btn= findViewById(R.id.button2)
        image= findViewById(R.id.imageView)
        btn.setOnClickListener {
            var a =diceRoller()
           image.setImageResource(a)

        }
    }
    fun diceRoller(): Int {
        val random = (1..6).random()

      return when(random){
            1 -> R.drawable.dice_1
            2 ->  R.drawable.dice_2
            3 ->  R.drawable.dice_3
            4 ->  R.drawable.dice_4
            5 ->  R.drawable.dice_5
           else -> {R.drawable.dice_6}
       }


    }
}