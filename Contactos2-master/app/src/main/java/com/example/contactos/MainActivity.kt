package com.example.contactos

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.*
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    var lista: ListView? = null
    var grid: GridView? = null
    var viewSwitcher: ViewSwitcher? = null

    companion object {
        var contacto: ArrayList<Contacto>? = null
        var adapter: AdaptadorCustom? = null
        var adaptergrid: AdaptadorCustom? = null
        fun agregarCon(contactos: Contacto) {
            adapter?.addItem(contactos)
        }

        fun obtenerContacto(index: Int): Contacto {
            return adapter?.getItem(index) as Contacto
        }

        fun eliminarContacto(index: Int) {
            adapter?.removeItem(index)
        }

        fun actualizarContacto(index: Int, nuevoContacto: Contacto) {
            adapter?.updateItem(index, nuevoContacto)
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewSwitcher = findViewById<ViewSwitcher>(R.id.cambiaVista)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        contacto = ArrayList()
        contacto!!.add(
            Contacto(
                "Dylan",
                "Lopez",
                "Telmex",
                17, 90.0F,
                "Felipe Carrillo Puerto 77229",
                "9837536571",
                "dylanlopeztut@gmail.com",
                R.drawable.foto_02
            )
        )
        contacto!!.add(
            Contacto(
                "Maria",
                "Herrera",
                "Zara",
                18,
                55.0F,
                "Felipe Carrillo Puerto 77210",
                "9837536571",
                "Maria354@gmail.com",
                R.drawable.foto_01
            )
        )
        contacto!!.add(
            Contacto(


                "Gael",
                "Fernandes",
                "Google",
                18,
                60.0F,
                "Felipe Carrillo Puerto 77220",
                "9837536571",
                "Gael346@gmail.com",
                R.drawable.foto_03
            )
        )
        contacto!!.add(
            Contacto(
                "Estrella",
                "Flot",
                "Oxxo",
                18,
                55.0F,
                "Felipe Carrillo Puerto 77200",
                "9837535375",
                "Estrella5755@gmail.com",
                R.drawable.foto_05
            )
        )
        contacto!!.add(
            Contacto(
                "Rosi",
                "Ek",
                "Boshito",
                18,
                55.0F,
                "Felipe Carrillo Puerto 7721",
                "9837536571",
                "Rosi@gmail.com",
                R.drawable.foto_04
            )
        )


        lista = findViewById<ListView>(R.id.lista)
        grid = findViewById<GridView>(R.id.grid)
        adapter = AdaptadorCustom(this, contacto!!, "list")
        adaptergrid = AdaptadorCustom(this, contacto!!,"grid")
        viewSwitcher = findViewById<ViewSwitcher>(R.id.cambiaVista)
        lista?.adapter = adapter
        grid?.adapter = adaptergrid

        lista?.setOnItemClickListener { parent, view, position, id ->

            val intent = Intent(this, Detalle::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)


        }
        grid?.setOnItemClickListener { parent, view, position, id ->

            val intent = Intent(this, Detalle::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)


        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        val search = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        val buscar = menu?.findItem(R.id.searchview)
        val searchView = buscar?.actionView as SearchView

        val itemswitch = menu?.findItem(R.id.swicthview)

        itemswitch?.setActionView(R.layout.switch_item)
        val switchView = itemswitch?.actionView?.findViewById<Switch>(R.id.switchCambia)

        searchView.setSearchableInfo(search.getSearchableInfo(componentName))
        searchView.queryHint = "Buscar contacto"
        searchView.setOnQueryTextFocusChangeListener { v, hasFocus ->
            {

            }
            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                override fun onQueryTextChange(newText: String?): Boolean {
                    adapter?.filtrar(newText!!)
                    return true
                }

                override fun onQueryTextSubmit(p0: String?): Boolean {
                    TODO("Not yet implemented")
                }
            })

        }
        switchView?.setOnCheckedChangeListener { buttonView, isChecked ->
            viewSwitcher?.showNext()
        }



        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {
            R.id.newview -> {
                val intent = Intent(this, Nuevo::class.java)
                startActivity(intent)
                return true

            }
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }

    }

    override fun onResume() {
        super.onResume()
        adapter?.notifyDataSetChanged()
    }

}



