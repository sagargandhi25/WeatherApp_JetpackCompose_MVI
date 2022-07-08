package com.test.weatherapp_jetpackcompose_mvi.di

import com.test.weatherapp_jetpackcompose_mvi.data.location.DefaultLocationTracker
import com.test.weatherapp_jetpackcompose_mvi.data.repository.WeatherRepositoryImpl
import com.test.weatherapp_jetpackcompose_mvi.domain.location.LocationTracker
import com.test.weatherapp_jetpackcompose_mvi.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository
}