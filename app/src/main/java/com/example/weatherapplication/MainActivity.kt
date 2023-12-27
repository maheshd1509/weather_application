package com.example.weatherapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.example.weatherapplication.ui.theme.WeatherApplicationTheme
import com.example.weatherapplication.ui.view.CurrentWeatherScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherApplicationTheme {
                // A surface container using the 'background' color from the theme
                MainScreen()
            }
        }
    }


    @Composable
    fun MainScreen() {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = { TopBar(getString(R.string.current_weather)) },
            content = { padding ->
                Box(modifier = Modifier.padding(padding)) {
                    CurrentWeatherScreen()
                }
            },
        )
    }

    @Composable
    fun TopBar(title: String) {
        TopAppBar(
            title = {
                androidx.compose.material.Text(
                    text = title,
                    fontSize = 18.sp,
                    color = MaterialTheme.colors.onBackground
                )
            },
            contentColor = MaterialTheme.colors.onBackground
        )
    }
}
