package com.example.appclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var tvCiudad:TextView? =null
    var tvGrados:TextView? = null
    var tvEstatus:TextView? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCiudad = findViewById(R.id.tvCiudad)
        tvGrados = findViewById(R.id.tvGrados)
        tvEstatus = findViewById(R.id.tvEstatus)

        val ciudad = intent.getStringExtra("com.vidamrr.appclima.ciudades.CIUDAD")

        Toast.makeText(this,ciudad,Toast.LENGTH_SHORT).show()
        val ciudadmx=Ciudad("Ciudad de México", 30,"Soleado")
        val ciudadBerlin = Ciudad("Berlín",32,"Cielo despejado")
        val ciudadMorelos = Ciudad("Puerto Morelos",26,"Mayormente nublado")
        val ciudadCozumel = Ciudad("Cozumel",28,"Mayormente nublado")
        val ciudadAkumal = Ciudad("Akumal",34,"Soleado")

        when(ciudad){
            "ciudad-mexico" -> {tvCiudad?.text=ciudadmx.nombre
                tvGrados?.text=ciudadmx.grados.toString()+"°"
                tvEstatus?.text=ciudadmx.estatus}
            "ciudad-berlin" -> {
                tvCiudad?.text=ciudadBerlin.nombre
                tvGrados?.text=ciudadBerlin.grados.toString()+"°"
                tvEstatus?.text=ciudadBerlin.estatus}
            "ciudad-morelos" -> {
                tvCiudad?.text=ciudadMorelos.nombre
                tvGrados?.text=ciudadMorelos.grados.toString()+"°"
                tvEstatus?.text=ciudadMorelos.estatus}
            "ciudad-cozumel" -> {
                tvCiudad?.text=ciudadCozumel.nombre
                tvGrados?.text=ciudadCozumel.grados.toString()+"°"
                tvEstatus?.text=ciudadCozumel.estatus}
            "ciudad-akumal" -> {
                tvCiudad?.text=ciudadAkumal.nombre
                tvGrados?.text=ciudadAkumal.grados.toString()+"°"
                tvEstatus?.text=ciudadAkumal.estatus}

            else -> Toast.makeText(this,"No se encuentra la información", Toast.LENGTH_SHORT).show()
        }
    }
}