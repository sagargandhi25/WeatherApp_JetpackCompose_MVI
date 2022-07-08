package com.test.weatherapp_jetpackcompose_mvi.di

import com.test.weatherapp_jetpackcompose_mvi.data.location.DefaultLocationTracker
import com.test.weatherapp_jetpackcompose_mvi.domain.location.LocationTracker
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class LocationModule {

    @Binds
    @Singleton
    abstract fun bindLocationTracker(defaultLocationTracker: DefaultLocationTracker): LocationTracker
}