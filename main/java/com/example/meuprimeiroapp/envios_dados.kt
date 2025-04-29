package com.example.meuprimeiroapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class envios_dados : AppCompatActivity() {

    lateinit var envioDados : EditText//inicia uma variavel vazia que se relaciona com um campo texto

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_envios_dados)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val BotaoEnviar : Button = findViewById(R.id.EnvioInformacao)//funcao um click
        BotaoEnviar.setOnClickListener({
            envioDados = findViewById(R.id.envioDados)//busco um id  do botao front
            var intent = Intent(this,recepcao_dados::class.java)//abro uma tela activity
            intent.putExtra("",envioDados.text.toString())//busco e guardo os dados digitalizados no campo texto
            startActivity(intent)//abro uma telaggui

        })

    }
}