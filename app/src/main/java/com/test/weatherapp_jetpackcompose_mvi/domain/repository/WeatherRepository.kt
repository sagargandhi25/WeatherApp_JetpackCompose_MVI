package com.test.weatherapp_jetpackcompose_mvi.domain.repository

import com.test.weatherapp_jetpackcompose_mvi.domain.util.Resource
import com.test.weatherapp_jetpackcompose_mvi.domain.weather.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherData(lat: Double, lng: Double): Resource<WeatherInfo>
}