package com.example.data.repository

import com.example.data.models.AttributesEntity

interface MovieCache {

    suspend fun getMovies(query: String): List<AttributesEntity>
    suspend fun saveMovies(movies: AttributesEntity)
    suspend fun isCached(): Boolean
}