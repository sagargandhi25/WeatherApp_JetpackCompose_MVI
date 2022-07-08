package com.test.weatherapp_jetpackcompose_mvi.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import com.test.weatherapp_jetpackcompose_mvi.data.mappers.toWeatherInfo
import com.test.weatherapp_jetpackcompose_mvi.data.remote.WeatherApi
import com.test.weatherapp_jetpackcompose_mvi.domain.repository.WeatherRepository
import com.test.weatherapp_jetpackcompose_mvi.domain.util.Resource
import com.test.weatherapp_jetpackcompose_mvi.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
): WeatherRepository {
    @RequiresApi(Build.VERSION_CODES.O)
    override suspend fun getWeatherData(lat: Double, lng: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
               data = api.getWeatherData(
                   lat = lat,
                   lng = lng
               ).toWeatherInfo()
            )
        } catch (e:Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occured.")
        }
    }
}