package com.example.weatherapplication.usecase

import com.example.weatherapplication.repository.CurrentWeatherRepository
import com.example.weatherapplication.model.CurrentWeather
import javax.inject.Inject

class CurrentWeatherUseCase @Inject constructor(private val repositories : CurrentWeatherRepository) {
    suspend fun getCurrentWeather() : Result<CurrentWeather> = repositories.getCurrentWeather()

}