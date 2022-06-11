package com.example.aplicacionintikilla

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

class MainActivityIngresar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ingresar)
        var btnSalir :Button = findViewById(R.id.btnSalir);
        btnSalir.setOnClickListener {
            val intent: Intent = Intent( this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}