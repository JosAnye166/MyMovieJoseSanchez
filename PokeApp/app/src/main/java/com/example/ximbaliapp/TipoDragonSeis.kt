package com.example.ximbaliapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TipoDragonSeis : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tipo_dragon_seis)

        val bRegresar = findViewById<Button>(R.id.bRegresar)

        bRegresar.setOnClickListener {
            finish()
        }
    }
}