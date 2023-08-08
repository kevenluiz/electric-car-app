package com.example.electriccarapp.presentacion

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import com.example.electriccarapp.R

class MainActivity : AppCompatActivity() {
    lateinit var preco : EditText
    lateinit var km_percorrido: EditText
    lateinit var btt_calcular: Button
    lateinit var resultado: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        seTupViews()
        setupListeners()
    }

    fun seTupViews(){
        preco = findViewById(R.id.preco_Kwh)
        km_percorrido = findViewById(R.id.km_percorrido)
        resultado = findViewById(R.id.tv_resultado)
        btt_calcular = findViewById(R.id.btt_calcular)

    }

    fun setupListeners(){
        btt_calcular.setOnClickListener{
            calcular()
        }

    }
    fun calcular(){
        val preco = preco.text.toString().toFloat()
        val km = km_percorrido.text.toString().toFloat()
        val result = preco/km

        resultado.text = result.toString()


    }



}