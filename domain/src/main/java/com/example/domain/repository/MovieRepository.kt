package com.example.domain.repository

import com.example.domain.models.Attributes
import kotlinx.coroutines.flow.Flow

interface MovieRepository {

    // Remote and cache
    suspend fun getMovies(query: String): Flow<List<Attributes>>

    // Cache
    suspend fun saveMovie(movie: Attributes)
}