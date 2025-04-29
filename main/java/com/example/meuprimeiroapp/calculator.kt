package com.example.meuprimeiroapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class calculator : AppCompatActivity() {
    lateinit var valor1: EditText
    lateinit var valor2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        valor1 = findViewById(R.id.valor1)
        valor2 = findViewById(R.id.valor2)

        val botaoSoma : Button = findViewById(R.id.botaoSoma)
        botaoSoma.setOnClickListener{
            var num1 = valor1.text.toString().toInt()
            var num2 = valor2.text.toString().toInt()
            val resultado = num1 + num2
            Toast.makeText(this,
                "Resultado: $resultado",
                Toast.LENGTH_LONG).show()
        }
        val botaoMenor : Button = findViewById(R.id.botaoMenor)
        botaoMenor.setOnClickListener{
            var num1 = valor1.text.toString().toInt()
            var num2 = valor2.text.toString().toInt()
            val resultado = num1 - num2
            Toast.makeText(this,
                "Resultado: $resultado",
                Toast.LENGTH_LONG).show()
        }
        val botaoVezes : Button = findViewById(R.id.botaoVezes)
        botaoVezes.setOnClickListener{
            var num1 = valor1.text.toString().toInt()
            var num2 = valor2.text.toString().toInt()
            val resultado = num1 * num2
            Toast.makeText(this,
                "Resultado: $resultado",
                Toast.LENGTH_LONG).show()
        }
        val botaoDividir : Button = findViewById(R.id.botaoDividir)
        botaoDividir.setOnClickListener{
            var num1 = valor1.text.toString().toInt()
            var num2 = valor2.text.toString().toInt()
            val resultado = num1 / num2
            Toast.makeText(this,
                "Resultado: $resultado",
                Toast.LENGTH_LONG).show()
        }
    }
}
