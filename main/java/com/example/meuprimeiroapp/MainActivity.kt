package com.example.meuprimeiroapp

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val botaoCalculadora: Button = findViewById(R.id.Calculator)
        botaoCalculadora.setOnClickListener{
            var intent = Intent(this,calculator()::class.java)
            startActivity(intent)
        }

        val botaoLogin: Button = findViewById(R.id.TelaDeLogin)
        botaoLogin.setOnClickListener{
            var intent = Intent(this,TelaDeLogin()::class.java)
            startActivity(intent)
        }

        val botaoFormEnvio: Button = findViewById(R.id.FormEnvio)
        botaoFormEnvio.setOnClickListener{
            var intent = Intent(this,envios_dados()::class.java)
            startActivity(intent)
        }

        val botaoClone: Button = findViewById(R.id.Clone)
        botaoClone.setOnClickListener{
            var intent = Intent(this,tela_clone()::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun lista(view: View){
        var intent = Intent(this,lista()::class.java)
        startActivity(intent)
    }
    fun listaburra(view: View){
        var intent = Intent(this,lista_fixa()::class.java)
        startActivity(intent)
    }
    fun carregamento(view: View){
        var intent = Intent(this,carregamento()::class.java)
        startActivity(intent)
    }

}
