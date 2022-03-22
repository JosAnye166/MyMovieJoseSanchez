package com.example.pokeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PokeTipoSiniestro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poke_tipo_siniestro)
        val bLugarUno = findViewById<Button>(R.id.bLugarUno)
        val bLugarDos = findViewById<Button>(R.id.bLugarDos)
        val bLugarTres = findViewById<Button>(R.id.bLugarTres)
        val bLugarCuatro = findViewById<Button>(R.id.bLugarCuatro)
        val bLugarCinco = findViewById<Button>(R.id.bLugarCinco)
        val bLugarSeis = findViewById<Button>(R.id.bLugarSeis)

        val bRegresarEstadosMex = findViewById<Button>(R.id.bRegresarEstadosMex)

        bLugarUno.setOnClickListener{
            var intent = Intent(this, TipoSiniestro::class.java)
            startActivity(intent)
        }

        bLugarDos.setOnClickListener{
            var intent = Intent(this, TipoSiniestroDos::class.java)
            startActivity(intent)
        }

        bLugarTres.setOnClickListener{
            var intent = Intent(this, TipoSiniestroTres::class.java)
            startActivity(intent)
        }

        bLugarCuatro.setOnClickListener{
            var intent = Intent(this, TipoSiniestroCuatro::class.java)
            startActivity(intent)
        }

        bLugarCinco.setOnClickListener{
            var intent = Intent(this, TipoSiniestroCinco::class.java)
            startActivity(intent)
        }

        bLugarSeis.setOnClickListener{
            var intent = Intent(this, TipoSiniestroSeis::class.java)
            startActivity(intent)
        }

        bRegresarEstadosMex.setOnClickListener {
            finish()
        }

    }
}