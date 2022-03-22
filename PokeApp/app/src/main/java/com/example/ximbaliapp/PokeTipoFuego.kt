package com.example.ximbaliapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PokeTipoFuego : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poke_tipo_fuego)
        val bLugarUno = findViewById<Button>(R.id.bLugarUno)
        val bLugarDos = findViewById<Button>(R.id.bLugarDos)
        val bLugarTres = findViewById<Button>(R.id.bLugarTres)
        val bLugarCuatro = findViewById<Button>(R.id.bLugarCuatro)
        val bLugarCinco = findViewById<Button>(R.id.bLugarCinco)
        val bLugarSeis = findViewById<Button>(R.id.bLugarSeis)

        val bRegresarEstadosCam = findViewById<Button>(R.id.bRegresarEstadosCam)

        bLugarUno.setOnClickListener{
            var intent = Intent(this, TipoFuego::class.java)
            startActivity(intent)
        }

        bLugarDos.setOnClickListener{
            var intent = Intent(this, TipoFuegoDos::class.java)
            startActivity(intent)
        }

        bLugarTres.setOnClickListener{
            var intent = Intent(this, TipoFuegoTres::class.java)
            startActivity(intent)
        }

        bLugarCuatro.setOnClickListener{
            var intent = Intent(this, TipoFuegoCuatro::class.java)
            startActivity(intent)
        }

        bLugarCinco.setOnClickListener{
            var intent = Intent(this, TipoFuegoCinco::class.java)
            startActivity(intent)
        }

        bLugarSeis.setOnClickListener{
            var intent = Intent(this, TipoFuegoSeis::class.java)
            startActivity(intent)
        }

        bRegresarEstadosCam.setOnClickListener {
            finish()
        }

    }
}