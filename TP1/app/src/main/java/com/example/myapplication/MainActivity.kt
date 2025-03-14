package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val EXTRA_TEXT = "text_to_display"

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
        val textView : TextView = findViewById<Button>(R.id.textView)
        val editText : TextView = findViewById<Button>(R.id.editTextText)
        val text = editText.text.toString()

        premierBouton.setOnClickListener {



            if(text == "afficher nouveau textView"){
                val layoutPrincipal : ConstraintLayout = findViewById(R.id.main)
                val deuxiemeTextView : TextView = TextView(this)
                deuxiemeTextView.text = editText.text
                layoutPrincipal.addView(deuxiemeTextView)
            } else {
                textView.text = editText.text
            }
        }

        val deuxiemeBouton : Button = findViewById(R.id.button2)

        deuxiemeBouton.setOnClickListener{
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
            intent.putExtra(EXTRA_TEXT,textView.text )
        }
    }
}