package com.example.pignatta_roll_the_dice

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var btnRoll : Button = findViewById(R.id.buttonRoll)
        btnRoll.setOnClickListener(View.OnClickListener {
            var toast : Toast = Toast.makeText(this, "LANCIO DEI DADI", Toast.LENGTH_LONG);
            toast.show();
            var mioIntent : Intent = Intent(this, SecondActivity::class.java);
            var mioRandom = (1..6).random()
            mioIntent.putExtra("MESSAGE", "NUMERO ESTRATTO: $mioRandom")
            startActivity(mioIntent)
        })
    }
}