package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.`activity_2`)


                val backButton = findViewById<Button>(R.id.btn1)
                backButton.setOnClickListener {

                    finish()
                }
            }
        }