package com.example.travelapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class BookingDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_details)

        // Find the Check Out button
        val checkoutButton = findViewById<Button>(R.id.checkoutButton01)

        // Set click listener to navigate to PaymentMethodActivity
        checkoutButton.setOnClickListener {
            val intent = Intent(this, PaymentMethodActivity::class.java)
            startActivity(intent)
        }
    }
}
