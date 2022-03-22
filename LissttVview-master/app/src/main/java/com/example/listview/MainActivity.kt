package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        var frutas:ArrayList<Fruta> = ArrayList()
        frutas.add(Fruta("Fuego", R.drawable.fuego))
        frutas.add(Fruta("Agua", R.drawable.agua))
        frutas.add(Fruta("Planta", R.drawable.planta))
        frutas.add(Fruta("Electrico", R.drawable.electrico))
        frutas.add(Fruta("Fantasma", R.drawable.bicho))
        frutas.add(Fruta("Oscuro", R.drawable.oscuro))

        val lista = findViewById<ListView>(R.id.lista)

        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        val adaptador = AdaptadorCostum(this, frutas)

        lista.adapter = adaptador

        lista.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, frutas.get(position).nombre, Toast.LENGTH_LONG).show()
        }
    }
}
