package com.example.data.source

import com.example.data.models.AttributesEntity
import com.example.data.repository.MovieDataSource
import javax.inject.Inject

class MovieDataSourceFactory @Inject constructor(
    private val movieCacheDataSource: MovieCacheDataSource,
    private val movieRemoteDataSource: MovieRemoteDataSource
) {
    fun getDataStore(isCache: Boolean): MovieDataSource {
        return if (isCache) {
            getCacheDataSource()
        } else {
            getRemoteDataSource()
        }
    }

    fun getRemoteDataSource(): MovieDataSource {
        return movieRemoteDataSource
    }

    fun getCacheDataSource(): MovieDataSource {
        return movieCacheDataSource
    }

}