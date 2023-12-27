package com.example.weatherapplication.di

import com.example.weatherapplication.repository.CurrentWeatherRepository
import com.example.weatherapplication.repository.CurrentWeatherRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun provideCurrentWeatherRepo(impl: CurrentWeatherRepositoryImpl): CurrentWeatherRepository

}