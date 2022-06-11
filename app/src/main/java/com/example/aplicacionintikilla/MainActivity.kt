package com.example.aplicacionintikilla

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnIngresar: Button = findViewById(R.id.btnIngresar);
        var btnRegistrarse: Button = findViewById(R.id.btnRegistrarse);

        btnIngresar.setOnClickListener {
            val intent:Intent = Intent( this, MainActivityIngresar:: class.java)
            startActivity(intent)
        }
    }
}