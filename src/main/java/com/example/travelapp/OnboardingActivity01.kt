package com.example.travelapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OnboardingActivity01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding01)

        // Navigate to OnboardingActivity02 when clicking "Next"
        val btnNext: Button = findViewById(R.id.btnGetStarted)
        btnNext.setOnClickListener {
            val intent = Intent(this, OnboardingActivity02::class.java)
            startActivity(intent)
            // Don't call finish() here, let the user go back if needed
        }
    }
}
