package com.example.electriccarapp.presentacion

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.electriccarapp.R
import com.example.electriccarapp.deira.CarFactory
import com.example.electriccarapp.presentacion.adapter.CarAdapter

class CarFragment : Fragment() {

    lateinit var btt_calcular: Button
    lateinit var lista_carros: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.car_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView(view)
        setupList()
    }

    fun setupView(view: View){
        view.apply {
            btt_calcular = findViewById(R.id.btt_calcular)
            lista_carros = findViewById(R.id.lista_carros)
        }
    }
    fun setupList(){
        val adapter = CarAdapter(CarFactory.list)
        lista_carros.adapter = adapter
    }
    fun setupListeners() {
        btt_calcular.setOnClickListener {
            //startActivity(Intent(this, CalcularAutonomiaActivity::class.java))

        }
    }
}