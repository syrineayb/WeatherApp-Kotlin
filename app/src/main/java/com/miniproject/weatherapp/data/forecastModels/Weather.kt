package com.miniproject.weatherapp.data.forecastModels

data class Weather(
    val description: String,
    val icon: String,
    val id: Int,
    val main: String
)