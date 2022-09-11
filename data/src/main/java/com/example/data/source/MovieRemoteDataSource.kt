package com.example.data.source

import com.example.data.models.AttributesEntity
import com.example.data.repository.MovieDataSource
import com.example.data.repository.MovieRemote
import javax.inject.Inject

class MovieRemoteDataSource @Inject constructor(private val movieRemote: MovieRemote) :
    MovieDataSource {
    override suspend fun getMovies(query: String): List<AttributesEntity> {
        return movieRemote.getMovies(query)
    }

    override suspend fun saveMovie(movies: AttributesEntity) {
        throw UnsupportedOperationException("Save character is not supported for RemoteDataSource.")
    }

    override suspend fun isCached(): Boolean {
        throw UnsupportedOperationException("Cache is not supported for RemoteDataSource.")
    }
}