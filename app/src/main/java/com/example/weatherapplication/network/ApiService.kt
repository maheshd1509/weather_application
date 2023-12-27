package com.example.weatherapplication.network

import com.example.weatherapplication.model.CurrentWeather
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("forecast.json")
    suspend fun getCurrentWeather(
        @Query("key") key: String = BaseURL.apiKey,
        @Query("q") location: String = "Pune",
        @Query("days") days: String = "1",
        @Query("aqi") aqi: String = "no",
        @Query("alerts") alerts: String = "no",
    ): Result<CurrentWeather>

}