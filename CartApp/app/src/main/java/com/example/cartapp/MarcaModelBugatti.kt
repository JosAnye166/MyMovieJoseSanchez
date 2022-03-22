package com.example.cartapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MarcaModelBugatti : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marca_model_bugatti)
        val bLugarUno = findViewById<Button>(R.id.bLugarUno)
        val bLugarDos = findViewById<Button>(R.id.bLugarDos)
        val bLugarTres = findViewById<Button>(R.id.bLugarTres)
        val bLugarCuatro = findViewById<Button>(R.id.bLugarCuatro)
        val bLugarCinco = findViewById<Button>(R.id.bLugarCinco)
        val bLugarSeis = findViewById<Button>(R.id.bLugarSeis)

        val bRegresarEstadosMich = findViewById<Button>(R.id.bRegresarEstadosMich)

        bLugarUno.setOnClickListener{
            var intent = Intent(this, ModeloBugatti::class.java)
            startActivity(intent)
        }

        bLugarDos.setOnClickListener{
            var intent = Intent(this, ModeloBugattiDos::class.java)
            startActivity(intent)
        }

        bLugarTres.setOnClickListener{
            var intent = Intent(this, ModeloBugattiTres::class.java)
            startActivity(intent)
        }

        bLugarCuatro.setOnClickListener{
            var intent = Intent(this, ModeloBugattiCuatro::class.java)
            startActivity(intent)
        }

        bLugarCinco.setOnClickListener{
            var intent = Intent(this, ModeloBugattiCinco::class.java)
            startActivity(intent)
        }

        bLugarSeis.setOnClickListener{
            var intent = Intent(this, ModeloBugattiSeis::class.java)
            startActivity(intent)
        }

        bRegresarEstadosMich.setOnClickListener {
            finish()
        }

    }
}