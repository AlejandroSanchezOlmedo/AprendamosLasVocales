package com.example.aprendamoslasvocales

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuSecundario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_secundario)
        val Button = findViewById<Button>(R.id.bt_jugar)
        Button.setOnClickListener{
            val intent= Intent(this, Jugar::class.java)
            startActivity(intent)
    }

}
}