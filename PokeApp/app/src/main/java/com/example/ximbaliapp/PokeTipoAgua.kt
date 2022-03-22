package com.example.ximbaliapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PokeTipoAgua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poke_tipo_agua)
        val bLugarUno = findViewById<Button>(R.id.bLugarUno)
        val bLugarDos = findViewById<Button>(R.id.bLugarDos)
        val bLugarTres = findViewById<Button>(R.id.bLugarTres)
        val bLugarCuatro = findViewById<Button>(R.id.bLugarCuatro)
        val bLugarCinco = findViewById<Button>(R.id.bLugarCinco)
        val bLugarSeis = findViewById<Button>(R.id.bLugarSeis)

        val bRegresarEstadosMich = findViewById<Button>(R.id.bRegresarEstadosMich)

        bLugarUno.setOnClickListener{
            var intent = Intent(this, TipoAgua::class.java)
            startActivity(intent)
        }

        bLugarDos.setOnClickListener{
            var intent = Intent(this, TipoAguaDos::class.java)
            startActivity(intent)
        }

        bLugarTres.setOnClickListener{
            var intent = Intent(this, TipoAguaTres::class.java)
            startActivity(intent)
        }

        bLugarCuatro.setOnClickListener{
            var intent = Intent(this, TipoAguaCuatro::class.java)
            startActivity(intent)
        }

        bLugarCinco.setOnClickListener{
            var intent = Intent(this, TipoAguaCinco::class.java)
            startActivity(intent)
        }

        bLugarSeis.setOnClickListener{
            var intent = Intent(this, TipoAguaSeis::class.java)
            startActivity(intent)
        }

        bRegresarEstadosMich.setOnClickListener {
            finish()
        }

    }
}