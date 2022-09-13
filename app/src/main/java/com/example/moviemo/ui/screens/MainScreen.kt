package com.example.moviemo.ui.screens

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.presentation.viewModel.MovieListViewModel


@Composable
fun MainScreen() {
    val navController = rememberNavController()
    BuildNavGraph(navController)
}

@Composable
fun BuildNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.MovieListScreen.path
    ) {
        composable(route = NavRoute.MovieListScreen.path) {
            val viewModel: MovieListViewModel = hiltViewModel()
            MovieListScreen(viewModel)
        }

    }
}