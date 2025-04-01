package com.example.travelapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Delay for 3 seconds, then go to OnboardingActivity01
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, OnboardingActivity01::class.java)
            startActivity(intent)
            finish() // Close SplashActivity
        }, 3000) // 3 seconds delay
    }
}
