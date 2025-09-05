package com.fara7.tom_and_jerry

import android.os.Bundle
import android.view.View
import android.widget.ScrollView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        WindowCompat.getInsetsController(window, window.decorView).apply {
            isAppearanceLightStatusBars = true
        }
        setContentView(R.layout.cry)
        val scrollView = findViewById<ScrollView>(R.id.scrollable)
        scrollView.systemBarsPadding()
    }
}