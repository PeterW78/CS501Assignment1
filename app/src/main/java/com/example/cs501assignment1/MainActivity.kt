package com.example.cs501assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sayButton: Button = findViewById(R.id.say_button)
        var textBox: TextView = findViewById(R.id.textBox)

        sayButton.setOnClickListener { view: View ->
            textBox.text = "Hello World!"
        }
    }
}