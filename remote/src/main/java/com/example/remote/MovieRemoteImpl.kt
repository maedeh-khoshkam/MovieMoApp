package com.example.remote

import com.example.data.models.AttributesEntity
import com.example.data.repository.MovieRemote
import com.example.remote.api.MovieService
import com.example.remote.mapper.mapFromModel
import com.example.remote.models.AttributesModel
import javax.inject.Inject

class MovieRemoteImpl @Inject constructor(private val movieService: MovieService) : MovieRemote {
    override suspend fun getMovies(query: String): List<AttributesEntity> {
        return movieService.getMovies(query).data.mapFromModel()
    }


}
