package com.example.aprendamoslasvocales

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Button = findViewById<Button>(R.id.bt_start)
            Button.setOnClickListener{
                val intent= Intent(this, MenuSecundario::class.java)
                startActivity(intent)
        }
    }
}