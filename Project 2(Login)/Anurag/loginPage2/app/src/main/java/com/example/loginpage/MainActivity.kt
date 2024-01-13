package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val secondActButton = findViewById<Button>(R.id.button1)
        secondActButton.setOnClickListener{
            val  Intent = Intent(this,activity2::class.java)
            startActivity(Intent)

        }

    }
}
