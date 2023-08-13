package com.example.electriccarapp.presentacion

import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.loader.content.AsyncTaskLoader
import com.example.electriccarapp.R
import java.net.HttpURLConnection
import java.net.URL

class CalcularAutonomiaActivity : AppCompatActivity() {
    lateinit var preco: EditText
    lateinit var kmPercorrido: EditText
    lateinit var resultado: TextView
    lateinit var btt_calcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculcar_autonomia)
        setupView()
        setupListeners()

    }

    fun setupView() {
        preco = findViewById(R.id.preco_Kwh)
        kmPercorrido = findViewById(R.id.km_percorrido)
        resultado = findViewById(R.id.tv_resultado)
        btt_calcular = findViewById(R.id.btt_calcular)


    }

    fun setupListeners() {
        btt_calcular.setOnClickListener {

            calcular()

        }
    }

    fun calcular() {
        val preco = preco.text.toString().toFloat()
        val km = kmPercorrido.text.toString().toFloat()
        val result = preco / km

        resultado.text = result.toString()

    }
}