package com.example.data.source

import com.example.data.models.AttributesEntity
import com.example.data.repository.MovieCache
import com.example.data.repository.MovieDataSource
import com.example.data.repository.MovieRemote
import javax.inject.Inject

class MovieCacheDataSource @Inject constructor(private val movieCache: MovieCache) :
    MovieDataSource {
    override suspend fun getMovies(query: String): List<AttributesEntity> {
        return movieCache.getMovies(query)
    }

    override suspend fun saveMovie(movie: AttributesEntity) {
        movieCache.saveMovies(movie)
    }

    override suspend fun isCached(): Boolean {
        return movieCache.isCached()
    }
}