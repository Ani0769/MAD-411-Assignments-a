package com.example.myapp

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


    class MainActivity : AppCompatActivity() {

        private lateinit var nameText: EditText
        private lateinit var textView: TextView

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            nameText = findViewById(R.id.editTextText)
            textView = findViewById(R.id.textView4)
        }

        fun calculateClick(view: View) {
            val numAttendStr = nameText.text.toString()

            textView.text = "Hello: $numAttendStr"
        }
    }