package com.example.travelapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OnboardingActivity03 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding03)

        val btnNext: Button = findViewById(R.id.btnLetsTour)
        btnNext.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)  // Go to HomePage
            startActivity(intent)
            finish()
        }
    }
}