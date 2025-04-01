package com.example.travelapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TourDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tour_details)

        // Find the "Book Now" button
        val bookNowButton = findViewById<Button>(R.id.bookNowButton)

        // Set a click listener
        bookNowButton.setOnClickListener {
            // Navigate to BookingDetailsActivity
            val intent = Intent(this, BookingDetailsActivity::class.java)
            startActivity(intent)
        }
    }
}
