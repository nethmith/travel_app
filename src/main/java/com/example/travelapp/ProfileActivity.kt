package com.example.travelapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.travelapp.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileActivity : AppCompatActivity() {

    private lateinit var username: TextView
    private lateinit var handle: TextView
    private lateinit var followersCount: TextView
    private lateinit var avgPosts: TextView
    private lateinit var likesCount: TextView
    private lateinit var viewsCount: TextView
    private lateinit var updatesTab: Button
    private lateinit var collectionsTab: Button
    private lateinit var aboutTab: Button
    private lateinit var homeButton: ImageButton
    private lateinit var likesButton: ImageButton
    private lateinit var profileButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigation.selectedItemId = R.id.nav_profile // Changed from nav_home to nav_profile

        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    val intent = Intent(this, HomePage::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_favorites -> {
                    val intent = Intent(this, FavoritesActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_profile -> {
                    true
                }
                else -> false
            }
        }
    }
}