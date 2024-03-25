package com.example.theme_color

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttondark=findViewById<AppCompatButton>(R.id.btndark)
        val buttonread=findViewById<AppCompatButton>(R.id.btnread)
        val layout=findViewById<LinearLayout>(R.id.Linearlayout)

        buttondark.setOnClickListener {
            layout.setBackgroundColor(resources.getColor(android.R.color.black))
        }
        buttonread.setOnClickListener {
        layout.setBackgroundColor(resources.getColor(android.R.color.holo_orange_light))
        }

    }
}