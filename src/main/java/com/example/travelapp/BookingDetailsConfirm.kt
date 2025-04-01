package com.example.travelapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class BookingDetailsConfirm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_confirm)

        // Find the button by ID
        val confirmBooking = findViewById<Button>(R.id.btnConfirmBooking)

        // Set Click listener
        confirmBooking.setOnClickListener{
            // Start BookingDetailsConfirm
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }
    }
}