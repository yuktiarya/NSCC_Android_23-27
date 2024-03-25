package com.example.myapplication3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import org.xml.sax.HandlerBase

class Next_Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next2)
        Handler().postDelayed({
            val intent= Intent(this@Next_Activity2,MainActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}