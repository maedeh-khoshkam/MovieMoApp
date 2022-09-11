package com.example.data.repository

import com.example.data.models.AttributesEntity

interface MovieDataSource {

    // Remote and cache
    suspend fun getMovies(query: String): List<AttributesEntity>

    // Cache
    suspend fun saveMovie(movie: AttributesEntity)
    suspend fun isCached(): Boolean
}