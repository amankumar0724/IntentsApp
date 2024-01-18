package com.example.intentsapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout

class SecondScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    @RequiresApi(Build.VERSION_CODES.UPSIDE_DOWN_CAKE)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)
        val Welcomeid = findViewById<TextView>(R.id.Welcomeid)
        val welcome = intent.getStringExtra(MainActivity.KEY)
        Welcomeid.text = welcome.toString()
        val btnDark = findViewById<Button>(R.id.btnDark)
        val btnLight = findViewById<Button>(R.id.btnLight)
        val CompletePage = findViewById<ConstraintLayout>(R.id.CompletePage)
        btnDark.setOnClickListener{
//            change to dark
            CompletePage.setBackgroundResource(R.color.black)
        }
        btnLight.setOnClickListener{
//            change to light
            CompletePage.setBackgroundResource(R.color.white)
        }
        val AppD = findViewById<CardView>(R.id.AppD)
        val GIThub = findViewById<CardView>(R.id.Github)
        GIThub.setOnClickListener{
            val githubUsername = intent.getStringExtra("githubID")
            intent = Intent(this,WebViewThirdScr::class.java)
            intent.putExtra("ID1",githubUsername)
            intent.putExtra("ID1","id1")
            startActivity(intent)
        }
        AppD.setOnClickListener{
            intent = Intent(applicationContext,WebViewThirdScr::class.java)
            intent.putExtra("ID1","id2")
            startActivity(intent)
        }
    }
}

