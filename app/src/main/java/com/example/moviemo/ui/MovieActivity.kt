package com.example.moviemo.ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.bark.ui.theme.MovieMoTheme
import com.example.moviemo.base.BaseActivity
import com.example.moviemo.ui.screens.MainScreen
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MovieActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieMoTheme {
                MyApp()
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MyApp() {
    Scaffold(content = { MainScreen() })
}