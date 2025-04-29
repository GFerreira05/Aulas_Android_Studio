package com.example.meuprimeiroapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class TelaDeLogin : AppCompatActivity() {
    lateinit var login: EditText
    lateinit var senha: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_de_login)

        login = findViewById(R.id.login)
        senha = findViewById(R.id.senha)

        val botaoLogar: Button = findViewById(R.id.botaoLogar)
        botaoLogar. setOnClickListener{
            var user = login.text.toString()
            var pass = senha.text.toString()

            if (verifica(user, pass)){
                Toast.makeText(this,"Bem vindo admin",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"Credencial não autorizada",Toast.LENGTH_LONG).show()
            }
        }

        val botaoLimpar: Button = findViewById(R.id.botaoLimpar)
        botaoLimpar.setOnClickListener {
            login.setText("")
            senha.setText("")
        }
    }
    private fun verifica (user: String, pass: String): Boolean{
        return user == "admin" && pass == "1234"

    }


}