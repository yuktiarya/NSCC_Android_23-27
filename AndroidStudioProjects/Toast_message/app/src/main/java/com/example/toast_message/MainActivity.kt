package com.example.toast_message

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttondownload=findViewById<Button>(R.id.button1)
        val buttonupload=findViewById<Button>(R.id.button2)

        buttondownload.setOnClickListener {
            Toast.makeText(applicationContext, "downloading..",Toast.LENGTH_LONG).show()
        }
        buttonupload.setOnClickListener {
            Toast.makeText(applicationContext,"uploading ..",Toast.LENGTH_LONG).show()
        }

    }
}