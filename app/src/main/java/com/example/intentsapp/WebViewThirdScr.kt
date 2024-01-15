package com.example.intentsapp

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class WebViewThirdScr : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_third_scr)

        val webViewVar = findViewById<WebView>(R.id.webViewGithub)
        webViewSetUp(webViewVar)
    }

//    how to create function?->using fun keyword after private keyword
//    syntax of writing function-> private(or public) fun <function name>(<variable name>: Type, parameter2,parameter3,...)
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("SetJavaScriptEnabled")
    private fun webViewSetUp(webView:WebView){
        webView.webViewClient = WebViewClient()
        webView.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://github.com/amankumar0724")
        }
    }
}