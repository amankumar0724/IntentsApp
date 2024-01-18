package com.example.intentsapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.UPSIDE_DOWN_CAKE)
    @SuppressLint("ResourceType", "MissingInflatedId")
//    creating key
    companion object{
        const val KEY = "com.example.intentsapp.MainActivity.KEY"
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val proceed = findViewById<Button>(R.id.proceed)
        val fname = findViewById<EditText>(R.id.fname)
        val githubUsername = findViewById<EditText>(R.id.githubUsername)
        proceed.setOnClickListener{
            val welcome = "Welcome"+' '+ fname.text.toString() + '!'
            val github = githubUsername.text.toString()
            intent = Intent(this,SecondScreen::class.java)
            intent.putExtra(KEY,welcome)
            intent.putExtra("githubID",github)
            startActivity(intent)
        }


//        val homeScreen = findViewById<LinearLayout>(R.id.homeScreen)
//        val btnDark = findViewById<Button>(R.id.btnDark)
//        val btnLight = findViewById<Button>(R.id.btnLight)
//        val textView = findViewById<TextView>(R.id.textView)
//        val openCamera = findViewById<CardView>(R.id.openCamera)
//        val openLeetcode = findViewById<CardView>(R.id.openLeetcode)
//        val nextPage = findViewById<CardView>(R.id.nextPage)
//        btnDark.setOnClickListener{
////            change to dark
//            homeScreen.setBackgroundResource(R.color.richBlack)
//            textView.setTextColor(resources.getColor(android.R.color.white))
//        }
//        btnLight.setOnClickListener{
////            change to light
//            homeScreen.setBackgroundResource(R.color.aliceBlue)
//            textView.setTextColor(resources.getColor(android.R.color.black))
//        }
//        openCamera.setOnClickListener{
//            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//            startActivity(intent)
//        }
//        openLeetcode.setOnClickListener{
//            val intent =  Intent(Intent.ACTION_VIEW)
//            intent.data = Uri.parse("https://leetcode.com/DheerajSonkar63/")
//            startActivity(intent)
//        }
//        nextPage.setOnClickListener{
//            intent = Intent(applicationContext,SecondScreen::class.java)
//            startActivity(intent)
//        }

    }
}