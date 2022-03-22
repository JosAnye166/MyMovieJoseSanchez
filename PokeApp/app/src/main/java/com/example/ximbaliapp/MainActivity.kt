package com.example.ximbaliapp

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

        //usuario y contra admin admin
        loginbtn.setOnClickListener {
            if (username.text.toString() == "admin" && password.text.toString() == "admin") {
                //correct

                Toast.makeText(this@MainActivity, "Sesion iniciad,  redirigiendo!", Toast.LENGTH_SHORT)
                    .show()
                var intent = Intent(this, ListEstados::class.java)
                startActivity(intent)
            } else  //incorrect
                Toast.makeText(
                    this@MainActivity,
                    "Sesion fallida, revise sus datos.!!!",
                    Toast.LENGTH_SHORT
                ).show()
        };


    }
}