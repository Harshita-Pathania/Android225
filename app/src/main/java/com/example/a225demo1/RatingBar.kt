package com.example.a225demo1

import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RatingBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rating_bar)

        val r = findViewById<RatingBar>(R.id.ratingBar)
        val t = findViewById<TextView>(R.id.txt1)

        r.setOnRatingBarChangeListener { _, rating, _ ->
            t.text = "Your Rating is: $rating"
        }
    }
}