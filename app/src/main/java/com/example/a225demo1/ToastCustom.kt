package com.example.a225demo1

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ToastCustom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_toast_custom)

        val t = findViewById<Button>(R.id.img)
        t.setOnClickListener {
            val layout = layoutInflater.inflate(R.layout.custom_toast_image, null)
            val toast = Toast(applicationContext)
            toast.setGravity(Gravity.BOTTOM, 0 ,20)
            toast.duration = Toast.LENGTH_LONG
            toast.view = layout
            toast.show()
        }
    }
}