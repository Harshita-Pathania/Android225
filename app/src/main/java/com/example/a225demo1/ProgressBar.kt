package com.example.a225demo1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProgressBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_progress_bar)

        val b = findViewById<Button>(R.id.btn)
        val p = findViewById<ProgressBar>(R.id.prog)

        b.setOnClickListener{
            p.visibility = View.VISIBLE
            b.isEnabled = false
        }
    }
}