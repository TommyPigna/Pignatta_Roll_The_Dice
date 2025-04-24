package com.example.pignatta_roll_the_dice

import android.os.Bundle
import android.widget.ImageView
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
        var i=0;
        if (numEstra %2 == 0){
            messWin = "IL NUMERO E' PARI QUINDI HAI PERSO."
        }
        else {
            messWin = "IL NUMERO E' DISPARI QUINDI HAI VINTO!!!"
        }
        val textView = findViewById<TextView>(R.id.textViewActivityThirdWin)
        textView.text = messWin;
        var imageViewThird = findViewById<ImageView>(R.id.imageViewThirdActivity)


        var imm = when(numEstra){
            1 -> R.drawable.victory
            2 -> R.drawable.lose
            3 -> R.drawable.victory
            4 -> R.drawable.lose
            5 -> R.drawable.victory
            6 -> R.drawable.lose
            else -> {R.drawable.dices}
        }
        imageViewThird.setImageResource(imm)
    }


}