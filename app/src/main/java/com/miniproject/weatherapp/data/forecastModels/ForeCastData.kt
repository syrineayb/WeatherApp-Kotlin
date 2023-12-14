package com.miniproject.weatherapp.data.forecastModels

import com.miniproject.wseatherapp.data.forecastModels.Main

data class ForecastData (
    val clouds: Clouds,
    val dt: Int,
    val dt_txt: String,
    val main: Main,
    val pop: Int,
    val sys: Sys,
    val visibility: Int,
    val weather: List<Weather>,
    val wind: Wind
)