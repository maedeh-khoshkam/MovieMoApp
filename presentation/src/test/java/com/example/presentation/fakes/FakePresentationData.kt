package com.example.presentation.fakes

import com.example.domain.models.*


object FakePresentationData {
    private val movieIds = ArrayList<String>()
    private val movieTitle = ArrayList<String>()
    private val movies = mutableListOf<Attributes>()

    init {

        movieIds.add("12")
        movieIds.add("55")
        movieIds.add("44")
        movieIds.add("5")
        movieIds.add("8")
        movieIds.add("9")
        movieIds.add("33")

        movieTitle.add("movieTitle1")
        movieTitle.add("movieTitle1")
        movieTitle.add("movieTitle1")
        movieTitle.add("movieTitle1")
        movieTitle.add("movieTitle2")
        movieTitle.add("movieTitle3")
        movieTitle.add("movieTitle4")
        movieTitle.add("movieTitle5")
        movieTitle.add("movieTitle6")
        movieTitle.add("movieTitle7")
        movieTitle.add("movieTitle8")
        movieTitle.add("movieTitle9")


        repeat(50) {
            movies.add(createMovie())
        }
    }


    fun getMovies(
        query: String
    ): List<Attributes> {

        return movies.filter { it.movieTitle?.contains(query) ?: false }
    }

    fun createMovie(): Attributes {

        return Attributes(movieId = movieIds.random(), movieTitle = movieTitle.random())
    }

}