package com.example.myapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HelloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        val username = intent.getStringExtra("USERNAME")
        val welcomeText = findViewById<TextView>(R.id.welcome_text)
        welcomeText.text = "Добро пожаловать, $username!"
    }
}