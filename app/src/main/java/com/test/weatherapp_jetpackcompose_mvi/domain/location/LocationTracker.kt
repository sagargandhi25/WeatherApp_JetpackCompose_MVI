package com.test.weatherapp_jetpackcompose_mvi.domain.location

import android.location.Location

interface LocationTracker {

    suspend fun getCurrentLocation(): Location?
}