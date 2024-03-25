package com.example.explecit_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class Secondactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity2)

        val button2=findViewById<AppCompatButton>(R.id.button2)

        button2.setOnClickListener {
            //open a new activity

        }
    }
}