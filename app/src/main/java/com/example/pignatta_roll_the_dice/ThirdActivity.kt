package com.example.pignatta_roll_the_dice

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)
        var numEstra = intent.getIntExtra("NUMESTRATTO", -1)
        var messWin = "";
        if (numEstra %2 == 0){
            messWin = "IL NUMERO ESTRATTO E' $numEstra QUINDI HAI PERSO."
        }
        else {
            messWin = "IL NUMERO ESTRATTO E' $numEstra QUINDI HAI VINTO!"
        }
        val textView = findViewById<TextView>(R.id.textViewActivityThirdWin)
        textView.text = messWin;
    }
}