package com.example.cache

import com.example.data.models.AttributesEntity
import com.example.data.repository.MovieCache
import javax.inject.Inject

class MovieCacheImpl @Inject constructor():MovieCache {
    override suspend fun getMovies(query: String): List<AttributesEntity> {
        TODO("Not yet implemented")
    }

    override suspend fun saveMovies(movies: AttributesEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun isCached(): Boolean {
        TODO("Not yet implemented")
    }
}