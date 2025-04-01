// OnboardingActivity02.kt
package com.example.travelapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OnboardingActivity02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding02)

        // Navigate to OnboardingActivity03 when clicking "Next"
        val btnNext: Button = findViewById(R.id.btnNext)
        btnNext.setOnClickListener {
            val intent = Intent(this, OnboardingActivity03::class.java)
            startActivity(intent)
            finish() // Close OnboardingActivity02 to prevent going back
        }
    }
}

