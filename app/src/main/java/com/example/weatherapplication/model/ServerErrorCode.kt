package com.example.weatherapplication.model

enum class ServerErrorCode(val description: String) {

    DEFAULT("Unknown Error");

    companion object {
        fun parse(errorCode: String) =
            values().find { it.name == errorCode.trim().uppercase() } ?: DEFAULT
    }
}