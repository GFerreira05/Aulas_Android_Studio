package com.example.meuprimeiroapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class lista : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lista)

        val arrayAdapter: ArrayAdapter<*>
        //iniciando o adapter de tipo Adaptor
        val compras = arrayOf("Batata", "Feijão", "Ovo", "Carne",
            "Sabao em Pó")
        //variavel que recebe um array
        var listaDeCompras = findViewById<ListView>(R.id.listaCompra)
        // variavel que recebe a conexao da lista com o front end
        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,compras)
        //onde montar, o que montar e o que tem dentro
        listaDeCompras.adapter = arrayAdapter
        //variavel atualizada com o que tem no adapter
    }
}
