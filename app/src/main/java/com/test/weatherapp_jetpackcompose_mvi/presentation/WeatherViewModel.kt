package com.test.weatherapp_jetpackcompose_mvi.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.test.weatherapp_jetpackcompose_mvi.domain.location.LocationTracker
import com.test.weatherapp_jetpackcompose_mvi.domain.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val repository: WeatherRepository,
    private val locationTracker: LocationTracker
): ViewModel() {

    var state by mutableStateOf(WeatherState())
    private set
    //so only viewmodel can change this

    fun loadWeatherInfo() {
        
    }
}