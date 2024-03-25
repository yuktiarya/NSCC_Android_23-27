package com.example.explecit_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1=findViewById<AppCompatButton>(R.id.button)

        button1.setOnClickListener {
            //open a new activity

            intent=Intent(applicationContext,Secondactivity::class.java)
            startActivity(intent)
        }
    }
}