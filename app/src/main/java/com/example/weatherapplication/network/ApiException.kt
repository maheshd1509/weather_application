package com.example.weatherapplication.network

class ApiException(val code: String? = null, message: String? = null, localMessage: String? = null) : RuntimeException(message)
