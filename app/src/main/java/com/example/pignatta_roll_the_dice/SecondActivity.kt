package com.example.pignatta_roll_the_dice

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        var msg=intent.getStringExtra("MESSAGE")
        val textView = findViewById<TextView>(R.id.textViewSecondActivity)
        textView.text = msg;
        }
    }