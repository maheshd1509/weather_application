package com.example.weatherapplication.repository

import com.example.weatherapplication.model.CurrentWeather
import com.example.weatherapplication.network.ApiService
import javax.inject.Inject

interface CurrentWeatherRepository {
    suspend fun getCurrentWeather(): Result<CurrentWeather>
}

class CurrentWeatherRepositoryImpl @Inject constructor(private val apiService: ApiService) :
    CurrentWeatherRepository {

    override suspend fun getCurrentWeather(): Result<CurrentWeather> {
        return apiService.getCurrentWeather()
    }


}