package com.example.moviemo.ui.screens

sealed class NavRoute(val path: String) {

    object MovieListScreen : NavRoute("Movie_List_Screen")
}