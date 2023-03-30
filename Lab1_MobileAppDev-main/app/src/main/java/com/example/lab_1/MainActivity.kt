package com.example.lab_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickButton: Button = findViewById(R.id.button)
        val toast = Toast.makeText(this, "Точно кнопка.", Toast.LENGTH_LONG)
        clickButton.setOnClickListener {
            toast.show()
        }
    }
}