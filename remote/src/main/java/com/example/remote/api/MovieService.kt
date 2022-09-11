package com.example.remote.api

import com.example.remote.models.AttributesModel
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieService {

    @GET("/api/en/v1/movie/movie/list/tagid/1000300/text/{Query}/sug/on")
    suspend fun getMovies(@Path("Query") query: String): List<AttributesModel>
}