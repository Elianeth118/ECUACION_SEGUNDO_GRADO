package com.example.ecuacion_segundo_grado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnIngresar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIngresar=findViewById(R.id.btnIngresar)
        btnIngresar.setOnClickListener {
            val intent: Intent = Intent(this, calcularActivity::class.java)
            startActivity(intent)

        }
    }
}