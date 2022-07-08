package com.test.weatherapp_jetpackcompose_mvi.presentation

import com.test.weatherapp_jetpackcompose_mvi.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
) {
}