package com.example.travelapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PaymentMethodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_method)

        // Find the button by ID
        val payNowButton = findViewById<Button>(R.id.add_new_card_button)

        // Set click listener
        payNowButton.setOnClickListener {
            // Start BookingDetailsConfirmActivity
            val intent = Intent(this, BookingDetailsConfirm::class.java)
            startActivity(intent)
        }
    }
}
