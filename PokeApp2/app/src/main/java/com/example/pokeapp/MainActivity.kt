package com.example.pokeapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val username = findViewById<View>(R.id.username) as TextView
        val password = findViewById<View>(R.id.password) as TextView
        val loginbtn = findViewById<View>(R.id.loginbtn) as MaterialButton

        //usuario y contra
        loginbtn.setOnClickListener {
            if (username.text.toString() == "jose" && password.text.toString() == "123424") {
                //correct

                Toast.makeText(this@MainActivity, "Sesion inicia,  redirigiendo", Toast.LENGTH_SHORT)
                    .show()
                var intent = Intent(this, ListEstados::class.java)
                startActivity(intent)
            } else  //incorrect
                Toast.makeText(
                    this@MainActivity,
                    "Algo anda mal, Favor de comprobar sus datos.!!!",
                    Toast.LENGTH_SHORT
                ).show()
        };


    }
}