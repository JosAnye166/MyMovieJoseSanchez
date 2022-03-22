package com.example.pokeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PokeTipoHielo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poke_tipo_hielo)
        val bLugarUno = findViewById<Button>(R.id.bLugarUno)
        val bLugarDos = findViewById<Button>(R.id.bLugarDos)
        val bLugarTres = findViewById<Button>(R.id.bLugarTres)
        val bLugarCuatro = findViewById<Button>(R.id.bLugarCuatro)
        val bLugarCinco = findViewById<Button>(R.id.bLugarCinco)
        val bLugarSeis = findViewById<Button>(R.id.bLugarSeis)

        val bRegresarEstadosSin = findViewById<Button>(R.id.bRegresarEstadosSin)

        bLugarUno.setOnClickListener{
            var intent = Intent(this, TipoHielo::class.java)
            startActivity(intent)
        }

        bLugarDos.setOnClickListener{
            var intent = Intent(this, TipoHieloDos::class.java)
            startActivity(intent)
        }

        bLugarTres.setOnClickListener{
            var intent = Intent(this, TipoHieloTres::class.java)
            startActivity(intent)
        }

        bLugarCuatro.setOnClickListener{
            var intent = Intent(this, TipoHieloCuatro::class.java)
            startActivity(intent)
        }

        bLugarCinco.setOnClickListener{
            var intent = Intent(this, TipoHieloCinco::class.java)
            startActivity(intent)
        }

        bLugarSeis.setOnClickListener{
            var intent = Intent(this, TipoHieloSeis::class.java)
            startActivity(intent)
        }

        bRegresarEstadosSin.setOnClickListener {
            finish()
        }

    }
}