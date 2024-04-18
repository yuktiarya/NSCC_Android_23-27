package com.example.functionalapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Secondactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)

        val contect=findViewById<Button>(R.id.contectButton)

        contect.setOnClickListener {
            intent=Intent(Intent.ACTION_CALL)
            intent.data= Uri.parse("tel:8630027564")
            startActivity(intent)

        }
        val Android=findViewById<Button>(R.id.AndroidButton)
        Android.setOnClickListener {
            intent=Intent(applicationContext,Android_btn::class.java)
            startActivity(intent)
        }
        val Web=findViewById<Button>(R.id.WebButton)
        Web.setOnClickListener {
            intent=Intent(applicationContext,Web_Activity::class.java)
            startActivity(intent)
        }


        val IOS=findViewById<Button>(R.id.IosButton)
        IOS.setOnClickListener {
            intent=Intent(applicationContext,Ios_activity::class.java)
            startActivity(intent)
        }

        val Machine=findViewById<Button>(R.id.MachineButton)
        Machine.setOnClickListener {
            intent=Intent(applicationContext,Machine_Activity::class.java)
            startActivity(intent)
        }

        val Block=findViewById<Button>(R.id.BlockButton)
        Block.setOnClickListener {
            intent=Intent(applicationContext,Block_Activity::class.java)
            startActivity(intent)
        }

        val AI=findViewById<Button>(R.id.AIButton)
        AI.setOnClickListener {
            intent=Intent(applicationContext,AI_Activity::class.java)
            startActivity(intent)
        }

          }

}