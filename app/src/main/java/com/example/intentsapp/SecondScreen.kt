package com.example.intentsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)

        val btnWebview = findViewById<Button>(R.id.btnWebview)
        btnWebview.setOnClickListener{
            intent = Intent(applicationContext,WebViewThirdScr::class.java)
            startActivity(intent)
        }
    }
}