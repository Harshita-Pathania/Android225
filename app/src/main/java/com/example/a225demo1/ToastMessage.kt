package com.example.a225demo1

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ToastMessage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_toast_message)

        val a = findViewById<Button>(R.id.btn1)
        a.setOnClickListener {
            Toast.makeText(this,"Progress Bar clicked", Toast.LENGTH_LONG).show()
        }
        val b = findViewById<Button>(R.id.btn2)
        b.setOnClickListener {
            Toast.makeText(this,"Rating Bar clicked",Toast.LENGTH_SHORT).show()
        }
        val c = findViewById<Button>(R.id.btn3)
        c.setOnClickListener {
            Toast.makeText(this,"ToolBar clicked", Toast.LENGTH_LONG).show()
        }
    }
}