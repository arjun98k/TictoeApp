package com.example.tictactoegame

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        fun init() {
            val bt1: Button = findViewById(R.id.bt1)
            val bt2: Button = findViewById(R.id.bt2)
            val bt3: Button = findViewById(R.id.bt3)
            val bt4: Button = findViewById(R.id.bt4)
            val bt5: Button = findViewById(R.id.bt5)
            val bt6: Button = findViewById(R.id.bt6)
            val bt7: Button = findViewById(R.id.bt7)
            val bt8: Button = findViewById(R.id.bt8)
            val bt9: Button = findViewById(R.id.bt9)

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets



        }
    }
}