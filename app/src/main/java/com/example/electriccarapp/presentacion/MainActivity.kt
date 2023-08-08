package com.example.electriccarapp.presentacion

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ListView
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import com.example.electriccarapp.R

class MainActivity : AppCompatActivity() {

    lateinit var btt_calcular: Button
    lateinit var list_View: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        seTupViews()
        setupListeners()
        setupList()
    }
    fun seTupViews(){
        btt_calcular = findViewById(R.id.btt_calcular)
        list_View = findViewById(R.id.list_view)

    }

    fun setupList(){
        var dados = arrayOf(
            "lollipop", "donut", "cupcake", "Gingeberd"
        )
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, dados)
        list_View.adapter = adapter
    }

    fun setupListeners(){
        btt_calcular.setOnClickListener {
            startActivity(Intent(this, CalcularAutonomiaActivity::class.java))

        }

    }

}