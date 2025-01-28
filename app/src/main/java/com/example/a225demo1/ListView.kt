package com.example.a225demo1

import android.os.Bundle
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)
        val list = findViewById<ListView>(R.id.ListView)
        val arr = arrayOf("Item 1","Item 2","Item 3","Item 4","Item 5","Item 6","Item 7","Item 8","Item 9","Item 10")
        val arrAd = ArrayAdapter(this, android.R.layout.simple_list_item_1, arr)
        val listFooter = layoutInflater.inflate(R.layout.list_view_footer,list, false) as ViewGroup
        list.addFooterView(listFooter)
        list.adapter = arrAd
    }
}