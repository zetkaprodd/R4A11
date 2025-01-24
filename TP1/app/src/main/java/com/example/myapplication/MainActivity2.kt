package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }

        val intent = intent

        intent.getStringExtra(EXTRA_TEXT)
        val textView2 : TextView = findViewById<Button>(R.id.textView2)
        textView2.text = EXTRA_TEXT;

        val button_previous : Button = findViewById(R.id.button3)

        button_previous.setOnClickListener{
            val intent = Intent(this@MainActivity2, MainActivity::class.java)
            startActivity(intent)
        }
    }


}