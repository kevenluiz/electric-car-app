package com.example.electriccarapp.deira
import com.example.electriccarapp.dominio.Carro


object CarFactory {

    val list = listOf(
        Carro(
            id = 1,
        preco = "R$ 150.000,00",
        bateria = "500 kWh",
        potencia = "100Cv",
        recarga = "2:00 Hr/min",
        urlPhoto = "www.google.com.br"),
    Carro(
    id = 2,
    preco = "R$ 250.000,00",
    bateria = "700 kWh",
    potencia = "200Cv",
    recarga = "1:30 Hr/min",
    urlPhoto = "www.google.com.br"),
    Carro(
    id = 3,
    preco = "R$ 300.000,00",
    bateria = "750 kWh",
    potencia = "250Cv",
    recarga = "1:15 Hr/min",
    urlPhoto = "www.google.com.br"),
    Carro(
    id = 4,
    preco = "R$ 450.000,00",
    bateria = "850 kWh",
    potencia = "350Cv",
    recarga = "40 min",
    urlPhoto = "www.google.com.br"),
    )
}