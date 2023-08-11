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
import android.widget.TableLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.electriccarapp.R
import com.example.electriccarapp.deira.CarFactory
import com.example.electriccarapp.presentacion.adapter.CarAdapter

class MainActivity : AppCompatActivity() {

    lateinit var btt_calcular: Button
    lateinit var lista_carros: RecyclerView
    lateinit var tableLayout: TableLayout
    lateinit var viewPager: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Lifecycle", "Create")
        setContentView(R.layout.activity_main)
        seTupViews()
        setupListeners()
        setupList()
        setupTabs()
    }


    fun seTupViews(){
        tableLayout  = findViewById(R.id.tab_layout)
        btt_calcular = findViewById(R.id.btt_calcular)
        lista_carros = findViewById(R.id.lista_carros)
        viewPager = findViewById(R.id.vp_view_pager)

    }

    fun setupList(){
        val adapter = CarAdapter(CarFactory.list)
        lista_carros.adapter = adapter
    }

    fun setupTabs(){
        val tabsAdapter = TabAdapter(this)
        viewPager.adapter = tabsAdapter


    }

    fun setupListeners(){
        btt_calcular.setOnClickListener {
            startActivity(Intent(this, CalcularAutonomiaActivity::class.java))

        }

    }

}