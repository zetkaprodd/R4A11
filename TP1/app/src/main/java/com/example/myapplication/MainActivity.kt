package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val premierBouton : Button = findViewById<Button>(R.id.button)

        premierBouton.setOnClickListener {

            val textView : TextView = findViewById<Button>(R.id.textView)
            val editText : TextView = findViewById<Button>(R.id.editTextText)
            val text = editText.text.toString()

            if(text == "afficher nouveau textView"){
                val layoutPrincipal : ConstraintLayout = findViewById(R.id.main)
                val deuxiemeTextView : TextView = TextView(this)
                deuxiemeTextView.text = editText.text
                layoutPrincipal.addView(deuxiemeTextView)
            } else {
                textView.text = editText.text
            }
        }
    }
}